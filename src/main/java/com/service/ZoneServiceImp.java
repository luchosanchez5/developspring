package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ZoneDao;
import com.model.Zone;

@Service("zoneService")
public class ZoneServiceImp implements ZoneService {
    
	@Autowired
	private ZoneDao zoneDao;
	
	@Override
	public List<Zone> findAllActives() {
		// TODO Auto-generated method stub
		List<Zone> lis = zoneDao.findAllByStatus("A");
		return lis;
	}

}
