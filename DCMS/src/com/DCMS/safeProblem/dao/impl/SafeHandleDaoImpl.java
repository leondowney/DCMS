package com.DCMS.safeProblem.dao.impl;

import com.DCMS.safeProblem.dao.SafeHandleDao;
import com.DCMS.safeProblem.entity.SafeHandle;
import com.DCMS.safeProblem.entity.SafeHandleCondition;
import com.DCMS.safeProblem.util.DBUtil;
import com.DCMS.safeProblem.util.StringUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author：jiangtao_liu
 * Date：2023/3/14
 * Description：
 */
public class SafeHandleDaoImpl implements SafeHandleDao {
    QueryRunner runner = new QueryRunner(DBUtil.getDruidDataSource());
    @Override
    public List<SafeHandle> getAll(SafeHandleCondition shc) {

        //模糊查询条件
        String title = shc.getTitle();
        String company = shc.getCompany();

        Object[] params = new Object[]{"%"+title+"%","%"+company+"%"};

        //精确查询条件
        String level = shc.getLevel();
        String link = shc.getLink();
        String stats = shc.getStats();
        String begin = shc.getBegin();
        String end = shc.getEnd();

        List<String> cList = new ArrayList<>();
        cList.add(level);
        cList.add(link);
        cList.add(stats);
        cList.add(begin);
        cList.add(end);

        String sql = "select * from safehandle where title like ? and company like ?";
        String sql1 = " and level=?";
        String sql2 = " and link=?";
        String sql3 = " and stats=?";
        String sql4 = " and discoverTime >=?";
        String sql5 = " and discoverTime <=?";
        String[] sqlArr = new String[]{sql1,sql2,sql3,sql4,sql5};


        for (int i = 0; i < cList.size();i++) {
            if (!StringUtil.isNull(cList.get(i))){
                sql += sqlArr[i];
                params = Arrays.copyOf(params,params.length+1);
                params[params.length - 1] = cList.get(i);
            }
        }


        try {
            return runner.query(sql,new BeanListHandler<>(SafeHandle.class),params);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public SafeHandle getOne(Integer id) {

        try {
            return runner.query("select * from safehandle where id=?",new BeanHandler<>(SafeHandle.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Integer update(SafeHandle safeHandle) {

        try {
            return runner.update("update safehandle set title=?,link=?,level=?,content=?,company=?,person=?,discoverTime=?," +
                            "assignTime=?,part=?,stats=?,result=?,handTime=?,closeTime=? where id=?",
                    safeHandle.getTitle(),safeHandle.getLink(),safeHandle.getLevel(),safeHandle.getContent(),
                    safeHandle.getCompany(),safeHandle.getPerson(),safeHandle.getDiscoverTime(),safeHandle.getAssignTime(),
                    safeHandle.getPart(),safeHandle.getStats(),safeHandle.getResult(),safeHandle.getHandTime(),
                    safeHandle.getCloseTime(),safeHandle.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Integer add(SafeHandle safeHandle) {

        try {
            return runner.update("insert into safehandle(title,link,level,content,company,person,discoverTime," +
                    "assignTime,part,stats,result,handTime,closeTime) values (?,?,?,?,?,?,?,?,?,?,?,?,?)",
                    safeHandle.getTitle(),safeHandle.getLink(),safeHandle.getLevel(),safeHandle.getContent(),
                    safeHandle.getCompany(),safeHandle.getPerson(),safeHandle.getDiscoverTime(),safeHandle.getAssignTime(),
                    safeHandle.getPart(),safeHandle.getStats(),safeHandle.getResult(),safeHandle.getHandTime(),
                    safeHandle.getCloseTime());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
