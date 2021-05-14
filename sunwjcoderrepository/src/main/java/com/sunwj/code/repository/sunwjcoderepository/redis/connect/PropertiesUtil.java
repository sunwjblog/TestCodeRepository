package com.sunwj.code.repository.sunwjcoderepository.redis.connect;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Properties;

/**
 * <p>Description: Properties配置文件加载类</p>
 *
 * @author TANHAIHAN
 * @version 1.0
 * @date 2019年11月17日
 */
public class PropertiesUtil {

//	private static Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);

    private static Properties props;

    static {
        String fileName = "redis.properties";
        props = new Properties();
        try {
            InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(fileName);
            props.load(new InputStreamReader(inputStream, RedisConstants.DEFAULT_ENCODING));
        } catch (IOException e) {
//			logger.error("redis配置文件读取异常", e);
        }
    }

    private static String getValue(String key) {
        String systemProperty = System.getProperty(key);
        if (systemProperty != null) {
            return systemProperty;
        }
        if (props.containsKey(key)) {
            return props.getProperty(key);
        }
        return "";
    }

    private static String getProperty(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return value;
    }

    private static String getProperty(String key, String defaultValue) {
        String value = getValue(key);
        return value != null ? value : defaultValue;
    }

    public static String getString(String key) {
        return getProperty(key);
    }

    public static String getString(String key, String defaultValue) {
        return getProperty(key, defaultValue);
    }

    public static int getInt(String key, int defaultVal) {
        int result = defaultVal;
        try {
            result = Integer.parseInt(getString(key));
        } catch (Exception e) {
            System.err.println("String conversion to integer failed");
        }
        return result;
    }

    public static float getFloat(String key, float defaultVal) {
        float result = defaultVal;
        try {
            result = Float.parseFloat(getString(key));
        } catch (Exception e) {
            System.err.println("String conversion to float failed");
        }
        return result;
    }

    public static double getDouble(String key, double defaultVal) {
        double result = defaultVal;
        try {
            result = Double.parseDouble(getString(key));
        } catch (Exception e) {
            System.err.println("String conversion to double failed");
        }
        return result;
    }

    public static long getLong(String key, long defaultVal) {
        long result = defaultVal;
        try {
            result = Long.parseLong(getString(key));
        } catch (Exception e) {
            System.err.println("String conversion to long failed");
        }
        return result;
    }

    public static boolean getBoolean(String key, boolean defaultVal) {
        boolean result = defaultVal;
        try {
            result = Boolean.parseBoolean(getString(key));
        } catch (Exception e) {
            System.err.println("String conversion to boolean failed");
        }
        return result;
    }
}
