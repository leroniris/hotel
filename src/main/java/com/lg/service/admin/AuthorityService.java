package com.lg.service.admin;

import com.lg.entity.admin.Authority;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Ȩ��service�ӿ�
 * @author llq
 *
 */
@Service
public interface AuthorityService {
	public int add(Authority authority);
	public int deleteByRoleId(Long roleId);
	public List<Authority> findListByRoleId(Long roleId);
}