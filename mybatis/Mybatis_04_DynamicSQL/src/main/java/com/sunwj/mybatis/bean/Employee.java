package com.sunwj.mybatis.bean;

import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

@Alias("emp")
@Data
@Accessors(chain = true)
public class Employee {
	
	private Integer id;
	private String lastName;
	private String email;
	private String gender;
	private Department dept;


	public Employee() {
		super();
	}



	public Employee(Integer id, String lastName, String email, String gender,
					Department dept) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dept = dept;
	}



	public Employee(Integer id, String lastName, String email, String gender) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", email="
				+ email + ", gender=" + gender + "]";
	}
	
	

}
