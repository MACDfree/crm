package me.macd.mapper;

import me.macd.pojo.Role;

import java.util.List;

public interface RoleMapper {
    /**
     * 根据用户ID查找具有的角色列表
     * @param userId
     * @return
     */
    List<Role> findByUserId(Integer userId);


}
