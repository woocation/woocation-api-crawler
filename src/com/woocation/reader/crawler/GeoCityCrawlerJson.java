package com.woocation.reader.crawler;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.woocation.model.CityEsBean;
import com.woocation.model.Location;
import com.woocation.utils.WooApiUtils;

/**
 * The Class GeoCityCrawlerJson.
 */
public class GeoCityCrawlerJson {

	/** The city list. */
	private List<CityEsBean> cityList = new ArrayList<>();

	/**
	 * Gets the geo city list.
	 *
	 * @param path
	 *            the path
	 * @return the geo city list
	 * @throws Exception
	 *             the exception
	 */
	public void getGeoCityListGeneric(final String path) throws Exception {
		List<String> allLines = java.nio.file.Files.readAllLines(new File(path).toPath());
		allLines.stream().forEach(line -> cityList.add(getCityEsBean(line)));
	}
	
	public void readGeoCityExistingData(final String path) throws Exception{
		cityList = readCityFile(path);
	}
	
	/**
	 * Gets the city es bean.
	 *
	 * @param dataLine
	 *            the data line
	 * @return the city es bean
	 */
	private CityEsBean getCityEsBean(String dataLine) {
		CityEsBean cityBean = new CityEsBean();
		try {
			String[] dataRow = dataLine.split("\t");
			cityBean.setGeonameId(Long.valueOf(dataRow[0]));
			cityBean.setName(dataRow[1]);
			cityBean.setAsciiName(dataRow[2]);
			cityBean.setAlternateNames(dataRow[3]);
			Location point = new Location(Double.parseDouble(dataRow[4]), Double.parseDouble(dataRow[5]));
			cityBean.setGeoLocation(point);
			cityBean.setFeatureClass(dataRow[6]);
			cityBean.setFeatureCode(dataRow[7]);
			cityBean.setCountryCode(dataRow[8]);
			cityBean.setCc2(dataRow[9]);
			cityBean.setAdmin1Code(dataRow[10]);
			cityBean.setAdmin2Code(dataRow[11]);
			cityBean.setAdmin3Code(dataRow[12]);
			cityBean.setAdmin4Code(dataRow[13]);
			cityBean.setPopulation(BigInteger.valueOf(Long.valueOf(dataRow[14])));
			cityBean.setElevation(Strings.isNullOrEmpty(dataRow[15]) ? 0 : Integer.valueOf(dataRow[15]));
			cityBean.setDem(Integer.valueOf(dataRow[16]));
			cityBean.setTimeZone(dataRow[17]);
			cityBean.setTimeZoneUtc(WooApiUtils.utcTimeZone(dataRow[17]));
			cityBean.setModificationDate(dataRow[18]);
			cityBean.setState(dataRow[19]);
			cityBean.setCountryName(dataRow[20]);
			cityBean.setCountryCodeIso3(dataRow[21]);
			cityBean.setCurrencyName(dataRow[22]);
			cityBean.setCurrencyCode(dataRow[23]);
			cityBean.setEuropean(Boolean.valueOf(dataRow[24]));
			cityBean.setSchengen(Boolean.valueOf(dataRow[25]));
			
			cityBean.setSuggest();

		} catch (NumberFormatException e) {
			System.out.println("Error -> " + dataLine);
		}
		return cityBean;
	}
	
	/**
	 * Read subway file.
	 */
	public List<CityEsBean> readCityFile(String filePath) {
		try {
			return readFile(filePath, CityEsBean.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
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
	 * @return the cityList
	 */
	public List<CityEsBean> getCityList() {
		return cityList;
	}

	/**
	 * @param cityList the cityList to set
	 */
	public void setCityList(List<CityEsBean> cityList) {
		this.cityList = cityList;
	}
	
	public void clearList(){
		this.cityList.clear();
	}
}
