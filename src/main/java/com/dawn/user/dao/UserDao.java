package com.dawn.user.dao;

import com.dawn.user.model.po.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : leonwang
 * @Descpriction
 * @Date:created 2020/5/23
 */
public interface UserDao extends JpaRepository<UserPO, Long> {
}
