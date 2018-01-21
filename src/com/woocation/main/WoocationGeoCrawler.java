/**
 * 
 */
package com.woocation.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.woocation.model.CityEsBean;
import com.woocation.model.Elevation;
import com.woocation.model.Languages;
import com.woocation.model.Network;
import com.woocation.model.Population;
import com.woocation.model.Subway;
import com.woocation.model.UVBean;
import com.woocation.model.Vegetation;
import com.woocation.model.Weather;
import com.woocation.reader.crawler.GeoCityCrawlerJson;

/**
 * The Class WoocationGeoCrawler.
 *
 * @author Ankit.Gupta
 */
public class WoocationGeoCrawler {

	private String filePath = "E:\\Data\\";
	
	private String cityFile = "E:\\Data\\cities_new.txt";
	
	private String cityExportLocation = "E:\\Data\\CityBean\\";
	
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
	
	private GeoCityCrawlerJson cityCrawler = new GeoCityCrawlerJson();
	
	/**
	 * Instantiates a new woocation geo crawler.
	 */
	public WoocationGeoCrawler() {
		try {
			cityCrawler.getGeoCityListGeneric(cityFile);
			readAllDate();
			combinedData();
			clearExistingData();
			writeCityBean();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void writeCityBean() throws Exception{
		 List<List<CityEsBean>> subSets = Lists.partition(cityCrawler.getCityList(), 10000);
		 int count = 1;
		 for(List<CityEsBean> cityList : subSets){
			 ObjectMapper mapper = new ObjectMapper();
			 File file = new File(cityExportLocation + count + ".json");
			 file.createNewFile();
			 mapper.writeValue(file, cityList);
			 System.out.println("Data exported to file --> " + file.getAbsolutePath());
			 count++;
		 }
	}
	
	private void clearExistingData() throws IOException{
		 File file = new File(cityExportLocation);
		 if(file.isDirectory()){
			 List<File> filesInFolder = Files.walk(Paths.get(cityExportLocation))
	                    .filter(Files::isRegularFile)
	                    .map(Path::toFile)
	                    .collect(Collectors.toList());
			 
			 filesInFolder.stream().forEach( prevFile -> prevFile.delete());
		 }
			
	}
	
	public void combinedData(){
		for(CityEsBean cityBean : cityCrawler.getCityList()){
			Long geoNameId = cityBean.getGeonameId();
			
			Subway subway = subwayMap.get(geoNameId);
			cityBean.setSubway(subway);
			
			Elevation elevationRef= elevationMap.get(geoNameId);
			cityBean.setElevationRef(elevationRef);
			
			Population populationRef = populationMap.get(geoNameId);
			cityBean.setPopulationRef(populationRef);
			
			Network network = networkMap.get(geoNameId);
			cityBean.setNetwork(network);
			
			Languages languagesRef= languageMap.get(geoNameId);
			cityBean.setLanguagesRef(languagesRef);
			
			UVBean uvDetails = uvMap.get(geoNameId);
			cityBean.setUvDetails(uvDetails);
			
			Vegetation vegetation = vegetationMap.get(geoNameId);
			cityBean.setVegetation(vegetation);
		}
		System.out.println(cityCrawler.getCityList().get(0));
	}
	
	private void readAllDate(){
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
		String subwayFile = filePath + "subway_geonameid.json";
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
		String elevationFile = filePath + "elevation_geonameid.json";
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
		List<Population> populationList = readFile(filePath + "population_geonameid.json", Population.class);
		populationList.stream().forEach(item -> {
			populationMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}
	
	public void readWeatherFile() {
		try {
			List<File> filesInFolder = Files.walk(Paths.get(filePath + "wealth"))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .collect(Collectors.toList());
			filesInFolder.stream().forEach(file -> {
				List<Weather> weatherList = readFile(file.getAbsolutePath(), Weather.class);
				weatherList.stream().forEach(item -> {
					weatherMap.put(Long.valueOf(item.getGeonameid()), item);
				});
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void readNetworkFile() {
		List<Network> networkList = readFile(filePath + "network_geonameid.json", Network.class);
		networkList.stream().forEach(item -> {
			networkMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}
	
	public void readLanguageFile() {
		List<Languages> languageList = readFile(filePath + "languages_geoname_new.json", Languages.class);
		languageList.stream().forEach(item -> {
			languageMap.put(item.getGeonameid(), item);
		});
	}
	
	public void readVegetationFile() {
		List<Vegetation> vegetationList = readFile(filePath + "vegetation_geonameid.json", Vegetation.class);
		vegetationList.stream().forEach(item -> {
			vegetationMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}
	
	public void readUVFile() {
		List<UVBean> uvList = readFile(filePath + "uvi_geonameid.json", UVBean.class);
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
