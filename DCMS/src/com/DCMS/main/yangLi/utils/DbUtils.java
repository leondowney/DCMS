package com.DCMS.main.yangLi.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * author: 李洋
 * datetime:2023/2/17 14:27
 * email:1473321819@qq.com
 *
 * @description:
 */
public class DbUtils {
    //声明一个连接池对象

    public static DruidDataSource ds;

    static {
        Properties pro = new Properties();
        InputStream str = DbUtils.class.getResourceAsStream("/db.properties");
        try {
            pro.load(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ds = (DruidDataSource) DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //获取连接对象
    public static Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    // 返回一个数据源
    public static DataSource getDataSource(){
        return ds;
    }
}
