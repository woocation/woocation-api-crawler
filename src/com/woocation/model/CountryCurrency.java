package com.woocation.model;

/**
 * The Class CountryCurrency.
 */
public class CountryCurrency {

	/** The country name. */
	private String countryName;
	
	/** The currency name. */
	private String currencyName;
	
	/** The currency code. */
	private String currencyCode;
	
	/** The code. */
	private String code;
	
	/**
	 * Instantiates a new country currency.
	 */
	public CountryCurrency() {
	}

	/**
	 * Instantiates a new country currency.
	 *
	 * @param countryName the country name
	 * @param currency the currency
	 * @param currencyCode the currency code
	 * @param code the code
	 */
	public CountryCurrency(String countryName, String currency, String currencyCode, String code) {
		this.countryName = countryName;
		this.currencyName = currency;
		this.currencyCode = currencyCode;
		this.code = code;
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
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * Gets the currency name.
	 *
	 * @return the currencyName
	 */
	public String getCurrencyName() {
		return currencyName;
	}

	/**
	 * Sets the currency name.
	 *
	 * @param currencyName the currencyName to set
	 */
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	/**
	 * Gets the currency code.
	 *
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * Sets the currency code.
	 *
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the code.
	 *
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
}
