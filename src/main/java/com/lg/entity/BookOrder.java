package com.lg.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 预定订单实体类
 * @author Leron
 *
 */
@Data
@Component
public class BookOrder {
	private Long id;//预定订单id
	private Long accountId;//客户id
	private Long roomTypeId;//房型id
	private String name;//预定者姓名
	private String idCard;//身份证号码
	private String mobile;//手机号
	private int status;//状态：0：预定中，1：已入住,2:已结算离店
	private String arriveDate;//入住日期
	private String leaveDate;//离店日期
	private Date createTime;//预定日期
	private String remark;
}
