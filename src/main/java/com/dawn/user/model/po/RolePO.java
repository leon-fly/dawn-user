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
@Table(name = "dawn_role")
@Getter
@Setter
public class RolePO extends BasePO {
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;
}
