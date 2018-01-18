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
import com.woocation.model.Languages;
import com.woocation.model.Network;
import com.woocation.model.Population;
import com.woocation.model.Subway;
import com.woocation.model.UVBean;
import com.woocation.model.Vegetation;
import com.woocation.model.Weather;

/**
 * The Class WoocationGeoCrawler.
 *
 * @author Ankit.Gupta
 */
public class WoocationGeoCrawler {

	/** The subway map. */
	public Map<Long, Subway> subwayMap = new HashMap<>();

	/** The elevation map. */
	public Map<Long, Elevation> elevationMap = new HashMap<>();

	/** The population map. */
	public Map<Long, Population> populationMap = new HashMap<>();

	/** The network map. */
	public Map<Long, Network> networkMap = new HashMap<>();
	
	/** The language map. */
	public Map<Long, Languages> languageMap = new HashMap<>();
	
	/** The uv map. */
	public Map<Long, UVBean> uvMap = new HashMap<>();
	
	/** The vegetaion. */
	public Map<Long, Vegetation> vegetationMap = new HashMap<>();
	
	/** The weather map. */
	public Map<Long, Weather> weatherMap = new HashMap<>();
	
	/**
	 * Instantiates a new woocation geo crawler.
	 */
	public WoocationGeoCrawler() {
		readSubwayFile();
		readElevationFile();
		readPopulationFile();
		readNetworkFile();
		readLanguageFile();
		readUVFile();
//		readWeatherFile();
		readVegetationFile();
	}

	/**
	 * Read subway file.
	 */
	public void readSubwayFile() {
		String subwayFile = "D:\\Data\\subway_geonameid.json";
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
	public void readElevationFile() {
		String elevationFile = "D:\\Data\\elevation_geonameid.json";
		try {
			List<Elevation> list = readFile(elevationFile, Elevation.class);
			list.stream().forEach(item -> {
				elevationMap.put(Long.valueOf(item.getGeonameId()), item);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readPopulationFile() {
		List<Population> populationList = readFile("D:\\Data\\population_geonameid.json", Population.class);
		populationList.stream().forEach(item -> {
			populationMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}
	
	public void readWeatherFile() {
		List<Weather> weatherList = readFile("D:\\Data\\weather_geonameid.json", Weather.class);
		weatherList.stream().forEach(item -> {
			weatherMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}
	
	public void readNetworkFile() {
		List<Network> networkList = readFile("D:\\Data\\network_geonameid.json", Network.class);
		networkList.stream().forEach(item -> {
			networkMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}
	
	public void readLanguageFile() {
		List<Languages> languageList = readFile("D:\\Data\\languages_geoname.json", Languages.class);
		languageList.stream().forEach(item -> {
			languageMap.put(item.getGeonameid(), item);
		});
	}
	
	public void readVegetationFile() {
		List<Vegetation> vegetationList = readFile("D:\\Data\\vegetation_geonameid.json", Vegetation.class);
		vegetationList.stream().forEach(item -> {
			vegetationMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}
	
	public void readUVFile() {
		List<UVBean> uvList = readFile("D:\\Data\\uvi_geonameid.json", UVBean.class);
		uvList.stream().forEach(item -> {
			uvMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}

	public <T> List<T> readFile(String fileName, Class<T> pojoClass) {
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
