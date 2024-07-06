package com.MicroService.ForecastService.Controller;


import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MicroService.ForecastService.Entity.Forecast;
import com.MicroService.ForecastService.Entity.Weather;
import com.MicroService.ForecastService.Service.ForecastServiceClass;


@RestController
public class ForecastController {
	@Autowired
	ForecastServiceClass forecastservice;
	
	
	
	
	@GetMapping("/weather/{id}/forecast/{forecastId}")
	public Optional<Forecast> getForecastById(@PathVariable Long forecastId) {
		return forecastservice.getForecastById(forecastId);
	
    }
	
	@PostMapping("/weather/{weatherId}/forecast")
	public void addWeather(@RequestBody Forecast forecast,@PathVariable Long weatherId) {
		forecast.setWeather(new Weather(weatherId,"",""));
		forecastservice.addWeather(forecast);
	}




@DeleteMapping("/weather/{weatherId}/forecast/{forecastId}")
	public void deleteForecast(@PathVariable Long forecastId) {
		forecastservice.deleteForecast(forecastId);
	}
  @PutMapping("/weather/{weatherId}/forecast/{forecastId}")
	public void updateForecast(@RequestBody Forecast forecast,@PathVariable Long forecastId ) {
	  forecastservice.updateForecast(forecast,forecastId);
	}
  //@GetMapping("weather/{Id}/forecast")
	//public  List<Forecast> getAllForecast(@PathVariable Long id) {
		//return forecastservice.getAllForecast(id);
	//}
  @GetMapping("/forecast")
  public List<Forecast> getAllForecast() {
      return forecastservice.getAllForecast();
  }
  
  
  @GetMapping("/forecasts/rest/{id}")
  public Optional<Forecast> getForecastLocation(@PathVariable Long id){
	  return forecastservice.getForecastLocatin(id);
  }

}





