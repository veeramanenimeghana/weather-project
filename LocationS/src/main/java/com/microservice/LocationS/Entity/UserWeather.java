package com.microservice.LocationS.Entity;

import java.util.Collection;
import java.util.List;

public class UserWeather {
	
	private List<Weather> userWeather;

	public List<Weather> getuserWeather() {
		return userWeather;
	}

	public void setUserRating(List<Weather> userWeather) {
		this.userWeather =userWeather ;
	}

	public Collection<Location> getUserWeather() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
