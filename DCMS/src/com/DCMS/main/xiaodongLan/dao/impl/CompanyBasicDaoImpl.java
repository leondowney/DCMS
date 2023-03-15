package com.DCMS.main.xiaodongLan.dao.impl;

import com.DCMS.main.xiaodongLan.bean.Company;
import com.DCMS.main.xiaodongLan.dao.ICompanyBasicDao;
import com.DCMS.main.xiaodongLan.utils.Dbutils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @author 兰晓东
 * @create 2023-03-11 11:03
 * @describe:
 */
public class CompanyBasicDaoImpl implements ICompanyBasicDao {

    private QueryRunner queryRunner = new QueryRunner(Dbutils.getDs());
    @Override
    public Company getOneById(String id) {
        String sql = "select * from company where id = ?";
        try {
            return queryRunner.query(sql,new BeanHandler<Company>(Company.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
