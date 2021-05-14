package com.sunwj.mybatis.mapper;

import com.sunwj.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Select;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/4 1:23 上午
 */
public interface EmployeeMapperAnnotation {

    @Select("select * from tbl_employee where id=#{id}")
    public Employee getEmpById(Integer id);
}
