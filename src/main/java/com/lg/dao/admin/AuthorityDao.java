package com.lg.dao.admin;

import com.lg.entity.admin.Authority;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Ȩ��ʵ����dao
 * @author Leron
 *
 */
@Repository
public interface AuthorityDao {
	public int add(Authority authority);
	public int deleteByRoleId(Long roleId);
	public List<Authority> findListByRoleId(Long roleId);
}
