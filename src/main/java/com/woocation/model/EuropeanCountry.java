package com.woocation.model;

/**
 * The Class EuropeanCountry.
 */
public class EuropeanCountry {

	/** The country name. */
	private String countryName;

	/** The country code. */
	private String countryCode;

	private boolean isEuropean;

	private boolean isSchengen;

	/**
	 * Instantiates a new european country.
	 */
	public EuropeanCountry() {
	}

	/**
	 * Instantiates a new european country.
	 *
	 * @param countryName
	 *            the country name
	 * @param countryCode
	 *            the country code
	 * @param isEuropean
	 *            the is european
	 * @param isSchengen
	 *            the is schengen
	 */
	public EuropeanCountry(String countryName, String countryCode, boolean isEuropean, boolean isSchengen) {
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.isEuropean = isEuropean;
		this.isSchengen = isSchengen;
	}

	/**
	 * Gets the country name.
	 *
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * Sets the country name.
	 *
	 * @param countryName
	 *            the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * Gets the country code.
	 *
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the country code.
	 *
	 * @param countryCode
	 *            the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the isEuropean
	 */
	public boolean isEuropean() {
		return isEuropean;
	}

	/**
	 * @param isEuropean
	 *            the isEuropean to set
	 */
	public void setEuropean(boolean isEuropean) {
		this.isEuropean = isEuropean;
	}

	/**
	 * @return the isSchengen
	 */
	public boolean isSchengen() {
		return isSchengen;
	}

	/**
	 * @param isSchengen
	 *            the isSchengen to set
	 */
	public void setSchengen(boolean isSchengen) {
		this.isSchengen = isSchengen;
	}
}
