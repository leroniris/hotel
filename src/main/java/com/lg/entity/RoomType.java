package com.lg.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * ��������ʵ����
 * @author Administrator
 *
 */
@Data
@Component
public class RoomType {
	private Long id;//��������id
	private String name;//��������
	private String photo;//��������ͼƬ
	private Float price;//���ͼ۸�
	private Integer liveNum;//��ס����
	private Integer bedNum;//��λ��
	private Integer roomNum;//������
	private Integer avilableNum;//��ס���Ԥ��������
	private Integer bookNum;//Ԥ����
	private Integer livedNum;//�Ѿ���ס��
	private int status;//����״̬��0����������,1:��Ԥ������ס
	private String remark;//���ͱ�ע
}
