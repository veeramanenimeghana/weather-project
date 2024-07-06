package com.MicroService.WeatherService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MicroService.WeatherService.Entity.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather,Long> {

	

	
}
