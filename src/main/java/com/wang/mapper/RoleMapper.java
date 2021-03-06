package com.wang.mapper;

import com.wang.model.RoleDto;
import com.wang.model.UserDto;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * RoleMapper
 * @author Wang926454
 * @date 2018/8/31 14:42
 */
public interface RoleMapper extends Mapper<RoleDto> {
    /**
     * 根据User查询Role
     * @param userDto
     * @return java.util.List<com.wang.model.RoleDto>
     * @author Wang926454
     * @date 2018/8/31 11:30
     */
    public List<RoleDto> findRoleByUser(UserDto userDto);
}