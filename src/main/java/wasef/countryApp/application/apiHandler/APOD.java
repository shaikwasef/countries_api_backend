package wasef.countryApp.application.apiHandler;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"topLevelDomain",
"alpha2Code",
"alpha3Code",
"callingCodes",
"capital",
"altSpellings",
"region",
"subregion",
"population",
"latlng",
"demonym",
"area",
"gini",
"timezones",
"borders",
"nativeName",
"numericCode",
"currencies",
"languages",
"translations",
"flag",
"regionalBlocs",
"cioc"
})
@Generated("jsonschema2pojo")
public class APOD {

@JsonProperty("name")
private String name;
@JsonProperty("topLevelDomain")
private List<String> topLevelDomain = null;
@JsonProperty("alpha2Code")
private String alpha2Code;
@JsonProperty("alpha3Code")
private String alpha3Code;
@JsonProperty("callingCodes")
private List<String> callingCodes = null;
@JsonProperty("capital")
private String capital;
@JsonProperty("altSpellings")
private List<String> altSpellings = null;
@JsonProperty("region")
private String region;
@JsonProperty("subregion")
private String subregion;
@JsonProperty("population")
private Integer population;
@JsonProperty("latlng")
private List<Integer> latlng = null;
@JsonProperty("demonym")
private String demonym;
@JsonProperty("area")
private Integer area;
@JsonProperty("gini")
private Object gini;
@JsonProperty("timezones")
private List<String> timezones = null;
@JsonProperty("borders")
private List<Object> borders = null;
@JsonProperty("nativeName")
private String nativeName;
@JsonProperty("numericCode")
private String numericCode;
@JsonProperty("currencies")
private List<Currency> currencies = null;
@JsonProperty("languages")
private List<Language> languages = null;
@JsonProperty("translations")
private Translations translations;
@JsonProperty("flag")
private String flag;
@JsonProperty("regionalBlocs")
private List<RegionalBloc> regionalBlocs = null;
@JsonProperty("cioc")
private String cioc;

/**
* No args constructor for use in serialization
*
*/
public APOD() {
}

/**
*
* @param area
* @param nativeName
* @param capital
* @param demonym
* @param flag
* @param alpha2Code
* @param languages
* @param borders
* @param subregion
* @param callingCodes
* @param regionalBlocs
* @param gini
* @param population
* @param numericCode
* @param alpha3Code
* @param topLevelDomain
* @param timezones
* @param cioc
* @param translations
* @param name
* @param altSpellings
* @param region
* @param latlng
* @param currencies
*/
public APOD(String name, List<String> topLevelDomain, String alpha2Code, String alpha3Code, List<String> callingCodes, String capital, List<String> altSpellings, String region, String subregion, Integer population, List<Integer> latlng, String demonym, Integer area, Object gini, List<String> timezones, List<Object> borders, String nativeName, String numericCode, List<Currency> currencies, List<Language> languages, Translations translations, String flag, List<RegionalBloc> regionalBlocs, String cioc) {
super();
this.name = name;
this.topLevelDomain = topLevelDomain;
this.alpha2Code = alpha2Code;
this.alpha3Code = alpha3Code;
this.callingCodes = callingCodes;
this.capital = capital;
this.altSpellings = altSpellings;
this.region = region;
this.subregion = subregion;
this.population = population;
this.latlng = latlng;
this.demonym = demonym;
this.area = area;
this.gini = gini;
this.timezones = timezones;
this.borders = borders;
this.nativeName = nativeName;
this.numericCode = numericCode;
this.currencies = currencies;
this.languages = languages;
this.translations = translations;
this.flag = flag;
this.regionalBlocs = regionalBlocs;
this.cioc = cioc;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("topLevelDomain")
public List<String> getTopLevelDomain() {
return topLevelDomain;
}

@JsonProperty("topLevelDomain")
public void setTopLevelDomain(List<String> topLevelDomain) {
this.topLevelDomain = topLevelDomain;
}

@JsonProperty("alpha2Code")
public String getAlpha2Code() {
return alpha2Code;
}

@JsonProperty("alpha2Code")
public void setAlpha2Code(String alpha2Code) {
this.alpha2Code = alpha2Code;
}

@JsonProperty("alpha3Code")
public String getAlpha3Code() {
return alpha3Code;
}

@JsonProperty("alpha3Code")
public void setAlpha3Code(String alpha3Code) {
this.alpha3Code = alpha3Code;
}

@JsonProperty("callingCodes")
public List<String> getCallingCodes() {
return callingCodes;
}

@JsonProperty("callingCodes")
public void setCallingCodes(List<String> callingCodes) {
this.callingCodes = callingCodes;
}

@JsonProperty("capital")
public String getCapital() {
return capital;
}

@JsonProperty("capital")
public void setCapital(String capital) {
this.capital = capital;
}

@JsonProperty("altSpellings")
public List<String> getAltSpellings() {
return altSpellings;
}

@JsonProperty("altSpellings")
public void setAltSpellings(List<String> altSpellings) {
this.altSpellings = altSpellings;
}

@JsonProperty("region")
public String getRegion() {
return region;
}

@JsonProperty("region")
public void setRegion(String region) {
this.region = region;
}

@JsonProperty("subregion")
public String getSubregion() {
return subregion;
}

@JsonProperty("subregion")
public void setSubregion(String subregion) {
this.subregion = subregion;
}

@JsonProperty("population")
public Integer getPopulation() {
return population;
}

@JsonProperty("population")
public void setPopulation(Integer population) {
this.population = population;
}

@JsonProperty("latlng")
public List<Integer> getLatlng() {
return latlng;
}

@JsonProperty("latlng")
public void setLatlng(List<Integer> latlng) {
this.latlng = latlng;
}

@JsonProperty("demonym")
public String getDemonym() {
return demonym;
}

@JsonProperty("demonym")
public void setDemonym(String demonym) {
this.demonym = demonym;
}

@JsonProperty("area")
public Integer getArea() {
return area;
}

@JsonProperty("area")
public void setArea(Integer area) {
this.area = area;
}

@JsonProperty("gini")
public Object getGini() {
return gini;
}

@JsonProperty("gini")
public void setGini(Object gini) {
this.gini = gini;
}

@JsonProperty("timezones")
public List<String> getTimezones() {
return timezones;
}

@JsonProperty("timezones")
public void setTimezones(List<String> timezones) {
this.timezones = timezones;
}

@JsonProperty("borders")
public List<Object> getBorders() {
return borders;
}

@JsonProperty("borders")
public void setBorders(List<Object> borders) {
this.borders = borders;
}

@JsonProperty("nativeName")
public String getNativeName() {
return nativeName;
}

@JsonProperty("nativeName")
public void setNativeName(String nativeName) {
this.nativeName = nativeName;
}

@JsonProperty("numericCode")
public String getNumericCode() {
return numericCode;
}

@JsonProperty("numericCode")
public void setNumericCode(String numericCode) {
this.numericCode = numericCode;
}

@JsonProperty("currencies")
public List<Currency> getCurrencies() {
return currencies;
}

@JsonProperty("currencies")
public void setCurrencies(List<Currency> currencies) {
this.currencies = currencies;
}

@JsonProperty("languages")
public List<Language> getLanguages() {
return languages;
}

@JsonProperty("languages")
public void setLanguages(List<Language> languages) {
this.languages = languages;
}

@JsonProperty("translations")
public Translations getTranslations() {
return translations;
}

@JsonProperty("translations")
public void setTranslations(Translations translations) {
this.translations = translations;
}

@JsonProperty("flag")
public String getFlag() {
return flag;
}

@JsonProperty("flag")
public void setFlag(String flag) {
this.flag = flag;
}

@JsonProperty("regionalBlocs")
public List<RegionalBloc> getRegionalBlocs() {
return regionalBlocs;
}

@JsonProperty("regionalBlocs")
public void setRegionalBlocs(List<RegionalBloc> regionalBlocs) {
this.regionalBlocs = regionalBlocs;
}

@JsonProperty("cioc")
public String getCioc() {
return cioc;
}

@JsonProperty("cioc")
public void setCioc(String cioc) {
this.cioc = cioc;
}

}