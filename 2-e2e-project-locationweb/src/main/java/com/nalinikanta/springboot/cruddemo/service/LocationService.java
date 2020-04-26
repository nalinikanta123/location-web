package com.nalinikanta.springboot.cruddemo.service;

import java.util.List;

import com.nalinikanta.springboot.cruddemo.entity.Location;

public interface LocationService {
	
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getLocationById(int id);
	List<Location> getAllLocations();
}
