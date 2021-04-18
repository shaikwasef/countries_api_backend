package wasef.countryApp.application.apiHandler;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"de",
"es",
"fr",
"ja",
"it",
"br",
"pt",
"nl",
"hr",
"fa"
})
@Generated("jsonschema2pojo")
public class Translations {

@JsonProperty("de")
private String de;
@JsonProperty("es")
private String es;
@JsonProperty("fr")
private String fr;
@JsonProperty("ja")
private String ja;
@JsonProperty("it")
private String it;
@JsonProperty("br")
private String br;
@JsonProperty("pt")
private String pt;
@JsonProperty("nl")
private String nl;
@JsonProperty("hr")
private String hr;
@JsonProperty("fa")
private String fa;

/**
* No args constructor for use in serialization
*
*/
public Translations() {
}

/**
*
* @param br
* @param de
* @param pt
* @param ja
* @param hr
* @param it
* @param fa
* @param fr
* @param es
* @param nl
*/
public Translations(String de, String es, String fr, String ja, String it, String br, String pt, String nl, String hr, String fa) {
super();
this.de = de;
this.es = es;
this.fr = fr;
this.ja = ja;
this.it = it;
this.br = br;
this.pt = pt;
this.nl = nl;
this.hr = hr;
this.fa = fa;
}

@JsonProperty("de")
public String getDe() {
return de;
}

@JsonProperty("de")
public void setDe(String de) {
this.de = de;
}

@JsonProperty("es")
public String getEs() {
return es;
}

@JsonProperty("es")
public void setEs(String es) {
this.es = es;
}

@JsonProperty("fr")
public String getFr() {
return fr;
}

@JsonProperty("fr")
public void setFr(String fr) {
this.fr = fr;
}

@JsonProperty("ja")
public String getJa() {
return ja;
}

@JsonProperty("ja")
public void setJa(String ja) {
this.ja = ja;
}

@JsonProperty("it")
public String getIt() {
return it;
}

@JsonProperty("it")
public void setIt(String it) {
this.it = it;
}

@JsonProperty("br")
public String getBr() {
return br;
}

@JsonProperty("br")
public void setBr(String br) {
this.br = br;
}

@JsonProperty("pt")
public String getPt() {
return pt;
}

@JsonProperty("pt")
public void setPt(String pt) {
this.pt = pt;
}

@JsonProperty("nl")
public String getNl() {
return nl;
}

@JsonProperty("nl")
public void setNl(String nl) {
this.nl = nl;
}

@JsonProperty("hr")
public String getHr() {
return hr;
}

@JsonProperty("hr")
public void setHr(String hr) {
this.hr = hr;
}

@JsonProperty("fa")
public String getFa() {
return fa;
}

@JsonProperty("fa")
public void setFa(String fa) {
this.fa = fa;
}

}