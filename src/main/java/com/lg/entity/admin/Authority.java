package com.lg.entity.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Ȩ��ʵ��
 * @author Leron
 *
 */
@Data
@Component
public class Authority {
	private Long id;
	
	private Long roleId;//��ɫid
	
	private Long menuId;//�˵�id

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	
	
}
