package com.DCMS.main.yangLi.Dao;

import com.DCMS.main.yangLi.Bean.Dangerousc;
import com.DCMS.main.yangLi.Bean.DangerouscCondition;
import com.DCMS.main.yangLi.Bean.Zs;
import com.DCMS.main.yangLi.utils.DbUtils;
import com.DCMS.main.yangLi.utils.StringUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import java.sql.SQLException;
import java.util.List;

/**
 * author: 李洋
 * datetime:2023/3/10 11:26
 * email:1473321819@qq.com
 *
 * @description:
 */
public class DcDaoimpl implements  IDcDao {
    QueryRunner runner = new QueryRunner(DbUtils.getDataSource());
    @Override
    public List<Dangerousc> getAll(DangerouscCondition dc) {
        Integer cid = dc.getCid();
        String hth = dc.getHth();//合同号
        String htmc = dc.getHtmc();
        String htrq = dc.getHtrq();

        boolean bHth = StringUtil.isNull(hth);
        boolean bHtrq = StringUtil.isNull(htrq);

        try {
            if (bHth && bHtrq) {
             return    runner.query("select * from dangerousc where cid=? and name like ?",
                        new BeanListHandler<>(Dangerousc.class),cid,"%"+htmc+"%");
            }
            if (!bHth && bHtrq) {
                return     runner.query("select * from dangerousc where cid=? and name like ? and no=? ",
                        new BeanListHandler<>(Dangerousc.class),cid,"%"+htmc+"%",hth);
            }

            if (bHth && !bHtrq) {
                return    runner.query("select * from dangerousc where cid=? and name like ? and time=?",
                        new BeanListHandler<>(Dangerousc.class),cid,"%"+htmc+"%",htrq);
            }

            if (!bHth && !bHtrq) {
                return    runner.query("select * from dangerousc where cid=? and name like ? and no=? and time=?",
                        new BeanListHandler<>(Dangerousc.class),cid,"%"+htmc+"%" ,hth,htrq);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return null;
    }

    @Override
     public List<Zs> getone(Integer id) {
        try {
           return runner.query("select a.date,b.* from ljb a LEFT JOIN zs b on a.zid=b.id where a.cid=?",new BeanListHandler<>(Zs.class),id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
