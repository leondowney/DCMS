package com.DCMS.main.yangLi.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * author: 李洋
 * datetime:2023/2/16 14:00
 * email:1473321819@qq.com
 *
 * @description:
 */
public class DButilplus {
    private static final Properties pp = new Properties();

    static {
        InputStream s = DButilplus.class.getResourceAsStream("/db.properties");
        try {
            pp.load(s);
            try {
                Class.forName(pp.getProperty("driver"));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public  static  Connection getCollection(){
        Connection con =null;
        try {
          con = DriverManager.getConnection(pp.getProperty("url"), pp.getProperty("username"), pp.getProperty("password"));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return con;
    }
    public static  void closeAll(Connection conn, Statement statement, ResultSet resultSet){
        try {
            if (conn!=null){
                conn.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (resultSet!=null){
                resultSet.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
