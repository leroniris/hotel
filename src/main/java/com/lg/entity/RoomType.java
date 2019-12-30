package com.lg.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 房间类型实体类
 * @author Administrator
 *
 */
@Data
@Component
public class RoomType {
	private Long id;//房间类型id
	private String name;//房间名称
	private String photo;//房间类型图片
	private Float price;//房型价格
	private Integer liveNum;//可住人数
	private Integer bedNum;//床位数
	private Integer roomNum;//房间数
	private Integer avilableNum;//可住或可预定房间数
	private Integer bookNum;//预定数
	private Integer livedNum;//已经入住数
	private int status;//房型状态，0：房型已满,1:可预订可入住
	private String remark;//房型备注
}
