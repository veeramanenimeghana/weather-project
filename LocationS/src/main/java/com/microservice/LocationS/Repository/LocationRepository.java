package com.microservice.LocationS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.microservice.LocationS.Entity.Location;




	@Repository
	public interface LocationRepository extends JpaRepository<Location, Long> {

	}



