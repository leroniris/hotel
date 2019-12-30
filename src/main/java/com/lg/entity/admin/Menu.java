package com.lg.entity.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 菜单实体类
 * @author Leron
 *
 */
@Data
@Component
public class Menu {
	private Long id;
	private Long parentId;//父类id
	private Long _parentId;//父类id,用来匹配easyui的父类id
	private String name;//菜单名称
	private String url;//点击后的url
	private String icon;//菜单icon图表
	public Long get_parentId() {
		_parentId = parentId;
		return _parentId;
	}
	public void set_parentId(Long _parentId) {
		this._parentId = _parentId;
	}
}
