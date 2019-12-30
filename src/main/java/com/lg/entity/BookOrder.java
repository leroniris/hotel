package com.lg.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Ԥ������ʵ����
 * @author Leron
 *
 */
@Data
@Component
public class BookOrder {
	private Long id;//Ԥ������id
	private Long accountId;//�ͻ�id
	private Long roomTypeId;//����id
	private String name;//Ԥ��������
	private String idCard;//���֤����
	private String mobile;//�ֻ���
	private int status;//״̬��0��Ԥ���У�1������ס,2:�ѽ������
	private String arriveDate;//��ס����
	private String leaveDate;//�������
	private Date createTime;//Ԥ������
	private String remark;
}
