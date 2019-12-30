package com.lg.service.admin.impl;

import com.lg.dao.admin.AuthorityDao;
import com.lg.entity.admin.Authority;
import com.lg.service.admin.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityDao authorityDao;
	
	@Override
	public int add(Authority authority) {
		return authorityDao.add(authority);
	}

	@Override
	public int deleteByRoleId(Long roleId) {
		return authorityDao.deleteByRoleId(roleId);
	}

	@Override
	public List<Authority> findListByRoleId(Long roleId) {
		return authorityDao.findListByRoleId(roleId);
	}

}
