package com.lg.service.admin;

import com.lg.entity.admin.Floor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Â¥²ãservice
 * @author Leron
 *
 */
@Service
public interface FloorService {
	public int add(Floor floor);
	public int edit(Floor floor);
	public int delete(Long id);
	public List<Floor> findList(Map<String, Object> queryMap);
	public List<Floor> findAll();
	public Integer getTotal(Map<String, Object> queryMap);
}
