package com.lg.entity.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 房间实体类
 * @author Leron
 *
 */
@Data
@Component
public class Room {
	private Long id;//房间id
	private String photo;//房间图片
	private String sn;//房间编号
	private Long roomTypeId;//房型id
	private Long floorId;//所属楼层id
	private int status;//房型状态，0：可入住,1:已入住,2:打扫中
	private String remark;//房型备注
	
}
