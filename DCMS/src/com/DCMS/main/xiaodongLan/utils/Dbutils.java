package com.DCMS.main.xiaodongLan.utils;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author 兰晓东
 * @create 2023-03-10 11:41
 * @describe:
 */
public class Dbutils {

    private static Properties pp = new Properties();
    private static DruidDataSource ds;
    static {
        InputStream is = Dbutils.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            pp.load(is);
             ds = (DruidDataSource) DruidDataSourceFactory.createDataSource(pp);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            return  ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static DruidDataSource getDs(){
        return ds;
    }

}
