/**
 * 
 */
package com.woocation.main;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.woocation.model.Elevation;
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

	/**
	 * Instantiates a new woocation geo crawler.
	 */
	public WoocationGeoCrawler() {
		readSubwayFile();
		readElevationFile();
	}

	/**
	 * Read subway file.
	 */
	private void readSubwayFile() {
		String subwayFile = "E:\\Data\\subway_geonameid.json";
		ObjectMapper mapper = new ObjectMapper();
		try {
			File jsonFile = new File(subwayFile);
			List<Subway> list = mapper.readValue(jsonFile,
					mapper.getTypeFactory().constructCollectionType(List.class, Subway.class));
			System.out.println("Records Read in File --> " + list.size());

			list.stream().forEach(item -> {
				subwayMap.put(Long.valueOf(item.getGeonameid()), item);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Read subway file.
	 */
	private void readElevationFile() {
		String elevationFile = "E:\\Data\\elevation_geonameid.json";
		ObjectMapper mapper = new ObjectMapper();
		try {
			File jsonFile = new File(elevationFile);
			List<Elevation> list = mapper.readValue(jsonFile,
					mapper.getTypeFactory().constructCollectionType(List.class, Elevation.class));
			System.out.println("Records Read in File --> " + list.size());

			list.stream().forEach(item -> {
				elevationMap.put(Long.valueOf(item.getGeonameId()), item);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		WoocationGeoCrawler crawler = new WoocationGeoCrawler();
	}

}
