package com.woocation.model;

/**
 * The Class Airport.
 */
public class Airport {

	/** The iata. */
	private String iata;
	
	/** The domestic count. */
	private Integer domesticCount;
	
	/** The international count. */
	private Integer internationalCount;
	
	/** The location. */
	private LocationRef location;
	
	/**
	 * Instantiates a new airport.
	 */
	public Airport() {
	}

	/**
	 * Gets the iata.
	 *
	 * @return the iata
	 */
	public String getIata() {
		return iata;
	}

	/**
	 * Sets the iata.
	 *
	 * @param iata the iata to set
	 */
	public void setIata(String iata) {
		this.iata = iata;
	}

	/**
	 * Gets the domestic count.
	 *
	 * @return the domesticCount
	 */
	public Integer getDomesticCount() {
		return domesticCount;
	}

	/**
	 * Sets the domestic count.
	 *
	 * @param domesticCount the domesticCount to set
	 */
	public void setDomesticCount(Integer domesticCount) {
		this.domesticCount = domesticCount;
	}

	/**
	 * Gets the international count.
	 *
	 * @return the internationalCount
	 */
	public Integer getInternationalCount() {
		return internationalCount;
	}

	/**
	 * Sets the international count.
	 *
	 * @param internationalCount the internationalCount to set
	 */
	public void setInternationalCount(Integer internationalCount) {
		this.internationalCount = internationalCount;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public LocationRef getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the location to set
	 */
	public void setLocation(LocationRef location) {
		this.location = location;
	}
}
