package com.woocation.model;

/**
 * The Class MountainRiverBeach.
 */
public class MountainRiverBeach {

	/** The geo name id. */
	private String geoNameId;

	/** The is mountain. */
	private boolean isMountain;

	/** The is river. */
	private boolean isRiver;

	/** The is beach. */
	private boolean isBeach;

	/**
	 * Instantiates a new mountain river beach.
	 *
	 * @param geoNameId the geo name id
	 * @param isMountain the is mountain
	 * @param isRiver the is river
	 * @param isBeach the is beach
	 */
	public MountainRiverBeach(String geoNameId, String isMountain, String isRiver, String isBeach) {
		this.geoNameId = geoNameId;
		this.isMountain = Boolean.valueOf(isMountain);
		this.isRiver = Boolean.valueOf(isRiver);
		this.isBeach = Boolean.valueOf(isBeach);
	}

	/**
	 * Gets the geo name id.
	 *
	 * @return the geoNameId
	 */
	public String getGeoNameId() {
		return geoNameId;
	}

	/**
	 * Sets the geo name id.
	 *
	 * @param geoNameId
	 *            the geoNameId to set
	 */
	public void setGeoNameId(String geoNameId) {
		this.geoNameId = geoNameId;
	}

	/**
	 * Checks if is mountain.
	 *
	 * @return the isMountain
	 */
	public boolean isMountain() {
		return isMountain;
	}

	/**
	 * Sets the mountain.
	 *
	 * @param isMountain
	 *            the isMountain to set
	 */
	public void setMountain(boolean isMountain) {
		this.isMountain = isMountain;
	}

	/**
	 * Checks if is river.
	 *
	 * @return the isRiver
	 */
	public boolean isRiver() {
		return isRiver;
	}

	/**
	 * Sets the river.
	 *
	 * @param isRiver
	 *            the isRiver to set
	 */
	public void setRiver(boolean isRiver) {
		this.isRiver = isRiver;
	}

	/**
	 * Checks if is beach.
	 *
	 * @return the isBeach
	 */
	public boolean isBeach() {
		return isBeach;
	}

	/**
	 * Sets the beach.
	 *
	 * @param isBeach
	 *            the isBeach to set
	 */
	public void setBeach(boolean isBeach) {
		this.isBeach = isBeach;
	}

}
