package com.woocation.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class SimPurchaseDetails.
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SimPurchaseDetails {

	/** The availability. */
	private String availability;

	/** The data only. */
	private String dataOnly;

	/** The documents. */
	private List<String> documents = null;

	/** The available at. */
	private List<String> availableAt = null;

	/** The contract. */
	private String contract;

	/** The min act days. */
	private String minActDays;

	/** The max act days. */
	private String maxActDays;

	/** The link. */
	private String link;

	/** The reco. */
	private List<String> reco = null;

	/** The news. */
	private List<String> news = null;

	/**
	 * Instantiates a new sim purchase details.
	 */
	public SimPurchaseDetails() {
	}

	/**
	 * @return the availability
	 */
	public String getAvailability() {
		return availability;
	}

	/**
	 * @param availability
	 *            the availability to set
	 */
	public void setAvailability(String availability) {
		this.availability = availability;
	}

	/**
	 * @return the dataOnly
	 */
	public String getDataOnly() {
		return dataOnly;
	}

	/**
	 * @param dataOnly
	 *            the dataOnly to set
	 */
	public void setDataOnly(String dataOnly) {
		this.dataOnly = dataOnly;
	}

	/**
	 * @return the documents
	 */
	public List<String> getDocuments() {
		return documents;
	}

	/**
	 * @param documents
	 *            the documents to set
	 */
	public void setDocuments(List<String> documents) {
		this.documents = documents;
	}

	/**
	 * @return the availableAt
	 */
	public List<String> getAvailableAt() {
		return availableAt;
	}

	/**
	 * @param availableAt
	 *            the availableAt to set
	 */
	public void setAvailableAt(List<String> availableAt) {
		this.availableAt = availableAt;
	}

	/**
	 * @return the contract
	 */
	public String getContract() {
		return contract;
	}

	/**
	 * @param contract
	 *            the contract to set
	 */
	public void setContract(String contract) {
		this.contract = contract;
	}

	/**
	 * @return the minActDays
	 */
	public String getMinActDays() {
		return minActDays;
	}

	/**
	 * @param minActDays
	 *            the minActDays to set
	 */
	public void setMinActDays(String minActDays) {
		this.minActDays = minActDays;
	}

	/**
	 * @return the maxActDays
	 */
	public String getMaxActDays() {
		return maxActDays;
	}

	/**
	 * @param maxActDays
	 *            the maxActDays to set
	 */
	public void setMaxActDays(String maxActDays) {
		this.maxActDays = maxActDays;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link
	 *            the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the reco
	 */
	public List<String> getReco() {
		return reco;
	}

	/**
	 * @param reco
	 *            the reco to set
	 */
	public void setReco(List<String> reco) {
		this.reco = reco;
	}

	/**
	 * @return the news
	 */
	public List<String> getNews() {
		return news;
	}

	/**
	 * @param news
	 *            the news to set
	 */
	public void setNews(List<String> news) {
		this.news = news;
	}

}
