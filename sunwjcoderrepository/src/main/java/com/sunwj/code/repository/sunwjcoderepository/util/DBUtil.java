/*
package com.sunwj.code.repository.sunwjcoderepository.util;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.lang3.StringUtils;

import javax.sql.DataSource;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

*/
/****************************************
 * @name DBUtil
 * @description 数据库工具类
 * @author 何伟潮
 * @since 2014-4-9
 ***************************************//*


public class DBUtil {

 //数据连接池

	private static DataSource dataSourcePool;

	*/
/*public static DataSource getDataSourcePool(){

		if (dataSourcePool == null)
			initDataSourcePool();

		if(dataSourcePool!=null){
			System.out.println("【DB活动连接："+((BasicDataSource) dataSourcePool).getNumActive()+"】");
			System.out.println("【DB空闲链接："+((BasicDataSource) dataSourcePool).getNumIdle()+"】");
		}

		return dataSourcePool;

	}

// 初始化数据库连接池


    public static void initDataSourcePool() {

    	try {
    		Properties properties =new Properties();
			properties.load(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("dataSource_oracle.properties"));
			BasicDataSource ds = new BasicDataSource();
			ds.setDriverClassName(properties.getProperty("database.driver"));
			ds.setUsername(properties.getProperty("database.user"));
			ds.setPassword(properties.getProperty("database.password"));
			ds.setUrl(properties.getProperty("database.url"));
			ds.setInitialSize(Integer.valueOf(properties.getProperty("database.initialSize")));
			ds.setMaxActive(Integer.valueOf(properties.getProperty("database.maxActive")));
			ds.setMaxIdle(Integer.valueOf(properties.getProperty("database.maxIdle")));
			ds.setMinIdle(Integer.valueOf(properties.getProperty("database.minIdle")));
			ds.setMaxWait(Integer.valueOf(properties.getProperty("database.maxWait")));
			ds.setRemoveAbandoned(properties.getProperty("database.removeAbandoned").equals("true")?true:false);
			ds.setRemoveAbandonedTimeout(Integer.valueOf(properties.getProperty("database.removeAbandonedTimeout")));
			ds.setTestOnBorrow(properties.getProperty("database.TestOnBorrow").equals("true")?true:false);
			ds.setTestOnReturn(properties.getProperty("database.TestOnReturn").equals("true")?true:false);
			ds.setTestWhileIdle(properties.getProperty("database.TestWhileIdle").equals("true")?true:false);
			ds.setValidationQuery(properties.getProperty("database.ValidationQuery"));
			ds.setTimeBetweenEvictionRunsMillis(Long.parseLong(properties.getProperty("database.TimeBetweenEvictionRunsMillis")));
			ds.setNumTestsPerEvictionRun(Integer.valueOf(properties.getProperty("database.NumTestsPerEvictionRun")));
			ds.setMinEvictableIdleTimeMillis(Long.parseLong(properties.getProperty("database.MinEvictableIdleTimeMillis")));

			dataSourcePool = ds;
    	} catch (Exception e) {
    		System.out.println("【DB initDataSourcePool error】");
    	}
    }*//*


*/
/**
     * 查询
     * @param sql prepareStatementSql
     * @param params 参数
     * @return result*//*



    public static String executeQuery(String sql, Object[] params) {
    	Connection conn = null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	String result = "";

    	try{
    		conn = getDataSourcePool().getConnection();
    		pstmt = conn.prepareStatement(sql);
    		if(params!=null){
    			for(int i=1;i<=params.length;i++){
        			pstmt.setString(i,(String)params[i-1]);
        		}
    		}
    		rs = pstmt.executeQuery();
			int numcols = rs.getMetaData().getColumnCount();
			StringBuffer sb = new StringBuffer("");
			while (rs.next()) {
				for (int i = 1; i <= numcols; i++) {
					if (i == numcols) {
						sb.append(rs.getString(i)).append("#KP2#");
					} else {
						sb.append(rs.getString(i)).append("#KP#");
					}
				}
			}
			if (StringUtils.isNotEmpty(sb.toString())) {
				result = sb.substring(0, sb.length()-5).replace("null", "");
            }

    	}catch(Exception e){}finally{
    		try{
    			if(rs != null){
    				rs.close();
    			}
    		}catch(Exception e){}

    		try{
    			if(pstmt != null){
    				pstmt.close();
    			}
    		}catch(Exception e){}

    		try{
    			if(conn != null){
    				conn.close();
    			}
    		}catch(Exception e){}
    	}

    	return result;
    }

*/
/**
     * 查询
     * @param sql prepareStatementSql
     * @param params 参数
     * @return result(result,value,log)*//*



    public static Map<String,String> executeQueryToMap(String sql, Object[] params) {
    	Connection conn = null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	Map<String,String> result = new HashMap<String, String>();

    	try{
    		conn = getDataSourcePool().getConnection();
    		pstmt = conn.prepareStatement(sql);
    		if(params!=null){
    			for(int i=1;i<=params.length;i++){
        			pstmt.setString(i,(String)params[i-1]);
        		}
    		}
    		rs = pstmt.executeQuery();
			int numcols = rs.getMetaData().getColumnCount();
			StringBuffer sb = new StringBuffer("");
			while (rs.next()) {
				for (int i = 1; i <= numcols; i++) {
					if (i == numcols) {
						sb.append(rs.getString(i)).append("#KP2#");
					} else {
						sb.append(rs.getString(i)).append("#KP#");
					}
				}
			}
			if (StringUtils.isNotEmpty(sb.toString())) {
				result.put("result", "0");
				result.put("value", sb.substring(0, sb.length()-5).replace("null", ""));
            }else{
            	result.put("result", "0");
				result.put("value", "");
            }

    	}catch(Exception e){
    		result.put("result", "-1");
//			result.put("log", CommonUtil.getExceptionInfo(e));
    	}finally{
    		try{
    			if(rs != null){
    				rs.close();
    			}
    		}catch(Exception e){}

    		try{
    			if(pstmt != null){
    				pstmt.close();
    			}
    		}catch(Exception e){}

    		try{
    			if(conn != null){
    				conn.close();
    			}
    		}catch(Exception e){}
    	}

    	return result;
    }

*/
/**
     * 更改
     * @param sql
     * @param params
     * @return*//*



    public static Integer executeUpdate(String sql , Object[] params){

    	Connection conn = null;
    	PreparedStatement pstmt = null;
    	int result = 0;

    	try{
    		conn = getDataSourcePool().getConnection();
    		pstmt = conn.prepareStatement(sql);
    		if(params!=null){
    			for(int i=1;i<=params.length;i++){
        			pstmt.setString(i,(String)params[i-1]);
        		}
    		}
    		result=pstmt.executeUpdate();

    	}catch(Exception e){} finally{
    		try{
    			if (pstmt != null){
    				pstmt.close();
    			}
    		}catch(Exception e){}

    		try{
    			if (conn != null){
    				conn.close();
    			}
    		}catch(Exception e){}
    	}

    	return result;
    }

*/
/**
     * 更改
     * @param sql
     * @param params
     * @return result(result,value,log)*//*



    public static Map<String,String> executeUpdateToMap(String sql , Object[] params){

    	Connection conn = null;
    	PreparedStatement pstmt = null;
    	int ret = 0;
    	Map<String,String> result = new HashMap<String, String>();

    	try{
    		conn = getDataSourcePool().getConnection();
    		pstmt = conn.prepareStatement(sql);
    		if(params!=null){
    			for(int i=1;i<=params.length;i++){
        			pstmt.setString(i,(String)params[i-1]);
        		}
    		}
    		ret=pstmt.executeUpdate();
    		result.put("result", String.valueOf(ret));
    	}catch(Exception e){
    		result.put("result","-1");
    		//result.put("log",CommonUtil.getExceptionInfo(e));
    	} finally{
    		try{
    			if (pstmt != null){
    				pstmt.close();
    			}
    		}catch(Exception e){}

    		try{
    			if (conn != null){
    				conn.close();
    			}
    		}catch(Exception e){}
    	}

    	return result;
    }

*/
/**
     * 批量更改
     * @param sql
     * @param params
     * @return*//*



    public static Integer executeUpdate(String sql , List<String[]> params){

    	Connection conn = null;
    	PreparedStatement pstmt = null;
    	int result = 0;

    	try{
    		conn = getDataSourcePool().getConnection();
    		pstmt = conn.prepareStatement(sql);
    		conn.setAutoCommit(false);
    		String[] strs;
    		for(int i=0;i<params.size();i++){
    			strs = params.get(i);
    			for(int j=1;j<=strs.length;j++){
    				pstmt.setString(j, strs[j-1]);
    			}
    			pstmt.addBatch();
    		}
//获取更新结果数

    		int [] rs = pstmt.executeBatch();
    		conn.commit();
    		for(int r:rs){
    			result+=r;
    		}
    	}catch(Exception e){} finally{
    		try{
    			if (pstmt != null){
    				pstmt.close();
    			}
    		}catch(Exception e){}

    		try{
    			if (conn != null){
    				conn.close();
    			}
    		}catch(Exception e){}
    	}

    	return result;
    }

*/
/**
     * 批量更改
     * @param sql
     * @param params
     * @return result(result,value,log)*//*



    public static Map<String,String> executeUpdateToMap(String sql , List<String[]> params){

    	Connection conn = null;
    	PreparedStatement pstmt = null;
    	int ret = 0;
    	Map<String,String> result = new HashMap<String, String>();

    	try{
    		conn = getDataSourcePool().getConnection();
    		pstmt = conn.prepareStatement(sql);
    		conn.setAutoCommit(false);
    		String[] strs;
    		for(int i=0;i<params.size();i++){
    			strs = params.get(i);
    			for(int j=1;j<=strs.length;j++){
    				pstmt.setString(j, strs[j-1]);
    			}
    			pstmt.addBatch();
    		}
//获取更新结果数

    		int [] rs = pstmt.executeBatch();
    		conn.commit();
    		for(int r:rs){
    			ret+=r;
    		}
    		result.put("result", String.valueOf(ret));
    	}catch(Exception e){
    		result.put("result","-1");
    		//result.put("log",CommonUtil.getExceptionInfo(e));
    	} finally{
    		try{
    			if (pstmt != null){
    				pstmt.close();
    			}
    		}catch(Exception e){}

    		try{
    			if (conn != null){
    				conn.close();
    			}
    		}catch(Exception e){}
    	}

    	return result;
    }

*/
/**
     * 批量更改
     * @param sql
     * @param params
     * @return*//*



    public static Integer executeUpdate(Object[] sqls ){

    	Connection conn = null;
    	Statement stmt = null;
    	int result = 0;

    	try{
    		conn = getDataSourcePool().getConnection();
    		stmt = conn.createStatement();
    		conn.setAutoCommit(false);
    		for(int i=0;i<sqls.length;i++){
    			stmt.addBatch((String)sqls[i]);
    		}
//获取更新结果数

    		int [] rs = stmt.executeBatch();
    		conn.commit();
    		for(int r:rs){
    			result+=r;
    		}
    	}catch(Exception e){
    		try {
				conn.rollback();
				result = 0;
			} catch (SQLException e1) {}
    	} finally{
    		try{
    			if (stmt != null){
    				stmt.close();
    			}
    		}catch(Exception e){}

    		try{
    			if (conn != null){
    				conn.close();
    			}
    		}catch(Exception e){}
    	}

    	return result;
    }

*/
/**
     * 批量更改
     * @param sql
     * @param params
     * @return (result,value,log)*//*



    public static Map<String,String> executeUpdateToMap(Object[] sqls ){

    	Connection conn = null;
    	Statement stmt = null;
    	int ret = 0;
    	Map<String,String> result = new HashMap<String, String>();

    	try{
    		conn = getDataSourcePool().getConnection();
    		stmt = conn.createStatement();
    		conn.setAutoCommit(false);
    		for(int i=0;i<sqls.length;i++){
    			stmt.addBatch((String)sqls[i]);
    		}
//获取更新结果数

    		int [] rs = stmt.executeBatch();
    		conn.commit();
    		for(int r:rs){
    			ret+=r;
    		}
    		result.put("result", String.valueOf(ret));
    	}catch(Exception e){

    		try {
				conn.rollback();
				result.put("result","0");
				//result.put("log",CommonUtil.getExceptionInfo(e));
			} catch (SQLException e1) {
				result.put("result","-1");
				//result.put("log",CommonUtil.getExceptionInfo(e1));
			}
    	}finally{
    		try{
    			if (stmt != null){
    				stmt.close();
    			}
    		}catch(Exception e){}

    		try{
    			if (conn != null){
    				conn.close();
    			}
    		}catch(Exception e){}
    	}

    	return result;
    }

}
*/
