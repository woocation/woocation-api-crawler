package com.woocation.model;

/**
 * The Class SIMData.
 */
public class SIMData{

	/** The country code. */
	private String countryCode;

	/** The country name. */
	private String countryName;

	/** The sim purchase details. */
	private SimPurchaseDetails simPurchaseDetails;

	/**
	 * Instantiates a new SIM data.
	 */
	public SIMData() {
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
	 * @return the simPurchaseDetails
	 */
	public SimPurchaseDetails getSimPurchaseDetails() {
		return simPurchaseDetails;
	}

	/**
	 * @param simPurchaseDetails the simPurchaseDetails to set
	 */
	public void setSimPurchaseDetails(SimPurchaseDetails simPurchaseDetails) {
		this.simPurchaseDetails = simPurchaseDetails;
	}

}
