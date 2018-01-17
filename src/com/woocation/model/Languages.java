package com.woocation.model;

import java.util.List;

/**
 * The Class Languages.
 */
public class Languages {

	/** The geonameid. */
	private Long geonameid;

	/** The city. */
	private String city;

	/** The languages. */
	private List<List<Object>> languages;

	/**
	 * Gets the geonameid.
	 *
	 * @return the geonameid
	 */
	public Long getGeonameid() {
		return geonameid;
	}

	/**
	 * Sets the geonameid.
	 *
	 * @param geonameid
	 *            the geonameid to set
	 */
	public void setGeonameid(Long geonameid) {
		this.geonameid = geonameid;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the languages.
	 *
	 * @return the languages
	 */
	public List<List<Object>> getLanguages() {
		return languages;
	}

	/**
	 * Sets the languages.
	 *
	 * @param languages
	 *            the languages to set
	 */
	public void setLanguages(List<List<Object>> languages) {
		this.languages = languages;
	}
}
