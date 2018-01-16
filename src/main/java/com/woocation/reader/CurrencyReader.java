package com.woocation.reader;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.woocation.model.CountryCurrency;

public class CurrencyReader {

	private Map<String, CountryCurrency> currencyMap = null;

	public CurrencyReader() {
	}

	/**
	 * Load country data.
	 *
	 * @param countryFile
	 *            the country file
	 * @return the map
	 */
	public Map<String, CountryCurrency> loadCountryCurrencyData(String countryCurrencyFile) {
		try {
			List<String> allLine = Files.readAllLines(Paths.get(countryCurrencyFile));
			currencyMap = processCurrencyData(allLine);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currencyMap;
	}

	/**
	 * Process country data.
	 *
	 * @param data
	 *            the data
	 * @return the map
	 */
	private Map<String, CountryCurrency> processCurrencyData(List<String> data) {
		Map<String, CountryCurrency> currentyMap = new HashMap<>();
		for (String dataLine : data) {
			try {
				String[] dataRow = dataLine.split(",");
				CountryCurrency cc = new CountryCurrency(dataRow[0], dataRow[1], dataRow[2], dataRow[3]);
				currentyMap.put(dataRow[0].toUpperCase(), cc);
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
	public Map<String, CountryCurrency> getCurrencyData() {
		return currencyMap;
	}
}
