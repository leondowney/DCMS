package com.DCMS.main.Saika.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Author：jiangtao_liu
 * Date：2023/2/23
 * Description：
 */
public class DBUtil {

    private static DruidDataSource druidDataSource;
    private static final Properties PROPERTIES = new Properties();

    static {
        try {
            InputStream is = DBUtil.class.getResourceAsStream("/db.properties");
            PROPERTIES.load(is);
            druidDataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(PROPERTIES);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection () {
        try {
            return druidDataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DruidDataSource getDruidDataSource() {
        return druidDataSource;
    }
}
