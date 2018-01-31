package com.woocation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class LanguageDetails.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LanguageDetails {
	
	/** The language. */
	private String language;
	
	/** The language code. */
	private String languageCode;
	
	/** The ratio. */
	private Float ratio;

	/**
	 * Gets the language.
	 *
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the language.
	 *
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Gets the language code.
	 *
	 * @return the languageCode
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * Sets the language code.
	 *
	 * @param languageCode the languageCode to set
	 */
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	/**
	 * Gets the ratio.
	 *
	 * @return the ratio
	 */
	public Float getRatio() {
		return ratio;
	}

	/**
	 * Sets the ratio.
	 *
	 * @param ratio the ratio to set
	 */
	public void setRatio(Float ratio) {
		this.ratio = ratio;
	}
}
