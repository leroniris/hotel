package com.lg.entity.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 角色role实体
 *
 * @author Leron
 */
@Data
@Component
public class Role {

    private Long id;
    private String name;
    private String remark;//角色备注
}
