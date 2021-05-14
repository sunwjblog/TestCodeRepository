package com.sunwj.mybatis;

import com.sunwj.mybatis.bean.Department;
import com.sunwj.mybatis.bean.Employee;
import com.sunwj.mybatis.mapper.DepartmentMapper;
import com.sunwj.mybatis.mapper.EmployeeMapper;
import com.sunwj.mybatis.mapper.EmployeeMapperAnnotation;
import com.sunwj.mybatis.mapper.EmployeeMapperDynamicSQL;
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
    public void testBatchSave() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try{
            EmployeeMapperDynamicSQL mapper = openSession.getMapper(EmployeeMapperDynamicSQL.class);
            List<Employee> emps = new ArrayList<>();
            emps.add(new Employee(null, "smith0x1", "smith0x1@atguigu.com", "1",new Department(1)));
            emps.add(new Employee(null, "allen0x1", "allen0x1@atguigu.com", "0",new Department(1)));
            mapper.addEmps(emps);
            openSession.commit();
        }finally{
            openSession.close();
        }
    }

    @Test
    public void testDynamicSql() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try{
            EmployeeMapperDynamicSQL mapper = openSession.getMapper(EmployeeMapperDynamicSQL.class);
            //select * from tbl_employee where id=? and last_name like ?
            //测试if\where
            Employee employee = new Employee(1000, "赵四", null, null);
			List<Employee> emps = mapper.getEmpsByConditionIf(employee );
			for (Employee emp : emps) {
				System.out.println(emp);
			}

            //查询的时候如果某些条件没带可能sql拼装会有问题
            //1、给where后面加上1=1，以后的条件都and xxx.
            //2、mybatis使用where标签来将所有的查询条件包括在内。mybatis就会将where标签中拼装的sql，多出来的and或者or去掉
            //where只会去掉第一个多出来的and或者or。

            //测试Trim
			List<Employee> emps2 = mapper.getEmpsByConditionTrim(employee);
			for (Employee emp : emps2) {
				System.out.println(emp);
			}


            //测试choose
			List<Employee> list = mapper.getEmpsByConditionChoose(employee);
			for (Employee emp : list) {
				System.out.println(emp);
			}

            //测试set标签
			/*mapper.updateEmp(employee);
			openSession.commit();*/

            List<Employee> list1 = mapper.getEmpsByConditionForeach(Arrays.asList(1000,1004));
            for (Employee emp : list1) {
                System.out.println(emp);
            }

        }finally{
            openSession.close();
        }
    }

}
