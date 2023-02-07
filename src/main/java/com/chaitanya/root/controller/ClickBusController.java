package com.chaitanya.root.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chaitanya.root.model.ClickBus;
import com.chaitanya.root.service.ClickBusService;

@RestController
public class ClickBusController {
	
	@Autowired
	private ClickBusService clickBusService;
	
	@RequestMapping(value = "/places", method = RequestMethod.POST)
	@ResponseBody
	public ClickBus savePlace(@RequestBody ClickBus clickBus) {
		return clickBusService.savePlace(clickBus);
	}
	
	@RequestMapping(value = "/places", method = RequestMethod.GET)
	public List<ClickBus> fetchPlaces(){
		return clickBusService.fetchPlaces();
	}
	
	@RequestMapping(value = "/places/{id}", method = RequestMethod.PUT)
	public ClickBus updatePlaceDetails(@RequestBody ClickBus clickBus, @PathVariable("id") Long id) {
		return clickBusService.updatePlaceDetails(clickBus, id);
	}
	
	@RequestMapping(value = "/places/{id}", method = RequestMethod.DELETE)
	public String deletePlaceById(@PathVariable("id") Long id) {
		clickBusService.deletePlaceById(id);
		return "Deleted Successfully";
	}
	
	@RequestMapping(value = "/places/{name}", method = RequestMethod.GET)
	public ClickBus fetchPlaceByCity(@PathVariable("name") String city) {
		return clickBusService.findBycity(city);
	}
	
	@RequestMapping(value = "/places/state/{name}", method = RequestMethod.GET)
	public List<ClickBus> fetchPlacesByState(@PathVariable("name") String state) {
		return clickBusService.findByState(state);
	}
}
