package com.lg.entity.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * ��ɫroleʵ��
 *
 * @author Leron
 */
@Data
@Component
public class Role {

    private Long id;
    private String name;
    private String remark;//��ɫ��ע
}
