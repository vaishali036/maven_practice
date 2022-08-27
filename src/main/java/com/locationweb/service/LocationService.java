package com.locationweb.service;

import java.util.List;

import com.locationweb.entity.Location;

public interface LocationService {

	public void saveLocation(Location location);

	public List<Location> getAllLocation();

	public void deleteLocationById(long id);

	public Location updateLocationById(long id);

}
