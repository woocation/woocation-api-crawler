package com.woocation.reader;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.woocation.model.Admin1Code;

/**
 * The Class Admin1CodeReader.
 */
public class Admin1CodeReader {

	/** The admin 1 data. */
	private Map<String, Admin1Code> admin1Data = null;

	/**
	 * Instantiates a new admin 1 code reader.
	 */
	public Admin1CodeReader() {
	}

	/**
	 * Load admin data.
	 *
	 * @param admin1File the admin 1 file
	 * @return the map
	 */
	public Map<String, Admin1Code> loadAdminData(String admin1File) {
		try {
			List<String> allLine = Files.readAllLines(Paths.get(admin1File));
			admin1Data = getAdminObject(allLine);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return admin1Data;
	}

	/**
	 * Gets the admin object.
	 *
	 * @param data
	 *            the data
	 * @return the admin object
	 */
	private Map<String, Admin1Code> getAdminObject(List<String> data) {
		Map<String, Admin1Code> admin1Data = new HashMap<>();
		for (String dataLine : data) {
			String[] dataRow = dataLine.split("\t");
			Admin1Code admin1 = new Admin1Code(dataRow[0], dataRow[1], dataRow[2], dataRow[3]);
			admin1Data.put(dataRow[0], admin1);
		}
		return admin1Data;
	}

	/**
	 * @return the admin1Data
	 */
	public Map<String, Admin1Code> getAdmin1Data() {
		return admin1Data;
	}
}
