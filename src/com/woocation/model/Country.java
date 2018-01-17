package com.woocation.model;

/**
 * The Class Country.
 */
public class Country {

	/** The country name. */
	private String countryName;
	
	/** The cc 2. */
	private String cc2;
	
	/** The cc 3. */
	private String cc3;
	
	/** The code. */
	private String code;
	
	/**
	 * Instantiates a new country.
	 *
	 * @param countryName the country name
	 * @param cc2 the cc 2
	 * @param cc3 the cc 3
	 * @param code the code
	 */
	public Country(String countryName, String cc2, String cc3, String code) {
		this.countryName = countryName;
		this.cc2 = cc2;
		this.cc3 = cc3;
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
	 * Gets the cc 2.
	 *
	 * @return the cc2
	 */
	public String getCc2() {
		return cc2;
	}

	/**
	 * Sets the cc 2.
	 *
	 * @param cc2 the cc2 to set
	 */
	public void setCc2(String cc2) {
		this.cc2 = cc2;
	}

	/**
	 * Gets the cc 3.
	 *
	 * @return the cc3
	 */
	public String getCc3() {
		return cc3;
	}

	/**
	 * Sets the cc 3.
	 *
	 * @param cc3 the cc3 to set
	 */
	public void setCc3(String cc3) {
		this.cc3 = cc3;
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
