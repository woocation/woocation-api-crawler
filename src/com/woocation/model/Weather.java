package com.woocation.model;

import java.util.Map;

/**
 * The Class Weather.
 */
public class Weather {
	
	/** The geonameid. */
	private String geonameid;
	
	/** The weather. */
	private  Map<String, MonthDetail> weather;

	/**
	 * @return the geonameid
	 */
	public String getGeonameid() {
		return geonameid;
	}

	/**
	 * @param geonameid the geonameid to set
	 */
	public void setGeonameid(String geonameid) {
		this.geonameid = geonameid;
	}

	/**
	 * @return the weather
	 */
	public Map<String, MonthDetail> getWeather() {
		return weather;
	}

	/**
	 * @param weather the weather to set
	 */
	public void setWeather(Map<String, MonthDetail> weather) {
		this.weather = weather;
	}

	
}
