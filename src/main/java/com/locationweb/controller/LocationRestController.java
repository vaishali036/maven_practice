package com.locationweb.controller;

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

import com.locationweb.entity.Location;
import com.locationweb.repository.LocationRepository;

@RestController
public class LocationRestController {

	@Autowired
	private LocationRepository locationrepo;
	
	@GetMapping("/show2")
	public List<Location> getLocation(){
		List<Location> location = locationrepo.findAll();
		return location;
	}
	
	@GetMapping("/show1")
	public String showLocationPage() {
		return "create_Location";
	}
}
