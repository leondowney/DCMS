package com.DCMS.main.deyiFan.dao.impl;

import com.DCMS.main.deyiFan.entity.Company;

import com.DCMS.main.deyiFan.entity.Person;
import com.DCMS.main.deyiFan.util.DButil;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author fandeyi
 * @date 2023/3/10 16:55
 * @description TODO
 */
public class dao {

    public static void main(String[] args) {
        QueryRunner runner = new QueryRunner(DButil.getDataSource());
        List<Company> companies = null;
        try {
            companies = runner.query("select * from company", new BeanListHandler<>(Company.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        System.out.println(companies);
        List<Person> goods =null;
        try {
            goods = runner.query("select type01 as name,count(*) as value from company group by type01", new BeanListHandler<Person>(Person.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        System.out.println(goods);

    }


}
