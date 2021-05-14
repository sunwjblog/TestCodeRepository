package com.sunwj.mybatis;

import com.sunwj.mybatis.bean.Employee;
import com.sunwj.mybatis.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

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

    /**
     * 1、根据xml配置（全局配置文件）创建一个SqlSessionFactory对象 和数据源一些运行环境信息
     * 2、sql映射文件，配置了每一个sql，以及sql的封装规则等
     * 3、将sql映射文件注册到全局配置文件中
     * 4、代码：
     *      1、根据全局配置文件得到SqlSessionFactory
     *      2、根据sqlSession工厂，获取到sqlSession对象使用它来执行增删改查
     *          一个sqlSession就是代表和数据库的一次会话，用完关闭
     *      3、使用sql的唯一标志来告诉Mybatis执行那个sql，sql都是保存在sql映射文件中的。
     */
    @Test
    public void test() throws IOException{

        // 2、获取sqlSession实例，能直接执行已经映射的sql语句
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            Employee employee = sqlSession.selectOne("com.sunwj.mybatis.mapper.EmployeeMapper.getEmpById",1000);
            System.out.println(employee);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test01() throws IOException{

        // 获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 获取sqlSession对象
        SqlSession openSession = sqlSessionFactory.openSession();

        try {
            // 获取接口的实现类对象
            // 会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmpById(1000);
            System.out.println(employeeMapper.getClass());
            System.out.println(employee);
        } finally {
            openSession.close();
        }
    }
}
