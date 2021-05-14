package com.sunwj.mybatis.bean;

import lombok.Data;

import java.util.List;

@Data
public class Department {
	
	private Integer id;
	private String departmentName;
	private List<Employee> emps;
	
	
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName
				+ "]";
	}
	
	

}
