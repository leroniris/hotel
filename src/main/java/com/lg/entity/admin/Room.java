package com.lg.entity.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * ����ʵ����
 * @author Leron
 *
 */
@Data
@Component
public class Room {
	private Long id;//����id
	private String photo;//����ͼƬ
	private String sn;//������
	private Long roomTypeId;//����id
	private Long floorId;//����¥��id
	private int status;//����״̬��0������ס,1:����ס,2:��ɨ��
	private String remark;//���ͱ�ע
	
}
