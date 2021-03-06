package com.woocation.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class CityEsBean.
 */
public class CityEsBean {

	/** The geoname id. */
	private long geonameId;

	/** The name. */
	private String name;

	/** The ascii name. */
	private String asciiName;

	/** The alternate names. */
	private String alternateNames;
	
	/** The ascii suggest. */
	private List<CitySuggestBean> asciiSuggest;
	
	/** The alternate names suggest. */
	private List<CitySuggestBean> alternateNamesSuggest;

	/** The lattitude. */
	private Location geoLocation;

	/** The feature class. */
	private String featureClass;

	/** The feature code. */
	private String featureCode;

	/** The country code. */
	private String countryCode;

	/** The cc 2. */
	private String cc2;

	/** The admin 1 code. */
	private String admin1Code;

	/** The admin 2 code. */
	private String admin2Code;

	/** The admin 3 code. */
	private String admin3Code;

	/** The admin code. */
	private String admin4Code;

	/** The population. */
	private BigInteger population;

	/** The elevation. */
	private Integer elevation;

	/** The dem. */
	private Integer dem;

	/** The time zone. */
	private String timeZone;

	/** The time zone utc. */
	private String timeZoneUtc;

	/** The modification date. */
	private String modificationDate;

	/** The state. */
	private String state;

	/** The country name. */
	private String countryName;

	/** The country code iso 3. */
	private String countryCodeIso3;

	/** The currency name. */
	private String currencyName;

	/** The currency code. */
	private String currencyCode;

	/** The european. */
	private boolean european;

	/** The schengen. */
	private boolean schengen;
	
	/** The subway. */
	private Subway subway;
	
	/** The elevation ref. */
	private Elevation elevationRef;
	
	/** The network. */
	private Network network;
	
	/** The population ref. */
	private Population populationRef;
	
	/** The languages ref. */
	private Languages languagesRef;
	
	/** The uv details. */
	private UVBean uvDetails;
	
	/** The vegetation. */
	private Vegetation vegetation;
	
	/** The weather. */
	private Weather weather;
	
	private List<Airport> airports;
	
	private List<Holiday> holidays;
	
	private boolean isMountain;
	
	private boolean isRiver;
	
	private boolean isBeach;
	
	/**
	 * Instantiates a new city es bean.
	 */
	public CityEsBean() {
	}
	
	/**
	 * Gets the geoname id.
	 *
	 * @return the geonameId
	 */
	public long getGeonameId() {
		return geonameId;
	}

