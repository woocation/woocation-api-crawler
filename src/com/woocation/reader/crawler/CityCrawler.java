package com.woocation.reader.crawler;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.woocation.model.Admin1Code;
import com.woocation.model.Country;
import com.woocation.model.CountryCurrency;
import com.woocation.model.EuropeanCountry;
import com.woocation.reader.Admin1CodeReader;
import com.woocation.reader.CountryReader;
import com.woocation.reader.CurrencyReader;
import com.woocation.reader.EuropeanReader;

/**
 * The Class CityCrawler.
 */
public class CityCrawler {

	/** The country. */
	private CountryReader countryReader = null;

	/** The admin 1 reader. */
	private Admin1CodeReader admin1Reader = null;

	/** The curr reader. */
	private CurrencyReader currReader = null;

	/** The euro. */
	private EuropeanReader euro = null;

	/** The builder. */
	private StringBuilder builder = new StringBuilder();

	/** The key city map. */
	private Set<String> keyCityMap = new HashSet<>();

	/** The duplicate keys. */
	private StringBuilder duplicateKeys = new StringBuilder();

	/**
	 * Instantiates a new city crawler.
	 */
	public CityCrawler() {

	}

	/**
	 * Instantiates a new city crawler.
	 *
	 * @param country
	 *            the country
	 * @param admin1Reader
	 *            the admin 1 reader
	 */
	public CityCrawler(CountryReader country, Admin1CodeReader admin1Reader, CurrencyReader currReader,
			EuropeanReader euro) {
		this.countryReader = country;
		this.admin1Reader = admin1Reader;
		this.currReader = currReader;
		this.euro = euro;
	}

	public void findDuplicate(String path) {
		try {
			List<String> allLines = java.nio.file.Files.readAllLines(new File(path).toPath());
			for (String line : allLines) {
				checkDuplicateKey(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Check duplicate key.
	 *
	 * @param dataLine
	 *            the data line
	 */
	private void checkDuplicateKey(String dataLine) {
		try {
			String[] dataRow = dataLine.split("\t");
			// El Tarter#El Tarter#Canillo#AD#Andorra
			String key = dataRow[1] + "#" + dataRow[2] + "#" + dataRow[10] + "#" + dataRow[19] + "#" + dataRow[8] + "#"
					+ dataRow[20];
			if (!keyCityMap.contains(key)) {
				keyCityMap.add(key);
			} else {
				duplicateKeys.append(dataRow[0] + "-->" + key + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/**
	 * Gets the geo city list.
	 *
	 * @param path
	 *            the path
	 * @return
	 * @return the geo city list
	 * @throws Exception
	 *             the exception
	 */
	public void doCrawl(final String path) {
		try {
			List<String> allLines = java.nio.file.Files.readAllLines(new File(path).toPath());
			for (String line : allLines) {
				processCityLine(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the city es bean.
	 *
	 * @param dataRow
	 *            the data row
	 * @return the city es bean
	 */
	private void processCityLine(String dataLine) {
		try {
			String[] dataRow = dataLine.split("\t");

			// if(dataRow[0].equalsIgnoreCase("3513146")){
			// System.out.println("ANkit");
			// }
			String countryCode = dataRow[8];
			String admin1Code = dataRow[10];
			String adminKey = countryCode + "." + admin1Code;
			Admin1Code admin1Reference = admin1Reader.getAdmin1Data().get(adminKey);

			StringBuilder lineBuider = new StringBuilder();
			lineBuider.append(dataLine);

			if (admin1Reference != null) {
				lineBuider.append("\t");
				lineBuider.append(admin1Reference.getName());
			} else {
				lineBuider.append("\t");
				lineBuider.append(" ");
				System.out.println("Admin Key --> " + adminKey);
			}

			Country country = countryReader.getCountryData().get(countryCode);
			if (country != null) {
				lineBuider.append("\t");
				lineBuider.append(country.getCountryName());
				lineBuider.append("\t");
				lineBuider.append(country.getCc3());
			} else {
				lineBuider.append("\t");
				lineBuider.append(" ");
				lineBuider.append("\t");
				lineBuider.append(" ");
			}

			if (country != null && country.getCountryName() != null) {
				CountryCurrency currency = currReader.getCurrencyData().get(country.getCountryName().toUpperCase());
				if (currency != null) {
					lineBuider.append("\t");
					lineBuider.append(currency.getCurrencyName());
					lineBuider.append("\t");
					lineBuider.append(currency.getCurrencyCode());
				} else {
					lineBuider.append("\t");
					lineBuider.append(" ");
					lineBuider.append("\t");
					lineBuider.append(" ");
				}
			} else {
				lineBuider.append("\t");
				lineBuider.append(" ");
				lineBuider.append("\t");
				lineBuider.append(" ");
			}

			EuropeanCountry euroCountry = euro.getCurrencyData().get(countryCode);
			if (euroCountry != null) {
				lineBuider.append("\t");
				lineBuider.append(euroCountry.isEuropean());
				lineBuider.append("\t");
				lineBuider.append(euroCountry.isSchengen());
			} else {
				lineBuider.append("\t");
				lineBuider.append("NA");
				lineBuider.append("\t");
				lineBuider.append("NA");
			}
			lineBuider.append("\n");
			builder.append(lineBuider.toString());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public StringBuilder getData() {
		return builder;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public StringBuilder getDuplicateData() {
		return duplicateKeys;
	}
}
