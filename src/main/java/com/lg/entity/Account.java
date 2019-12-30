package com.lg.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 客户实体类
 * @author Administrator
 *
 */
@Component
@Data
public class Account {
	private Long id;//客户id
	private String name;//客户登录名
	private String password;//客户登录密码
	private String realName;//真实姓名
	private String idCard;//身份证号码
	private String mobile;//手机号
	private String address;//联系地址
	private int status;//状态：0：可用，-1：冻结

}
