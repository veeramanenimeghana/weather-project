package com.MicroService.WeatherService.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.MicroService.WeatherService.Entity.Weather;

public interface WeatherService {
	
	public List<Weather> getWeather();
	 public Weather updateWeather(Weather w);
	 public void addWeather(Weather w);
	 public void deleteWeather(Long weatherId);
	 public Page<Weather> getUserByPage(Optional<Integer> pageNo, Optional<String> sortColumn);

}
