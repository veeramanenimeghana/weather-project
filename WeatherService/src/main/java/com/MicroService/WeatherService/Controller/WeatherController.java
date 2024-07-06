package com.MicroService.WeatherService.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MicroService.WeatherService.Entity.Weather;
import com.MicroService.WeatherService.Service.WeatherServiceClass;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;



@RestController
public class WeatherController {
	
	    @Autowired
	    private WeatherServiceClass weatherService;
	    
	    @Tag
	    (name = "get",description="get methods for player API")
	    @GetMapping("/weather")
		public List<Weather> getWeather(){
			return weatherService.getWeather();
	    }
	    
	    @Tag
	    (name = "get",description="get methods for player API")
	    @GetMapping("/weather/{weatherId}")
	    public Optional<Weather> getWeatherById(@PathVariable Long weatherId){
	    	return weatherService.getWeatherById(weatherId);
	    }
	    
	    @PostMapping("/weather")
			public void addWeather(@RequestBody Weather w) {
				weatherService.addWeather(w);		
		}
	    
	    
	    @Operation(summary = "updating a player",
				description = "updating a existing player. The response is updatedon pl table")
	   @PutMapping("/updateweather/{weatherId}")
	   public Weather updateWeather(@RequestBody Weather w){
		   return weatherService.updateWeather(w);	   
		   }
	    
	    
	   @Operation(summary = "deleting a player",
				description = "deleting a existing player. The response is deleted on pl table")
        @DeleteMapping("del/{weatherId}")
        public  void deleteWeather(@PathVariable Long weatherId) {
			  weatherService.deleteWeather(weatherId);
        	
        }
	   
        @Tag
	    (name = "get",description="get methods for player API")
        @GetMapping("/page")
		public  Page<Weather> getUserByPage(@RequestParam("pageNo") Optional<Integer> pageNo,
				@RequestParam("sortBy") Optional<String> sortColumn) {
			return weatherService.getUserByPage(pageNo,sortColumn);
		}
        
       /* @GetMapping("/search")
    	public List<Weather> searchWeather(@RequestParam("query") String query){
    		return weatherService.searchWeather(query);
        
           }*/
}