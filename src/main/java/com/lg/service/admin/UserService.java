package com.lg.service.admin;

import com.lg.entity.admin.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * user用户service
 * @author llq
 *
 */
@Service
public interface UserService {
	/**
	 * 通过用户名查找用户
	 * @param username
	 * @return
	 */
	public User findByUsername(String username);

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public int add(User user);

	/**
	 * 编辑用户
	 * @param user
	 * @return
	 */
	public int edit(User user);

	/**
	 * 修改密码
	 * @param user
	 * @return
	 */
	public int editPassword(User user);

	/**
	 * 批量删除用户
	 * @param ids
	 * @return
	 */
	public int delete(String ids);

	/**
	 * 根据条件查询用户
	 * @param queryMap
	 * @return
	 */
	public List<User> findList(Map<String, Object> queryMap);

	/**
	 * 根据条件查询到的用户总数
	 * @param queryMap
	 * @return
	 */
	public int getTotal(Map<String, Object> queryMap);
}
