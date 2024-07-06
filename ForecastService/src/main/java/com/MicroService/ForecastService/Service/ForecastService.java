package com.MicroService.ForecastService.Service;

import java.util.List;
import java.util.Optional;

import com.MicroService.ForecastService.Entity.Forecast;

public interface ForecastService {

	 public Optional<Forecast> getForecastById(Long forecastId);
	 public void addWeather(Forecast forecast);
	 public void deleteForecast(Long id);
	 public void updateForecast(Forecast forecast, Long id);
	 public List<Forecast> getAllForecast();
}
