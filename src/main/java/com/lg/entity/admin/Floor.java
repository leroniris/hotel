package com.lg.entity.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * ¥��ʵ����
 *
 * @author Leron
 */
@Data
@Component
public class Floor {
    private Long id;//¥��id
    private String name;//¥������
    private String remark;//¥�㱸ע
}
