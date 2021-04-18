package wasef.countryApp.application.apiHandler;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"acronym",
"name",
"otherAcronyms",
"otherNames"
})
@Generated("jsonschema2pojo")
public class RegionalBloc {

@JsonProperty("acronym")
private String acronym;
@JsonProperty("name")
private String name;
@JsonProperty("otherAcronyms")
private List<Object> otherAcronyms = null;
@JsonProperty("otherNames")
private List<String> otherNames = null;

/**
* No args constructor for use in serialization
*
*/
public RegionalBloc() {
}

/**
*
* @param otherNames
* @param acronym
* @param name
* @param otherAcronyms
*/
public RegionalBloc(String acronym, String name, List<Object> otherAcronyms, List<String> otherNames) {
super();
this.acronym = acronym;
this.name = name;
this.otherAcronyms = otherAcronyms;
this.otherNames = otherNames;
}

@JsonProperty("acronym")
public String getAcronym() {
return acronym;
}

@JsonProperty("acronym")
public void setAcronym(String acronym) {
this.acronym = acronym;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("otherAcronyms")
public List<Object> getOtherAcronyms() {
return otherAcronyms;
}

@JsonProperty("otherAcronyms")
public void setOtherAcronyms(List<Object> otherAcronyms) {
this.otherAcronyms = otherAcronyms;
}

@JsonProperty("otherNames")
public List<String> getOtherNames() {
return otherNames;
}

@JsonProperty("otherNames")
public void setOtherNames(List<String> otherNames) {
this.otherNames = otherNames;
}

}