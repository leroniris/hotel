package com.lg.service.impl;

import com.lg.dao.BookOrderDao;
import com.lg.entity.BookOrder;
import com.lg.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookOrderServiceImpl implements BookOrderService {

    @Autowired
    private BookOrderDao bookOrderDao;

    @Override
    public int add(BookOrder bookOrder) {
        return bookOrderDao.add(bookOrder);
    }

    @Override
    public int edit(BookOrder bookOrder) {
        return bookOrderDao.edit(bookOrder);
    }

    @Override
    public int delete(Long id) {
        return bookOrderDao.delete(id);
    }

    @Override
    public List<BookOrder> findList(Map<String, Object> queryMap) {
        return bookOrderDao.findList(queryMap);
    }

    @Override
    public Integer getTotal(Map<String, Object> queryMap) {
        return bookOrderDao.getTotal(queryMap);
    }

    @Override
    public BookOrder find(Long id) {
        return bookOrderDao.find(id);
    }


}
