package com.MicroService.WeatherService.Entity;

import java.util.List;

public class UserWeather {
	
	private List<Weather> userWeather;

	public List<Weather> getuserWeather() {
		return userWeather;
	}

	public void setUserRating(List<Weather> userWeather) {
		this.userWeather =userWeather ;
	}
	
}
