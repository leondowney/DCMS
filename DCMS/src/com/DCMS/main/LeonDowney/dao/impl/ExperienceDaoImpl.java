package com.DCMS.main.LeonDowney.dao.impl;

import com.DCMS.main.LeonDowney.dao.ExperienceDao;
import com.DCMS.main.LeonDowney.entity.Experience;
import com.DCMS.main.LeonDowney.entity.ExperienceCondition;
import com.DCMS.main.LeonDowney.util.DButil;
import com.DCMS.main.LeonDowney.util.StringUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/13 17:23
 * @describe：
 */
public class ExperienceDaoImpl implements ExperienceDao {
    QueryRunner runner = new QueryRunner(DButil.getDataSource());

    @Override
    public List<Experience> getAll(ExperienceCondition ec) {

        String name = ec.getName();
        String type = ec.getType();
        Integer pid=ec.getPid();



            try {
                if (StringUtil.isNull(name) &StringUtil.isNull(type)){
                    return runner.query("select * from experience where pid=?",
                            new BeanListHandler<>(Experience.class),pid);
                }
                if (!StringUtil.isNull(name) &StringUtil.isNull(type)){
                    return runner.query("select * from experience where name like ? and pid=?",
                            new BeanListHandler<>(Experience.class),"%"+name+"%",pid);
                }
                if (StringUtil.isNull(name) &!StringUtil.isNull(type)){
                    return runner.query("select * from experience where type=? and pid=?",
                            new BeanListHandler<>(Experience.class),type,pid);
                }
                if (!(StringUtil.isNull(name) &StringUtil.isNull(type))){
                    return runner.query("select * from experience where name like ? and type=? and pid=?",
                            new BeanListHandler<>(Experience.class),"%"+name+"%",type,pid);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return null;
        }
    }

