package com.MicroService.ForecastService.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MicroService.ForecastService.Entity.Forecast;
import com.MicroService.ForecastService.Repository.ForecastRepository;


@Service
public class ForecastServiceClass implements ForecastService{
	
	@Autowired
	ForecastRepository forecastRepository;

	     public Optional<Forecast> getForecastById(Long forecastId) {
		       return forecastRepository.findById(forecastId);
		
	          }

		public void addWeather(Forecast forecast) {
		  forecastRepository.save(forecast);
			}

		public void deleteForecast(Long forecastId) {
			forecastRepository.deleteById(forecastId);
			
		}

		public void updateForecast(Forecast forecast, Long forecastId) {
			
			forecastRepository.save(forecast);
			}

		//public List<Forecast> getAllForecast(Long id) {
			//	List<Forecast> forecastList = new ArrayList<>();
				//forecastRepository.findByweatherId(weatherid).forEach(forecastList::add);
				//return forecastList;
			//}
		public List<Forecast> getAllForecast() {
	       return forecastRepository.findAll();

		
}

		public Optional<Forecast> getForecastLocatin(Long id) {
			// TODO Auto-generated method stub
			return forecastRepository.findById(id);
		}
		
}
	

	




