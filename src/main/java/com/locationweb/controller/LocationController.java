package com.locationweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb.entity.Location;
import com.locationweb.service.LocationService;

@Controller
public class LocationController {

	@Autowired
	private LocationService locationService;
		
	@GetMapping("/show")
	public String showLocationPage() {
		return "create_Location";
	}
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute Location location,ModelMap model) {
		locationService.saveLocation(location);
		model.addAttribute("msg" , "Location is saved...!!!");
		return "create_Location";
}
	
	@RequestMapping("/listall")
	public String getAllLocation(ModelMap model) {
		List<Location> location = locationService.getAllLocation();
		model.addAttribute("location",location);
		return "search_Location";
}
	
	@RequestMapping("/delete")
	public String deleteLocation(@RequestParam("id") long id,ModelMap model) {
		locationService.deleteLocationById(id);
		List<Location> location = locationService.getAllLocation();
		model.addAttribute("location",location);
		return "search_Location";
	}
	@RequestMapping("/update")
	public String updateLocation(@RequestParam("id") long id,ModelMap model) {
		Location location = locationService.updateLocationById(id);
		model.addAttribute("location",location);
		return "update_Location";
	}
	@RequestMapping("/updateData")
	public String updateData(@ModelAttribute Location location,ModelMap model) {
		locationService.saveLocation(location);
		model.addAttribute("msg" , "Location is updated...!!!");
		return "update_Location";
}

}
