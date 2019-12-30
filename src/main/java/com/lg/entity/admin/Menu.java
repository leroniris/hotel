package com.lg.entity.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * �˵�ʵ����
 * @author Leron
 *
 */
@Data
@Component
public class Menu {
	private Long id;
	private Long parentId;//����id
	private Long _parentId;//����id,����ƥ��easyui�ĸ���id
	private String name;//�˵�����
	private String url;//������url
	private String icon;//�˵�iconͼ��
	public Long get_parentId() {
		_parentId = parentId;
		return _parentId;
	}
	public void set_parentId(Long _parentId) {
		this._parentId = _parentId;
	}
}
