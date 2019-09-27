package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Zone;
import com.service.ZoneService;

@RestController
@RequestMapping("/zones")
public class ZoneController {
	
	@Autowired
	private ZoneService zoneService;
	
	
	@GetMapping
	public List<Zone> listActivesZones(){
		
		return zoneService.findAllActives();
	}
	
	
	

}
