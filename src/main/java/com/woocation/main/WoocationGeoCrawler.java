/**
 * 
 */
package com.woocation.main;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woocation.model.Elevation;
import com.woocation.model.Network;
import com.woocation.model.Population;
import com.woocation.model.Subway;

/**
 * The Class WoocationGeoCrawler.
 *
 * @author Ankit.Gupta
 */
public class WoocationGeoCrawler {

	/** The subway map. */
	private Map<Long, Subway> subwayMap = new HashMap<>();

	/** The elevation map. */
	private Map<Long, Elevation> elevationMap = new HashMap<>();

	/** The population map. */
	private Map<Long, Population> populationMap = new HashMap<>();

	private Map<Long, Network> networkMap = new HashMap<>();
	
	/**
	 * Instantiates a new woocation geo crawler.
	 */
	public WoocationGeoCrawler() {
		readSubwayFile();
		readElevationFile();
		readPopulationFile();
		readNetworkFile();
	}

	/**
	 * Read subway file.
	 */
	private void readSubwayFile() {
		String subwayFile = "E:\\Data\\subway_geonameid.json";
		try {
			List<Subway> list = readFile(subwayFile, Subway.class);
			list.stream().forEach(item -> {
				subwayMap.put(Long.valueOf(item.getGeonameid()), item);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Read Elevation file.
	 */
	private void readElevationFile() {
		String elevationFile = "E:\\Data\\elevation_geonameid.json";
		try {
			List<Elevation> list = readFile(elevationFile, Elevation.class);
			list.stream().forEach(item -> {
				elevationMap.put(Long.valueOf(item.getGeonameId()), item);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readPopulationFile() {
		List<Population> populationList = readFile("E:\\Data\\population_geonameid.json", Population.class);
		populationList.stream().forEach(item -> {
			populationMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}
	
	private void readNetworkFile() {
		List<Network> networkList = readFile("E:\\Data\\network_geonameid.json", Network.class);
		networkList.stream().forEach(item -> {
			networkMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}

	private <T> List<T> readFile(String fileName, Class<T> pojoClass) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(Feature.ALLOW_NON_NUMERIC_NUMBERS, true);
		List<T> list = null;
		try {
			File jsonFile = new File(fileName);
			list = mapper.readValue(jsonFile, mapper.getTypeFactory().constructCollectionType(List.class, pojoClass));
			System.out.println("Records Read in File --> " + fileName + " --> " + list.size());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		WoocationGeoCrawler crawler = new WoocationGeoCrawler();
	}

}
