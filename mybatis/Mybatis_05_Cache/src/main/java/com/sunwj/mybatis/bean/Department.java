package com.sunwj.mybatis.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Department  implements Serializable {
	
	private Integer id;
	private String departmentName;
	private List<Employee> emps;

	public Department(Integer id) {
		super();
		this.id = id;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName
				+ "]";
	}
	
	

}
