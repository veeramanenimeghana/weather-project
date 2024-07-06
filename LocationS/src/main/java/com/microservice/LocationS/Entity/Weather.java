package com.microservice.LocationS.Entity;




import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="weather")
public class Weather {
	
	@Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long weatherId;
   // private Long locationId;
    private String temperature;
    private String description;
    
  
public Weather() {
	super();
	}

public Weather(Long weatherId, String temperature, String description) {
	super();
	this.weatherId= weatherId;
	//this.locationId = locationId;
	this.temperature = temperature;
	this.description = description;
	
}





public Long getWeatherId() {
	return weatherId;
}

public void setWeatherId(Long weatherId) {
	this.weatherId = weatherId;
}

//public Long getLocationId() {
//	return locationId;
//}
//
//public void setLocationId(Long locationId) {
//	this.locationId = locationId;
//}

public String getTemperature() {
	return temperature;
}

public void setTemperature(String temperature) {
	this.temperature = temperature;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}
    
   
    

}
