package com.woocation.main;

import com.woocation.reader.Admin1CodeReader;
import com.woocation.reader.CountryReader;
import com.woocation.reader.CurrencyReader;
import com.woocation.reader.EuropeanReader;
import com.woocation.reader.crawler.CityCrawler;
import com.woocation.writer.WoocationWriter;

/**
 * The Class WoocationCityCrawler.
 *
 * @author ankit
 */
public class WoocationCityCrawler {

	/** The country. */
	private CountryReader country = null;
	
	/** The admin 1 reader. */
	private Admin1CodeReader admin1Reader = null;
	
	/** The currency reader. */
	private CurrencyReader currencyReader = null;
	
	/** The euro reader. */
	private EuropeanReader euroReader = null;
	
	/** The city crawler. */
	private CityCrawler cityCrawler = null;

	/**
	 * Instantiates a new woocation city crawler.
	 */
	public WoocationCityCrawler() {

		country = new CountryReader();
		country.loadCountryData("/home/ankit/woocation/city/country_isoCode.csv");
		
		admin1Reader = new Admin1CodeReader();
		admin1Reader.loadAdminData("/home/ankit/woocation/city/admin1CodesASCII.txt");
		
		currencyReader  = new CurrencyReader();
		currencyReader.loadCountryCurrencyData("/home/ankit/woocation/city/country_currency.csv");
		
		euroReader = new EuropeanReader();
		euroReader.loadEuropeCountryData("/home/ankit/woocation/city/european.csv");
		
		cityCrawler = new CityCrawler(country, admin1Reader, currencyReader, euroReader);
	}


	/**
	 * Do crawl.
	 */
	public void doCrawl(){
//		cityCrawler.doCrawl("/home/ankit/woocation/city/cities1000.txt");
//		WoocationWriter.writeContent("/home/ankit/woocation/cities_new.txt", cityCrawler.getData());
//		cityCrawler.findDuplicate("/home/ankit/woocation/cities_new.txt");
		WoocationWriter.writeContent("/home/ankit/woocation/duplicate.txt", cityCrawler.getDuplicateData());
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		WoocationCityCrawler crawler = new WoocationCityCrawler();
		crawler.doCrawl();
	}
}
