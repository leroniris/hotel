package com.lg.entity.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 用户实体类
 *
 * @author Leron
 */
@Component
@Data
public class User {
    private Long id;//用户id，设置自增
    private String username;//用户名，登录名
    private String password;//登录密码
    private Long roleId;//所属角色id
    private String photo;//头像照片地址
    private int sex;//性别0,代表未知，1代表男，2代表女
    private Integer age;//年龄
    private String address;//家庭住址

}
