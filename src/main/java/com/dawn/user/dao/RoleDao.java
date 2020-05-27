package com.dawn.user.dao;

import com.dawn.user.model.po.RolePO;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Author : leonwang
 * @Descpriction
 * @Date:created 2020/5/23
 */
public interface RoleDao extends PagingAndSortingRepository<RolePO, Long> {

}