	/**
	 * Sets the geoname id.
	 *
	 * @param geonameId
	 *            the geonameId to set
	 */
	public void setGeonameId(long geonameId) {
		this.geonameId = geonameId;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the ascii name.
	 *
	 * @return the asciiName
	 */
	public String getAsciiName() {
		return asciiName;
	}

	/**
	 * Sets the ascii name.
	 *
	 * @param asciiName
	 *            the asciiName to set
	 */
	public void setAsciiName(String asciiName) {
		this.asciiName = asciiName;
	}

	/**
	 * Gets the alternate names.
	 *
	 * @return the alternateNames
	 */
	public String getAlternateNames() {
		return alternateNames;
	}

	/**
	 * Sets the alternate names.
	 *
	 * @param alternateNames
	 *            the alternateNames to set
	 */
	public void setAlternateNames(String alternateNames) {
		this.alternateNames = alternateNames;
	}

	/**
	 * Gets the geo location.
	 *
	 * @return the geoLocation
	 */
	public Location getGeoLocation() {
		return geoLocation;
	}

	/**
	 * Sets the geo location.
	 *
	 * @param geoLocation the geoLocation to set
	 */
	public void setGeoLocation(Location geoLocation) {
		this.geoLocation = geoLocation;
	}

	/**
	 * Gets the feature class.
	 *
	 * @return the featureClass
	 */
	public String getFeatureClass() {
		return featureClass;
	}

	/**
	 * Sets the feature class.
	 *
	 * @param featureClass
	 *            the featureClass to set
	 */
	public void setFeatureClass(String featureClass) {
		this.featureClass = featureClass;
	}

	/**
	 * Gets the feature code.
	 *
	 * @return the featureCode
	 */
	public String getFeatureCode() {
		return featureCode;
	}

	/**
	 * Sets the feature code.
	 *
	 * @param featureCode
	 *            the featureCode to set
	 */
	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
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
	 * @param cc2
	 *            the cc2 to set
	 */
	public void setCc2(String cc2) {
		this.cc2 = cc2;
	}

	/**
	 * Gets the admin 1 code.
	 *
	 * @return the admin1Code
	 */
	public String getAdmin1Code() {
		return admin1Code;
	}

	/**
	 * Sets the admin 1 code.
	 *
	 * @param admin1Code
	 *            the admin1Code to set
	 */
	public void setAdmin1Code(String admin1Code) {
		this.admin1Code = admin1Code;
	}

	/**
	 * Gets the admin 2 code.
	 *
	 * @return the admin2Code
	 */
	public String getAdmin2Code() {
		return admin2Code;
	}

	/**
	 * Sets the admin 2 code.
	 *
	 * @param admin2Code
	 *            the admin2Code to set
	 */
	public void setAdmin2Code(String admin2Code) {
		this.admin2Code = admin2Code;
	}

	/**
	 * Gets the admin 3 code.
	 *
	 * @return the admin3Code
	 */
	public String getAdmin3Code() {
		return admin3Code;
	}

	/**
	 * Sets the admin 3 code.
	 *
	 * @param admin3Code
	 *            the admin3Code to set
	 */
	public void setAdmin3Code(String admin3Code) {
		this.admin3Code = admin3Code;
	}

	/**
	 * Gets the admin code.
	 *
	 * @return the adminCode
	 */
	public String getAdmin4Code() {
		return admin4Code;
	}

	/**
	 * Sets the admin code.
	 *
	 * @param admin4Code
	 *            the new admin 4 code
	 */
	public void setAdmin4Code(String admin4Code) {
		this.admin4Code = admin4Code;
	}

	/**
	 * Gets the population.
	 *
	 * @return the population
	 */
	public BigInteger getPopulation() {
		return population;
	}

	/**
	 * Sets the population.
	 *
	 * @param population
	 *            the population to set
	 */
	public void setPopulation(BigInteger population) {
		this.population = population;
	}

	/**
	 * Gets the elevation.
	 *
	 * @return the elevation
	 */
	public Integer getElevation() {
		return elevation;
	}

	/**
	 * Sets the elevation.
	 *
	 * @param elevation
	 *            the elevation to set
	 */
	public void setElevation(Integer elevation) {
		this.elevation = elevation;
	}

	/**
	 * Gets the dem.
	 *
	 * @return the dem
	 */
	public Integer getDem() {
		return dem;
	}

	/**
	 * Sets the dem.
	 *
	 * @param dem
	 *            the dem to set
	 */
	public void setDem(Integer dem) {
		this.dem = dem;
	}

	/**
	 * Gets the time zone.
	 *
	 * @return the timeZone
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * Sets the time zone.
	 *
	 * @param timeZone
	 *            the timeZone to set
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * Gets the modification date.
	 *
	 * @return the modificationDate
	 */
	public String getModificationDate() {
		return modificationDate;
	}

	/**
	 * Sets the modification date.
	 *
	 * @param modificationDate
	 *            the modificationDate to set
	 */
	public void setModificationDate(String modificationDate) {
		this.modificationDate = modificationDate;
	}

	/**
	 * Gets the time zone utc.
	 *
	 * @return the timeZoneUtc
	 */
	public String getTimeZoneUtc() {
		return timeZoneUtc;
	}

	/**
	 * Sets the time zone utc.
	 *
	 * @param timeZoneUtc
	 *            the timeZoneUtc to set
	 */
	public void setTimeZoneUtc(String timeZoneUtc) {
		this.timeZoneUtc = timeZoneUtc;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
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
	 * Gets the country code iso 3.
	 *
	 * @return the countryCodeIso3
	 */
	public String getCountryCodeIso3() {
		return countryCodeIso3;
	}

	/**
	 * Sets the country code iso 3.
	 *
	 * @param countryCodeIso3
	 *            the countryCodeIso3 to set
	 */
	public void setCountryCodeIso3(String countryCodeIso3) {
		this.countryCodeIso3 = countryCodeIso3;
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
	 * @param currencyName
	 *            the currencyName to set
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
	 * @param currencyCode
	 *            the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * Checks if is european.
	 *
	 * @return the european
	 */
	public boolean isEuropean() {
		return european;
	}

	/**
	 * Sets the european.
	 *
	 * @param european            the european to set
	 */
	public void setEuropean(boolean european) {
		this.european = european;
	}

	/**
	 * Checks if is schengen.
	 *
	 * @return the schengen
	 */
	public boolean isSchengen() {
		return schengen;
	}

	/**
	 * Sets the schengen.
	 *
	 * @param schengen            the schengen to set
	 */
	public void setSchengen(boolean schengen) {
		this.schengen = schengen;
	}

	/**
	 * Gets the subway.
	 *
	 * @return the subway
	 */
	public Subway getSubway() {
		return subway;
	}

	/**
	 * Sets the subway.
	 *
	 * @param subway the subway to set
	 */
	public void setSubway(Subway subway) {
		this.subway = subway;
	}

	/**
	 * Gets the elevation ref.
	 *
	 * @return the elevationRef
	 */
	public Elevation getElevationRef() {
		return elevationRef;
	}

	/**
	 * Sets the elevation ref.
	 *
	 * @param elevationRef the elevationRef to set
	 */
	public void setElevationRef(Elevation elevationRef) {
		this.elevationRef = elevationRef;
	}

	/**
	 * Gets the network.
	 *
	 * @return the network
	 */
	public Network getNetwork() {
		return network;
	}

	/**
	 * Sets the network.
	 *
	 * @param network the network to set
	 */
	public void setNetwork(Network network) {
		this.network = network;
	}

	/**
	 * Gets the population ref.
	 *
	 * @return the populationRef
	 */
	public Population getPopulationRef() {
		return populationRef;
	}

	/**
	 * Sets the population ref.
	 *
	 * @param populationRef the populationRef to set
	 */
	public void setPopulationRef(Population populationRef) {
		this.populationRef = populationRef;
	}

	/**
	 * Gets the languages ref.
	 *
	 * @return the languagesRef
	 */
	public Languages getLanguagesRef() {
		return languagesRef;
	}

	/**
	 * Sets the languages ref.
	 *
	 * @param languagesRef the languagesRef to set
	 */
	public void setLanguagesRef(Languages languagesRef) {
		this.languagesRef = languagesRef;
	}

	/**
	 * Gets the uv details.
	 *
	 * @return the uvDetails
	 */
	public UVBean getUvDetails() {
		return uvDetails;
	}

	/**
	 * Sets the uv details.
	 *
	 * @param uvDetails the uvDetails to set
	 */
	public void setUvDetails(UVBean uvDetails) {
		this.uvDetails = uvDetails;
	}

	/**
	 * Gets the vegetation.
	 *
	 * @return the vegetation
	 */
	public Vegetation getVegetation() {
		return vegetation;
	}

	/**
	 * Sets the vegetation.
	 *
	 * @param vegetation the vegetation to set
	 */
	public void setVegetation(Vegetation vegetation) {
		this.vegetation = vegetation;
	}

	/**
	 * Gets the weather.
	 *
	 * @return the weather
	 */
	public Weather getWeather() {
		return weather;
	}

	/**
	 * Sets the weather.
	 *
	 * @param weather the weather to set
	 */
	public void setWeather(Weather weather) {
		this.weather = weather;
	}

	/**
	 * Gets the ascii suggest.
	 *
	 * @return the ascii suggest
	 */
	public List<CitySuggestBean> getAsciiSuggest() {
		return asciiSuggest;
	}

	/**
	 * Sets the ascii suggest.
	 *
	 * @param asciiSuggest the asciiSuggest to set
	 */
	public void setAsciiSuggest(List<CitySuggestBean> asciiSuggest) {
		this.asciiSuggest = asciiSuggest;
	}

	/**
	 * Gets the alternate names suggest.
	 *
	 * @return the alternateNamesSuggest
	 */
	public List<CitySuggestBean> getAlternateNamesSuggest() {
		return alternateNamesSuggest;
	}

	/**
	 * Sets the alternate names suggest.
	 *
	 * @param alternateNamesSuggest the alternateNamesSuggest to set
	 */
	public void setAlternateNamesSuggest(List<CitySuggestBean> alternateNamesSuggest) {
		this.alternateNamesSuggest = alternateNamesSuggest;
	}
	
	/**
	 * @return the airports
	 */
	public List<Airport> getAirports() {
		return airports;
	}

	/**
	 * @param airports the airports to set
	 */
	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}

	/**
	 * @return the holidays
	 */
	public List<Holiday> getHolidays() {
		return holidays;
	}

	/**
	 * @param holidays the holidays to set
	 */
	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}

	/**
	 * @return the isMountain
	 */
	public boolean isMountain() {
		return isMountain;
	}

	/**
	 * @param isMountain the isMountain to set
	 */
	public void setMountain(boolean isMountain) {
		this.isMountain = isMountain;
	}

	/**
	 * @return the isRiver
	 */
	public boolean isRiver() {
		return isRiver;
	}

	/**
	 * @param isRiver the isRiver to set
	 */
	public void setRiver(boolean isRiver) {
		this.isRiver = isRiver;
	}

	/**
	 * @return the isBeach
	 */
	public boolean isBeach() {
		return isBeach;
	}

	/**
	 * @param isBeach the isBeach to set
	 */
	public void setBeach(boolean isBeach) {
		this.isBeach = isBeach;
	}

	/**
	 * Sets the suggest.
	 */
	public void setSuggest() {
		List<CitySuggestBean> suggestList = new ArrayList<>();
		List<CitySuggestBean> alterNamesList = new ArrayList<>();
		if(this.population.signum() > 0){
			suggestList.add(new CitySuggestBean(this.getAsciiName(), this.population));
			suggestList.add(new CitySuggestBean(this.getAsciiName() + " " + this.getCountryCode(), this.population));
			suggestList.add(new CitySuggestBean(this.getAsciiName() + " " + this.getCountryName(), this.population));
			
			if(this.getAlternateNames().length() > 0){
				String[] alternateCityArray = this.getAlternateNames().split(",");
				for(String alterCity : alternateCityArray){
					if(alterCity.trim().length() > 0){
						alterNamesList.add(new CitySuggestBean(StringUtils.capitalize(alterCity), this.population));
					}
				}
			}
		}
		this.setAsciiSuggest(suggestList);
		this.setAlternateNamesSuggest(alterNamesList);
	}
}


