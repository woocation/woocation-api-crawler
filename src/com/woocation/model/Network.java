package com.woocation.model;

/**
 * The Class Network.
 */
public class Network {

	/** The geonameid. */
	private String geonameid;

	/** The network. */
	private NetworkDetail network;

	/**
	 * Instantiates a new network.
	 */
	public Network() {
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
	 * Gets the network.
	 *
	 * @return the network
	 */
	public NetworkDetail getNetwork() {
		return network;
	}

	/**
	 * Sets the network.
	 *
	 * @param network
	 *            the network to set
	 */
	public void setNetwork(NetworkDetail network) {
		this.network = network;
	}

}
