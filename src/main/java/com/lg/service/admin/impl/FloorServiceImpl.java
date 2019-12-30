package com.lg.service.admin.impl;
/**
 * ¬•≤„service µœ÷¿‡
 */

import com.lg.dao.admin.FloorDao;
import com.lg.entity.admin.Floor;
import com.lg.service.admin.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FloorServiceImpl implements FloorService {

	@Autowired
	private FloorDao floorDao;
	
	@Override
	public int add(Floor floor) {
		return floorDao.add(floor);
	}

	@Override
	public int edit(Floor floor) {
		return floorDao.edit(floor);
	}

	@Override
	public int delete(Long id) {
		return floorDao.delete(id);
	}

	@Override
	public List<Floor> findList(Map<String, Object> queryMap) {
		return floorDao.findList(queryMap);
	}

	@Override
	public List<Floor> findAll() {
		return floorDao.findAll();
	}

	@Override
	public Integer getTotal(Map<String, Object> queryMap) {
		return floorDao.getTotal(queryMap);
	}

}
