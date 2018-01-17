package com.woocation.reader;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.woocation.model.EuropeanCountry;

/**
 * The Class EuropeanReader.
 */
public class EuropeanReader {

	/** The euro map. */
	private Map<String, EuropeanCountry> euroMap = null;

	/**
	 * Instantiates a new european reader.
	 */
	public EuropeanReader() {
	}

	/**
	 * Load country data.
	 *
	 * @param europeCountry
	 *            the europe country
	 * @return the map
	 */
	public Map<String, EuropeanCountry> loadEuropeCountryData(String europeCountry) {
		try {
			List<String> allLine = Files.readAllLines(Paths.get(europeCountry));
			euroMap = processEuropeCountryData(allLine);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return euroMap;
	}

	/**
	 * Process country data.
	 *
	 * @param data
	 *            the data
	 * @return the map
	 */
	private Map<String, EuropeanCountry> processEuropeCountryData(List<String> data) {
		Map<String, EuropeanCountry> currentyMap = new HashMap<>();
		for (String dataLine : data) {
			try {
				String[] dataRow = dataLine.split(",");
				
				boolean isEurope = dataRow[2].equalsIgnoreCase("Yes") ? true : false;
				boolean isSchengen = dataRow[3].equalsIgnoreCase("Yes") ? true : false;
				EuropeanCountry euCountry = new EuropeanCountry(dataRow[0], dataRow[1], isEurope, isSchengen);
				currentyMap.put(dataRow[1], euCountry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return currentyMap;
	}

	/**
	 * Gets the country data.
	 *
	 * @return the countryData
	 */
	public Map<String, EuropeanCountry> getCurrencyData() {
		return euroMap;
	}
}
