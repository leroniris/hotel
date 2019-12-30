package com.lg.entity.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 楼层实体类
 *
 * @author Leron
 */
@Data
@Component
public class Floor {
    private Long id;//楼层id
    private String name;//楼层名称
    private String remark;//楼层备注
}
