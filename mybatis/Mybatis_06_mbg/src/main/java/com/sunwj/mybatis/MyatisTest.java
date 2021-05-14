package com.sunwj.mybatis;

import com.sunwj.mybatis.bean.Employee;
import com.sunwj.mybatis.bean.EmployeeExample;
import com.sunwj.mybatis.bean.EmployeeExampleExample;
import com.sunwj.mybatis.mapper.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * 1、接口式编程
 *  原生 ： Dao  -- > DaoImpl
 *  mybatis: Mapper --> xxMapper.xml
 *
 * 2、SqlSession代表和数据库的一次会话；用完必须关闭；
 * 3、SqlSession和connection一样它都是非线程安全的。每次使用都应该去获取新的对象。
 * 4、mapper没有实现类，但是mybatis会为这个接口生成一个代理对象（将接口和xml进行绑定）
 *  如：
 *      EmpoyeeMapper empMapper = sqlSession.getMapper(EmployeeMapper.class)；
 * 5、两个重要的配置文件：
 *      mybatis的全局配置文件：包含数据库连接池信息，事务管理信息等...系统运行环境信息
 *      sql映射文件：保存了每一个sql语句的映射信息：将sql抽取出来。
 *
 * @date 2021/5/1 1:56 下午
 */
public class MyatisTest {

    public SqlSessionFactory getSqlSessionFactory() throws IOException{

        String resource = "mybatis-config.xml";
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 构建SqlSeesionFactory实例
        return new SqlSessionFactoryBuilder().build(inputStream);
    }


    @Test
    public void testMyBatis3Simple() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try{
            EmployeeExampleMapper mapper = openSession.getMapper(EmployeeExampleMapper.class);
            List<EmployeeExample> list = mapper.selectByExample(null);
            for (EmployeeExample employee : list) {
                System.out.println(employee.getId());
            }
        }finally{
            openSession.close();
        }
    }

    @Test
    public void testMyBatis3() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try{
            EmployeeExampleMapper mapper = openSession.getMapper(EmployeeExampleMapper.class);
            //xxxExample就是封装查询条件的
            //1、查询所有
            //List<Employee> emps = mapper.selectByExample(null);
            //2、查询员工名字中有e字母的，和员工性别是1的
            //封装员工查询条件的example
            EmployeeExampleExample example = new EmployeeExampleExample();
            //创建一个Criteria，这个Criteria就是拼装查询条件
            //select id, last_name, email, gender, d_id from tbl_employee
            //WHERE ( last_name like ? and gender = ? ) or email like "%e%"
            EmployeeExampleExample.Criteria criteria = example.createCriteria();

            criteria.andLastNameLike("%e%");
            criteria.andGenderEqualTo("1");

            EmployeeExampleExample.Criteria criteria2 = example.createCriteria();
            criteria2.andEmailLike("%e%");
            example.or(criteria2);

            List<EmployeeExample> list = mapper.selectByExample(example);
            for (EmployeeExample employee : list) {
                System.out.println(employee.getId());
            }

        }finally{
            openSession.close();
        }
    }

}
