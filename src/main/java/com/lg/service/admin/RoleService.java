package com.lg.service.admin;

import com.lg.entity.admin.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * ��ɫrole service
 * @author Leron
 *
 */
@Service
public interface RoleService {
	public int add(Role role);
	public int edit(Role role);
	public int delete(Long id);
	public List<Role> findList(Map<String, Object> queryMap);
	public int getTotal(Map<String, Object> queryMap);
	public Role find(Long id);
}
