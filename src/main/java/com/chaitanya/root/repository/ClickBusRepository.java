package com.chaitanya.root.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaitanya.root.model.ClickBus;

public interface ClickBusRepository extends JpaRepository<ClickBus, Long> {
	ClickBus findByCity(String city);
	
	List<ClickBus> findByState(String state);
}
