package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Zone;

public interface ZoneDao extends JpaRepository<Zone, Long> {
	
	List<Zone> findAllByStatus(String st);

}
