package com.microservice.LocationS.Service;

import java.util.List;

import com.microservice.LocationS.Entity.Location;

public interface LocationService {
	
	public List<Location> getAllLocations();
	 public Location getLocationById(Long id);
	 public Location createLocation(Location location);
	 public Location updateLocation(Long id, Location locationDetails);
	 public void deleteLocation(Long id);
	 //public List<Location> fetchLocation(Long id);

}
