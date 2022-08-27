package com.locationweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationweb.entity.Location;
import com.locationweb.repository.LocationRepository;
@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationrepo;
	
	@Override
	public void saveLocation(Location location) {
		locationrepo.save(location);
		
	}

	@Override
	public List<Location> getAllLocation() {
		List<Location> location = locationrepo.findAll();
		return location;
	}

	@Override
	public void deleteLocationById(long id) {
		locationrepo.deleteById(id);
		
	}

	@Override
	public Location updateLocationById(long id) {
		Optional<Location> locations = locationrepo.findById(id);
		Location location = locations.get();
		return location;
	}

}
