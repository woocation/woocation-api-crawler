/**
 * 
 */
package com.woocation.reader;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.woocation.model.Country;

/**
 * The Class CountryReader.
 *
 * @author ankit
 */
public class CountryReader {


	/** The country data. */
	private Map<String, Country> countryData = null;
	
	/**
	 * Instantiates a new country reader.
	 */
	public CountryReader() {
	}

	/**
	 * Load country data.
	 *
	 * @param countryFile the country file
	 * @return the map
	 */
	public Map<String, Country> loadCountryData(String countryFile) {
		try {
			List<String> allLine = Files.readAllLines(Paths.get(countryFile));
			countryData = processCountryData(allLine);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return countryData;
	}

	/**
	 * Process country data.
	 *
	 * @param data the data
	 * @return the map
	 */
	private Map<String, Country> processCountryData(List<String> data) {
		Map<String, Country> countryData = new HashMap<>();
		for (String dataLine : data) {
			String[] dataRow = dataLine.split(",");
			Country country = new Country(dataRow[0], dataRow[1], dataRow[2], dataRow[3]);
			countryData.put(dataRow[1], country);
		}
		return countryData;
	}

	/**
	 * Gets the country data.
	 *
	 * @return the countryData
	 */
	public Map<String, Country> getCountryData() {
		return countryData;
	}

}
