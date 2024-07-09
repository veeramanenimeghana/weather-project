package com.MicroService.WeatherService.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.MicroService.WeatherService.Entity.Weather;
import com.MicroService.WeatherService.Repository.WeatherRepository;


@Service
public class WeatherServiceClass {
	@Autowired
	WeatherRepository weatherRepository;

       public List<Weather> getWeather() {
		        List<Weather> weatherList = new ArrayList<>();
		        weatherRepository.findAll().forEach(weatherList::add);
		        return weatherList;
	          }
     
       public Weather updateWeather(Weather w) {
    	           weatherRepository.findAll().stream()
    	            .filter(weather -> weather.getWeatherId().equals(w.getWeatherId()))
    	            .findFirst()
    	            .ifPresent(existingWeather -> {
    	                existingWeather.setTemperature(w.getTemperature()) ;
    	        
    	                weatherRepository.save(existingWeather);
    	             });
    	        return null; 
    	     }
    
     
       public void addWeather(Weather w) {
	           weatherRepository.save(w);
             }

        public void deleteWeather(Long weatherId) {
        		List<Weather> weatherList=weatherRepository.findAll();
        		
        		Weather weatherToDelete =  weatherList.stream()
        				.filter(weather-> weather.getWeatherId().equals(weatherId))
        				.findFirst()
        	    .orElseThrow(() -> new IllegalArgumentException("weather with ID" + weatherId + "not found"));
		weatherRepository.delete(weatherToDelete);
        	}

		
        public Page<Weather> getUserByPage(Optional<Integer> pageNo, Optional<String> sortColumn) {
    		return weatherRepository.findAll(PageRequest.of(pageNo.orElse(0),2,Direction.DESC,sortColumn.orElse("weatherId")));
    	}

		public Optional<Weather> getWeatherById(Long weatherId) {
			// TODO Auto-generated method stub
			return weatherRepository.findById(weatherId);
		}

      /*	public List<Weather> searchWeather(String query){
      		return weatherRepository.searchWeather(query);
      	}*/

}
	

	
