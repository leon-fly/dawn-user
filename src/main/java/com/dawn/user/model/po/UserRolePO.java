package com.dawn.user.model.po;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author : leonwang
 * @Descpriction
 * @Date:created 2020/5/5
 */
@Entity
@Table(name = "dawn_user_role")
@Getter
@Setter
public class UserRolePO extends BasePO {
    @Column(name = "user_id")
    private String userId;

    @Column(name = "role_id")
    private String roleId;
}
