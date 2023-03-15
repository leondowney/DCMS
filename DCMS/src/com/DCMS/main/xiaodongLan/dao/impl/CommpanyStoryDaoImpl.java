package com.DCMS.main.xiaodongLan.dao.impl;

import com.DCMS.main.xiaodongLan.bean.CompanyStory;
import com.DCMS.main.xiaodongLan.bean.CompanyStoryQuery;
import com.DCMS.main.xiaodongLan.dao.ICommpanyStoryDao;
import com.DCMS.main.xiaodongLan.utils.Dbutils;
import com.DCMS.main.xiaodongLan.utils.StringUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 兰晓东
 * @create 2023-03-10 21:05
 * @describe: 公司产品列表实体类
 */
public class CommpanyStoryDaoImpl implements ICommpanyStoryDao {
    private QueryRunner queryRunner = new QueryRunner(Dbutils.getDs());

    @Override
    public List<CompanyStory> getAll(CompanyStoryQuery cq) {

        Integer companyId = cq.getCompanyId();
        String id = cq.getId();
        String proName = cq.getProName();
        String proTime = cq.getProTime();


        boolean idEmpty = StringUtils.isEmpty(id);
        boolean format1Empty = StringUtils.isEmpty(proTime);
        String sql = null;
        try {
            if(idEmpty && format1Empty){
                sql = "select * from companystroy where id = ? and companyId = ? and proName like ? and proTime = ?";
                Object[] params = {id,companyId,"%"+proName+"%",proTime};
                return queryRunner.query(sql,new BeanListHandler<CompanyStory>(CompanyStory.class),params);
            }

            if(!idEmpty && !format1Empty){
                sql = "select * from companystroy where companyId = ? and proName like ?";
                Object[] params = {companyId,"%"+proName+"%"};
                return queryRunner.query(sql,new BeanListHandler<CompanyStory>(CompanyStory.class),params);
            }

            if(idEmpty && !format1Empty){
                sql = "select * from companystroy where companyId = ? and proName like ? and id = ? ";
                Object[] params = {companyId,"%"+proName+"%",id};
                return queryRunner.query(sql,new BeanListHandler<CompanyStory>(CompanyStory.class),params);
            }

            if(!idEmpty && format1Empty){
                sql = "select * from companystroy where companyId = ? and proName like ? and proTime = ?  ";
                Object[] params = {companyId,"%"+proName+"%",proTime};
                return queryRunner.query(sql,new BeanListHandler<CompanyStory>(CompanyStory.class),params);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
