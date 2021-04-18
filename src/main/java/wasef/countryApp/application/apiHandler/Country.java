package wasef.countryApp.application.apiHandler;

public class Country {
	public String name ;
	public String capital;
	public String region;
	public String subregion;
	public int population ;
	public String flag ;
	
	public Country() {
		
	}
	public Country(APOD apod) {
		this.name = apod.getName();
		this.capital = apod.getCapital();
		this.flag = apod.getFlag();
		this.subregion = apod.getSubregion();
		this.population = apod.getPopulation();
	}
}
