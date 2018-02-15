/**
 * 
 */
package com.woocation.main;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.woocation.model.Airport;
import com.woocation.model.AirportDetails;
import com.woocation.model.CityEsBean;
import com.woocation.model.Elevation;
import com.woocation.model.Holiday;
import com.woocation.model.HolidayRaw;
import com.woocation.model.HolidayRawReference;
import com.woocation.model.Languages;
import com.woocation.model.MountainRiverBeach;
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

	public static final String DIRECTORY = "E:\\";

	/** The city out put. */
	private String cityOutPut = DIRECTORY + "Data\\CityBean\\";

	private String cityOutPutFinal = DIRECTORY + "Data\\CityBeanFinal\\";

	/** The file path. */
	private String filePath = DIRECTORY + "Data\\";

	/** The city file. */
	private String cityFile = DIRECTORY + "Data\\cities_new.txt";

	/** The city export location. */
	private String cityExportLocation = DIRECTORY + "Data\\CityBean\\";

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

	/** The holiday map. */
	public Map<Long, List<Holiday>> holidayMap = new HashMap<>();

	/** The city crawler. */
	private GeoCityCrawlerJson cityCrawler = new GeoCityCrawlerJson();

	/** The mrb map. */
	private Map<Long, MountainRiverBeach> mrbMap = new HashMap<>();

	/** The airport map. */
	private Map<Long, List<Airport>> airportMap = new HashMap<>();

	/**
	 * Instantiates a new woocation geo crawler.
	 */
	public WoocationGeoCrawler() {
		// processRawData();
		processSpecificData();
	}

	/**
	 * Process raw data.
	 */
	private void processRawData() {
		try {
			cityCrawler.getGeoCityListGeneric(cityFile);
			readAllDate();
			combinedData();
			clearExistingData();
			writeCityBean(cityOutPut);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void processSpecificData() {
		try {
			readHolidayFile();
			List<File> filesInFolder = Files.walk(Paths.get(cityOutPut)).filter(Files::isRegularFile).map(Path::toFile)
					.collect(Collectors.toList());
			int count = 1;
			for (File file : filesInFolder) {
				cityCrawler.readGeoCityExistingData(file.getAbsolutePath());
				combinedHolidayData();
				writeData(count);
				cityCrawler.clearList();
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void writeData(int count) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			File file = new File(cityOutPutFinal + count + ".json");
			file.createNewFile();
			mapper.writeValue(file, cityCrawler.getCityList());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Write city bean.
	 *
	 * @throws Exception
	 *             the exception
	 */
	private void writeCityBean(String cityOutPutFolder) throws Exception {
		List<List<CityEsBean>> subSets = Lists.partition(cityCrawler.getCityList(), 2500);
		int count = 1;
		for (List<CityEsBean> cityList : subSets) {
			ObjectMapper mapper = new ObjectMapper();
			File file = new File(cityOutPutFolder + count + ".json");
			file.createNewFile();
			mapper.writeValue(file, cityList);
			System.out.println("Data exported to file --> " + file.getAbsolutePath());
			count++;
		}
	}

	/**
	 * Clear existing data.
	 *
	 * @throws Exception
	 *             the exception
	 */
	private void clearExistingData() throws Exception {
		File file = new File(cityExportLocation);
		if (file.isDirectory()) {
			List<File> filesInFolder = Files.walk(Paths.get(cityExportLocation)).filter(Files::isRegularFile)
					.map(Path::toFile).collect(Collectors.toList());

			filesInFolder.stream().forEach(prevFile -> prevFile.delete());
		}

	}

	/**
	 * Combined data.
	 */
	public void combinedData() {
		for (CityEsBean cityBean : cityCrawler.getCityList()) {
			Long geoNameId = cityBean.getGeonameId();

			Subway subway = subwayMap.get(geoNameId);
			cityBean.setSubway(subway);

			Elevation elevationRef = elevationMap.get(geoNameId);
			cityBean.setElevationRef(elevationRef);

			Population populationRef = populationMap.get(geoNameId);
			cityBean.setPopulationRef(populationRef);

			Network network = networkMap.get(geoNameId);
			cityBean.setNetwork(network);

			Languages languagesRef = languageMap.get(geoNameId);
			cityBean.setLanguagesRef(languagesRef);

			UVBean uvDetails = uvMap.get(geoNameId);
			cityBean.setUvDetails(uvDetails);

			Vegetation vegetation = vegetationMap.get(geoNameId);
			cityBean.setVegetation(vegetation);

			Weather weather = weatherMap.get(geoNameId);
			cityBean.setWeather(weather);

			// List<Holiday> holidayList = holidayMap.get(geoNameId);
			// cityBean.setHolidays(holidayList);

			List<Airport> airportList = airportMap.get(geoNameId);
			cityBean.setAirports(airportList);

			MountainRiverBeach mrb = mrbMap.get(geoNameId);
			if (mrb != null) {
				cityBean.setMountain(mrb.isMountain());
				cityBean.setRiver(mrb.isRiver());
				cityBean.setBeach(mrb.isBeach());
			}
		}

		System.out.println(cityCrawler.getCityList().get(0));
	}

	public void combinedHolidayData() {
		for (CityEsBean cityBean : cityCrawler.getCityList()) {
			Long geoNameId = cityBean.getGeonameId();
			List<Holiday> holidayList = holidayMap.get(geoNameId);
			cityBean.setHolidays(holidayList);
		}
	}

	/**
	 * Read all date.
	 */
	private void readAllDate() {
		readSubwayFile();
		readElevationFile();
		readPopulationFile();
		readNetworkFile();
		readLanguageFile();
		readUVFile();
		readWeatherFile();
		readVegetationFile();
		readMountainRiverBeachData();
		readAirportFile();
		// readHolidayFile();
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

	/**
	 * Read population file.
	 */
	public void readPopulationFile() {
		List<Population> populationList = readFile(filePath + "population_geonameid.json", Population.class);
		populationList.stream().forEach(item -> {
			populationMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}

	/**
	 * Read weather file.
	 */
	public void readWeatherFile() {
		try {
			List<File> filesInFolder = Files.walk(Paths.get(filePath + "Weather")).filter(Files::isRegularFile)
					.map(Path::toFile).collect(Collectors.toList());
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

	/**
	 * Read weather file.
	 */
	public void readHolidayFile() {
		try {
			List<File> filesInFolder = Files.walk(Paths.get(filePath + "Holidays")).filter(Files::isRegularFile)
					.map(Path::toFile).collect(Collectors.toList());
			filesInFolder.stream().forEach(file -> {
				List<HolidayRawReference> holidayList = readFile(file.getAbsolutePath(), HolidayRawReference.class);
				holidayList.stream().forEach(item -> {
					holidayMap.put(Long.valueOf(item.getGeonameid()), getHoliday(item.getHolidays()));
				});
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Records Read in File -->  holidayMap   --> " + holidayMap.size());
	}

	private List<Holiday> getHoliday(List<HolidayRaw> rawList) {
		List<Holiday> holidayList = new ArrayList<>();
		for (HolidayRaw rawObject : rawList) {
			Holiday holiday = new Holiday();
			String date = rawObject.getDd() + "-" + rawObject.getMm() + "-" + rawObject.getYy();
			holiday.setHolidayName(rawObject.getName());
			holiday.setHolidayDate(date);
			holidayList.add(holiday);
		}
		return holidayList;
	}

	/**
	 * Read mountain river beach data.
	 */
	public void readMountainRiverBeachData() {
		try {
			List<String> allLines = Files.readAllLines(Paths.get(filePath + "mountain_river_beach.csv"));
			allLines.stream().forEach(line -> {
				List<String> dataLineList = Splitter.on(",").splitToList(line);
				MountainRiverBeach reference = new MountainRiverBeach(dataLineList.get(0), dataLineList.get(1),
						dataLineList.get(2), dataLineList.get(3));
				mrbMap.put(Long.valueOf(reference.getGeoNameId()), reference);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Records Read in File -->  mountain_river_beach   --> " + mrbMap.size());
	}

	/**
	 * Read network file.
	 */
	public void readNetworkFile() {
		List<Network> networkList = readFile(filePath + "network_geonameid.json", Network.class);
		networkList.stream().forEach(item -> {
			networkMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}

	/**
	 * Read network file.
	 */
	public void readAirportFile() {
		List<AirportDetails> airPortList = readFile(filePath + "airports.json", AirportDetails.class);
		airPortList.stream().forEach(item -> {
			airportMap.put(Long.valueOf(item.getGeonameid()), item.getAirports());
		});
	}

	/**
	 * Read language file.
	 */
	public void readLanguageFile() {
		List<Languages> languageList = readFile(filePath + "languages_geoname_new.json", Languages.class);
		languageList.stream().forEach(item -> {
			languageMap.put(item.getGeonameid(), item);
		});
	}

	/**
	 * Read vegetation file.
	 */
	public void readVegetationFile() {
		List<Vegetation> vegetationList = readFile(filePath + "vegetation_geonameid.json", Vegetation.class);
		vegetationList.stream().forEach(item -> {
			vegetationMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}

	/**
	 * Read UV file.
	 */
	public void readUVFile() {
		List<UVBean> uvList = readFile(filePath + "uvi_geonameid.json", UVBean.class);
		uvList.stream().forEach(item -> {
			uvMap.put(Long.valueOf(item.getGeonameid()), item);
		});
	}

	/**
	 * Read file.
	 *
	 * @param <T>
	 *            the generic type
	 * @param fileName
	 *            the file name
	 * @param pojoClass
	 *            the pojo class
	 * @return the list
	 */
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
