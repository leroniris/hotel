package com.lg.service.admin.impl;
/**
 * 入住管理service实现类
 */

import com.lg.dao.admin.CheckinDao;
import com.lg.entity.admin.Checkin;
import com.lg.service.admin.CheckinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CheckinServiceImpl implements CheckinService {

    @Autowired
    private CheckinDao checkinDao;

    @Override
    public int add(Checkin checkin) {
        return checkinDao.add(checkin);
    }

    @Override
    public int edit(Checkin checkin) {
        return checkinDao.edit(checkin);
    }

    @Override
    public int delete(Long id) {
        return checkinDao.delete(id);
    }

    @Override
    public List<Checkin> findList(Map<String, Object> queryMap) {
        return checkinDao.findList(queryMap);
    }

    @Override
    public Integer getTotal(Map<String, Object> queryMap) {
        return checkinDao.getTotal(queryMap);
    }

    @Override
    public Checkin find(Long id) {
        return checkinDao.find(id);
    }

    @Override
    public List<Map> getStatsByMonth() {
        return checkinDao.getStatsByMonth();
    }

    @Override
    public List<Map> getStatsByDay() {
        return checkinDao.getStatsByDay();
    }


}
