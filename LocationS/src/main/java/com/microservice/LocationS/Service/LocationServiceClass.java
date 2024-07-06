package com.microservice.LocationS.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.LocationS.Entity.Forecast;
import com.microservice.LocationS.Entity.Location;
import com.microservice.LocationS.Entity.Weather;
import com.microservice.LocationS.Repository.LocationRepository;

@Service
public class LocationServiceClass implements LocationService {
	
	 @Autowired
	    private LocationRepository locationRepository;
	 
	 @Autowired
		private RestTemplate resttemplate;

	    public List<Location> getAllLocations() {
	        return locationRepository.findAll();
	    }
	    
	    public Location getLocationById(Long id) {
	        return locationRepository.findById(id).orElse(null);
	    }

	    public Location createLocation(Location location) {
	        return locationRepository.save(location);
	    }

	    public Location updateLocation(Long id, Location locationDetails) {
	        Location location = locationRepository.findById(id).orElse(null);
	        if (location != null) {
	            location.setCity(locationDetails.getCity());
	            location.setCountry(locationDetails.getCountry());
	            return locationRepository.save(location);
	        }
	        return null;
	    }

	    public void deleteLocation(Long id) {
	        locationRepository.deleteById(id);
	    }


	    




public Location fetchLocation(Long id) {

Location location=locationRepository.findById(id).get();
 Forecast forecast=resttemplate.getForObject("http://localhost:8095/forecasts/rest/"+id, Forecast.class);
 location.setForecast(forecast);

  Weather weather=resttemplate.getForObject("http://localhost:8091//weather/"+id, Weather.class);
	location.setWeather(weather);



//
//		
 return location;

	}
}



		
		
		
		
