package com.lg.entity.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * ��סʵ����
 *
 * @author Leron
 */
@Data
@Component
public class Checkin {
    private Long id;//��סid
    private Long roomId;//����id
    private Long roomTypeId;//����id
    private Float checkinPrice;//��ס�۸�
    private String name;//��ס������
    private String idCard;//���֤����
    private String mobile;//�ֻ���
    private int status;//״̬��0����ס�У�1���ѽ������
    private String arriveDate;//��ס����
    private String leaveDate;//�������
    private Date createTime;//����ʱ��
    private Long bookOrderId;//Ԥ������id����Ϊ��
    private String remark;

}
