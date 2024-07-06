package com.MicroService.ForecastService.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MicroService.ForecastService.Entity.Forecast;

@Repository
public interface ForecastRepository extends JpaRepository<Forecast,Long> {

	


	
	Optional<Forecast> findById(Long id);
}
