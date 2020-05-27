package com.dawn.user.model.po;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author : leonwang
 * @Descpriction
 * @Date:created 2020/5/5
 */
@Entity
@DynamicInsert
@Table(name = "dawn_user")
@Setter
@Getter
public class UserPO extends BasePO {
    @Column(name = "openid")
    private String openid;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private String sex;

    @Column(name = "password")
    private String password;

    @Column(name = "id_no")
    private String idNo;

    @Column(name = "id_type")
    private String idType;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "enabled")
    @ColumnDefault("1")
    private String enabled;
}
