package com.woocation.model;

/**
 * The Class Population.
 */
public class Population {

	/** The geonameid. */
	private String geonameid;

	/** The unit. */
	private String unit;

	/** The density. */
	private Double density;

	/**
	 * Instantiates a new population.
	 */
	public Population() {
	}

	/**
	 * Gets the geonameid.
	 *
	 * @return the geonameid
	 */
	public String getGeonameid() {
		return geonameid;
	}

	/**
	 * Sets the geonameid.
	 *
	 * @param geonameid
	 *            the geonameid to set
	 */
	public void setGeonameid(String geonameid) {
		this.geonameid = geonameid;
	}

	/**
	 * Gets the unit.
	 *
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * Sets the unit.
	 *
	 * @param unit
	 *            the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * Gets the density.
	 *
	 * @return the density
	 */
	public Double getDensity() {
		return density;
	}

	/**
	 * Sets the density.
	 *
	 * @param density
	 *            the density to set
	 */
	public void setDensity(Double density) {
		this.density = density;
	}

}
