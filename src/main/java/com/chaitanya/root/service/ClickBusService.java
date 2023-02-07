package com.chaitanya.root.service;

import java.util.List;

import com.chaitanya.root.model.ClickBus;

public interface ClickBusService {
	//Save a place
	ClickBus savePlace(ClickBus clickBus);
	
	//Retrieve all places
	List<ClickBus> fetchPlaces();
	
	//Update the details of a place
	ClickBus updatePlaceDetails(ClickBus clickBus, Long id);
	
	//Delete a place
	void deletePlaceById(Long id);
	
	//Get place by name
	ClickBus findBycity(String city);
	
	//Get all Cities in a State
	List<ClickBus> findByState(String state);
}
