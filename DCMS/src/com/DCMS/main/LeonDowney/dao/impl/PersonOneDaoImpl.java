package com.DCMS.main.LeonDowney.dao.impl;

import com.DCMS.main.LeonDowney.dao.PersonOneDao;
import com.DCMS.main.LeonDowney.entity.Person;
import com.DCMS.main.LeonDowney.util.DButil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @author Leon Downey
 * @date 2023/3/13 14:23
 * @describe：
 */
public class PersonOneDaoImpl implements PersonOneDao {

    QueryRunner runner = new QueryRunner(DButil.getDataSource());
    @Override
    public Person getOneById(String id) {
        String sql = "select * from person where id = ?";
        try {
            return runner.query(sql,new BeanHandler<Person>(Person.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
