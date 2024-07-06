package com.microservice.LocationS.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;
import com.microservice.LocationS.Entity.Location;
import com.microservice.LocationS.Repository.LocationRepository;
import com.microservice.LocationS.Service.LocationService;

public class LocationServiceTest {
	
	@Autowired
	LocationService locationservice;
	
	@MockBean
	LocationRepository locationrepository;
	
	public void TestgetLocationById() {
		when(locationrepository.findById(1L)).thenReturn(prepareLocationData());
		Location location = locationservice.getLocationById(1L);
		assertEquals(1L,location.getId());
		assertEquals("newyork",location.getCity());
	}
	
	
	

	private Optional<Location> prepareLocationData() {
		Location l = new Location();
		l.setId((long) 1);
		l.setCity("newyork");
		return Optional.of(l);
	}
	
	}
	
	


