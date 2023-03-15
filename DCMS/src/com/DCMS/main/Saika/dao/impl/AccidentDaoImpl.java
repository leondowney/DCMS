package com.DCMS.main.Saika.dao.impl;

import com.DCMS.main.Saika.dao.AccidentDao;
import com.DCMS.main.Saika.entity.Accident;
import com.DCMS.main.Saika.entity.AccidentCondition;
import com.DCMS.main.Saika.util.DBUtil;
import com.DCMS.main.Saika.util.StringUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Author：jiangtao_liu
 * Date：2023/3/10
 * Description：
 */
public class AccidentDaoImpl implements AccidentDao {

    QueryRunner queryRunner = new QueryRunner(DBUtil.getDruidDataSource());

    @Override
    public List<Accident> getAll(AccidentCondition ac) {

        String name = ac.getName();
        String level = ac.getLevel();
        String time = ac.getTime();
        Integer cid = ac.getCid();

        boolean bLevel = StringUtil.isNull(level);
        boolean bDate = StringUtil.isNull(time);

        try {
            if (bLevel&bDate){
                return queryRunner.query("select * from accident where name like ? and cid=?",
                        new BeanListHandler<>(Accident.class),"%"+name+"%",cid);
            }
            if (bLevel&!bDate){
                return queryRunner.query("select * from accident where name like ? and time = ? and cid=?",
                        new BeanListHandler<>(Accident.class),"%"+name+"%", time,cid);
            }
            if (!bLevel&bDate){
                return queryRunner.query("select * from accident where name like ? and level = ? and cid=?",
                        new BeanListHandler<>(Accident.class),"%"+name+"%",level,cid);
            }
            if (!bLevel&!bDate){
                return queryRunner.query("select * from accident where name like ? and time = ? and level=? and cid=?",
                        new BeanListHandler<>(Accident.class),"%"+name+"%", time,level,cid);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
