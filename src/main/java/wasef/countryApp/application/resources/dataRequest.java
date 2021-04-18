package wasef.countryApp.application.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import wasef.countryApp.application.apiHandler.APOD;
import wasef.countryApp.application.apiHandler.Country;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class dataRequest {
	private static final ObjectMapper mapper = new ObjectMapper();
	
	private static List<Country> blackList = new ArrayList<>();
	
	@GET
	@Path("/{countryName}")
    public static List<Country> main(String[] args , @PathParam("countryName") String country) throws IOException {

        OkHttpClient client = new OkHttpClient();
        
        String urlRequest = "https://restcountries.eu/rest/v2/name/" + country;
        Request request = new Request.Builder()
           .url(urlRequest)
           .build(); // defaults to GET

      	Response response = client.newCall(request).execute();
        APOD[] apod = mapper.readValue(response.body().byteStream(), APOD[].class);
        
        List<Country> countryInfo = new ArrayList<>();
        for(int i = 0 ; i < apod.length ; i++) {
        	Country item = new Country(apod[i]);
        	if(blackList.stream().anyMatch(data -> (item.name).equals(data.name)) == false) {	
        		countryInfo.add(item);
        	}
        }
        
        
        Collections.sort(countryInfo,new arrSorr());
        return countryInfo;  
	}
	
	@POST
    public void blockItem(Country country) {
		blackList.add(country);
	}
	
	@DELETE
	public void deleteBlockList() {
		blackList.clear();
	}
}

class arrSorr implements Comparator<Country>{
	public int compare(Country a , Country b) {
		return b.population - a.population;
	}
}
