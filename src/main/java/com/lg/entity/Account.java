package com.lg.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * �ͻ�ʵ����
 * @author Administrator
 *
 */
@Component
@Data
public class Account {
	private Long id;//�ͻ�id
	private String name;//�ͻ���¼��
	private String password;//�ͻ���¼����
	private String realName;//��ʵ����
	private String idCard;//���֤����
	private String mobile;//�ֻ���
	private String address;//��ϵ��ַ
	private int status;//״̬��0�����ã�-1������

}
