package com.sunwj.mybatis.bean;


import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("emp")
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;



    @Override
    public String toString() {
        return "Employee [id=" + id + ", lastName=" + lastName + ", email="
                + email + ", gender=" + gender + "]";
    }


}
