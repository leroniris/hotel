package com.lg.service.admin;

import com.lg.entity.admin.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * user�û�service
 * @author llq
 *
 */
@Service
public interface UserService {
	/**
	 * ͨ���û��������û�
	 * @param username
	 * @return
	 */
	public User findByUsername(String username);

	/**
	 * ����û�
	 * @param user
	 * @return
	 */
	public int add(User user);

	/**
	 * �༭�û�
	 * @param user
	 * @return
	 */
	public int edit(User user);

	/**
	 * �޸�����
	 * @param user
	 * @return
	 */
	public int editPassword(User user);

	/**
	 * ����ɾ���û�
	 * @param ids
	 * @return
	 */
	public int delete(String ids);

	/**
	 * ����������ѯ�û�
	 * @param queryMap
	 * @return
	 */
	public List<User> findList(Map<String, Object> queryMap);

	/**
	 * ����������ѯ�����û�����
	 * @param queryMap
	 * @return
	 */
	public int getTotal(Map<String, Object> queryMap);
}
