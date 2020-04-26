package com.nalinikanta.springboot.cruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nalinikanta.springboot.cruddemo.entity.Location;
import com.nalinikanta.springboot.cruddemo.repos.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRestController {

	@Autowired
	LocationRepository locationRepository;

	@GetMapping
	public List<Location> getLocations() {
		return locationRepository.findAll();
	}

	@PostMapping
	public Location createLocation(@RequestBody Location location) {
		return locationRepository.save(location);
	}
	
	@PutMapping	
	public Location udateLocation(@RequestBody Location location) {
		return locationRepository.save(location);
	}
	
	@DeleteMapping({"/{id}"})
	public void deleteLocation(@PathVariable int id) {
		Location location = new Location();
		location.setId(id);
		locationRepository.delete(location);
	}
		
	@GetMapping({"/{id}"})
	public Location getLocations(@PathVariable int id) {
		return locationRepository.findById(id).get();
	}

}
