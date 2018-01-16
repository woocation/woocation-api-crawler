	package com.woocation.main;

import com.woocation.utils.JsonDeserializer;

/**
 * The Class WoocationCrawler.
 */
public class WoocationSimCrawler {

	private JsonDeserializer deserializer = null;

	/**
	 * Instantiates a new woocation crawler.
	 */
	public WoocationSimCrawler() {
		deserializer = new JsonDeserializer("/home/ankit/woocation/sim/sim_final.txt",
				"/home/ankit/woocation/sim/sim_documents.txt");
	}

	/**
	 * The main method.
	 *
	 * @param agrs
	 *            the arguments
	 */
	public static void main(String[] agrs) {
		WoocationSimCrawler crawler = new WoocationSimCrawler();

	}

}
