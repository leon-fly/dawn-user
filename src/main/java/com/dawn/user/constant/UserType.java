package com.dawn.user.constant;

import lombok.Getter;

/**
 * @Author : leonwang
 * @Descpriction
 * @Date:created 2020/5/24
 */
@Getter
public enum UserType {
    //c端业务用户
    CUSTOMER_PERSONAL("CP", "个人用户"),

    //管理平台用户
    PLATFORM_USER("PU","平台用户");

    private String code;
    private String desc;

    UserType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
