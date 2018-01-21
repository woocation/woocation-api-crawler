package com.woocation.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Languages.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Languages {

	/** The geonameid. */
	private Long geonameid;

	/** The city. */
	private String city;

	/** The languages. */
	private List<LanguageDetails> languages;

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
	 * @return the languages
	 */
	public List<LanguageDetails> getLanguages() {
		return languages;
	}

	/**
	 * @param languages the languages to set
	 */
	public void setLanguages(List<LanguageDetails> languages) {
		this.languages = languages;
	}
}
