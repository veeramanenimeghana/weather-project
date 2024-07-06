package com.microservice.LocationS.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.microservice.LocationS.Entity.Location;
import com.microservice.LocationS.Service.LocationServiceClass;



	@RestController
	public class LocationController {
		@Autowired
		LocationServiceClass service;
		
		
		  @GetMapping("/location")
		    public List<Location> getAllLocations() {
		        return service.getAllLocations();
		    }
		  
		 
		  
		  @GetMapping("/location/{id}")
		    public Location getLocationById(@PathVariable Long id) {
		        return service.getLocationById(id);
		    }

		    @PostMapping("/location")
		    public Location createLocation(@RequestBody Location location) {
		        return service.createLocation(location);
		    }
		
		    @PutMapping("location/{id}")
		    public Location updateLocation(@PathVariable Long id, @RequestBody Location locationDetails) {
		        return service.updateLocation(id, locationDetails);
		    }

		    @DeleteMapping("location/{id}")
		    public void deleteLocation(@PathVariable Long id) {
		        service.deleteLocation(id);
		    }
		    
		   
 @GetMapping("/restTemplate/{id}")
 public Location fetchLocation(@PathVariable Long id){
	 return service.fetchLocation(id);
 }
		}

	
