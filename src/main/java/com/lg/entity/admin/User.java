package com.lg.entity.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * �û�ʵ����
 *
 * @author Leron
 */
@Component
@Data
public class User {
    private Long id;//�û�id����������
    private String username;//�û�������¼��
    private String password;//��¼����
    private Long roleId;//������ɫid
    private String photo;//ͷ����Ƭ��ַ
    private int sex;//�Ա�0,����δ֪��1�����У�2����Ů
    private Integer age;//����
    private String address;//��ͥסַ

}
