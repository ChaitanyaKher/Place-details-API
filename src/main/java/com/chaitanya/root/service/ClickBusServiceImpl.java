package com.chaitanya.root.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaitanya.root.model.ClickBus;
import com.chaitanya.root.repository.ClickBusRepository;

@Service
public class ClickBusServiceImpl implements ClickBusService {
	@Autowired
	private  ClickBusRepository clickBusRepository;

	@Override
	public ClickBus savePlace(ClickBus clickBus) {
		// TODO Auto-generated method stub
		return clickBusRepository.save(clickBus);
	}

	@Override
	public List<ClickBus> fetchPlaces() {
		// TODO Auto-generated method stub
		return clickBusRepository.findAll();
	}

	@Override
	public ClickBus updatePlaceDetails(ClickBus clickBus, Long id) {
		// TODO Auto-generated method stub
		ClickBus result = clickBusRepository.findById(id).get();
		
		if (Objects.nonNull(clickBus.getSlug()) && !"".equalsIgnoreCase(clickBus.getSlug())) {
			result.setSlug(clickBus.getSlug());
		}
		if (Objects.nonNull(clickBus.getCity()) && !"".equalsIgnoreCase(clickBus.getCity())) {
			result.setCity(clickBus.getCity());
		}
		
		if (Objects.nonNull(clickBus.getState()) && !"".equalsIgnoreCase(clickBus.getState())) {
			result.setState(clickBus.getState());
		}
		
		if (Objects.nonNull(clickBus.getCreatedAt()) && !"".equalsIgnoreCase(clickBus.getCreatedAt())) {
			result.setCreatedAt(clickBus.getCreatedAt());
		}
		
		if (Objects.nonNull(clickBus.getUpdatedAt()) && !"".equalsIgnoreCase(clickBus.getUpdatedAt())) {
			result.setUpdatedAt(clickBus.getUpdatedAt());
		}
		
		return clickBusRepository.save(result);
	}

	@Override
	public void deletePlaceById(Long id) {
		// TODO Auto-generated method stub
		clickBusRepository.deleteById(id);
	}

	@Override
	public ClickBus findBycity(String city) {
		// TODO Auto-generated method stub
		return clickBusRepository.findByCity(city);
	}

	@Override
	public List<ClickBus> findByState(String state) {
		// TODO Auto-generated method stub
		return clickBusRepository.findByState(state);
	}

}
