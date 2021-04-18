package wasef.countryApp.application.apiHandler;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"code",
"name",
"symbol"
})
@Generated("jsonschema2pojo")
public class Currency {

@JsonProperty("code")
private String code;
@JsonProperty("name")
private String name;
@JsonProperty("symbol")
private String symbol;

/**
* No args constructor for use in serialization
*
*/
public Currency() {
}

/**
*
* @param symbol
* @param code
* @param name
*/
public Currency(String code, String name, String symbol) {
super();
this.code = code;
this.name = name;
this.symbol = symbol;
}

@JsonProperty("code")
public String getCode() {
return code;
}

@JsonProperty("code")
public void setCode(String code) {
this.code = code;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("symbol")
public String getSymbol() {
return symbol;
}

@JsonProperty("symbol")
public void setSymbol(String symbol) {
this.symbol = symbol;
}

}