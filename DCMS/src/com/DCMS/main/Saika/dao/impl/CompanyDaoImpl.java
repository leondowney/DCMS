package com.DCMS.main.Saika.dao.impl;

import com.DCMS.main.Saika.dao.CompanyDao;
import com.DCMS.main.Saika.entity.*;
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
public class CompanyDaoImpl implements CompanyDao {

    QueryRunner queryRunner = new QueryRunner(DBUtil.getDruidDataSource());
    @Override
    public List<Company> getAll(CompanyCondition cc) {

        String name = cc.getName();
        String location = cc.getLocation();
        String type = cc.getType();

        boolean bLocation = StringUtil.isNull(location);
        boolean bType = StringUtil.isNull(type);

        try {
            if (bLocation&bType) {
                return queryRunner.query("select * from company where name like ?",
                        new BeanListHandler<>(Company.class),"%"+name+"%");
            }
            if (bLocation&!bType) {
                return queryRunner.query("select * from company where name like ? and type=?",
                        new BeanListHandler<>(Company.class),"%"+name+"%",type);
            }
            if (!bLocation&bType) {
                return queryRunner.query("select * from company where name like ? and location=?",
                        new BeanListHandler<>(Company.class),"%"+name+"%",location);
            }
            if (!bLocation&!bType) {
                return queryRunner.query("select * from company where name like ? and type=? and location=?",
                        new BeanListHandler<>(Company.class),"%"+name+"%",type,location);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<CompanyAnalysis> getAnalysisType01(CompanyCondition cc) {

        String type = cc.getType();
        String begin = cc.getBegin();
        String end = cc.getEnd();

        boolean bType = StringUtil.isNull(type);
        boolean bBegin = StringUtil.isNull(begin);
        boolean bEnd = StringUtil.isNull(end);

        String sql1 = "select type01 as 'name',count(*) as 'value' from company";
        String sql2 = " where";
        String sql3 = " and";
        String sql4 = " type = ?";
        String sql5 = " time > ?";
        String sql6 = " time < ?";
        String sql7 = " group by type01";

        try {
            if (bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql7,new BeanListHandler<>(CompanyAnalysis.class));
            }
            if (!bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql7,new BeanListHandler<>(CompanyAnalysis.class),type);
            }
            if (bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql7,new BeanListHandler<>(CompanyAnalysis.class),begin);
            }
            if (bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql6+sql7,new BeanListHandler<>(CompanyAnalysis.class),end);
            }
            if (!bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql7,new BeanListHandler<>(CompanyAnalysis.class),type,begin);
            }
            if (!bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql6+sql7,new BeanListHandler<>(CompanyAnalysis.class),type,end);
            }
            if (bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql3+sql6+sql7,new BeanListHandler<>(CompanyAnalysis.class),begin,end);
            }
            if (!bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql3+sql6+sql7,
                        new BeanListHandler<>(CompanyAnalysis.class),type,begin,end);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<CompanyAnalysis> getAnalysisLocation(CompanyCondition cc) {

        String type = cc.getType();
        String begin = cc.getBegin();
        String end = cc.getEnd();

        boolean bType = StringUtil.isNull(type);
        boolean bBegin = StringUtil.isNull(begin);
        boolean bEnd = StringUtil.isNull(end);

        String sql1 = "select location as 'name',count(*) as 'value' from company";
        String sql2 = " where";
        String sql3 = " and";
        String sql4 = " type = ?";
        String sql5 = " time > ?";
        String sql6 = " time < ?";
        String sql7 = " group by location";

        try {
            if (bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql7,new BeanListHandler<>(CompanyAnalysis.class));
            }
            if (!bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql7,new BeanListHandler<>(CompanyAnalysis.class),type);
            }
            if (bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql7,new BeanListHandler<>(CompanyAnalysis.class),begin);
            }
            if (bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql6+sql7,new BeanListHandler<>(CompanyAnalysis.class),end);
            }
            if (!bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql7,new BeanListHandler<>(CompanyAnalysis.class),type,begin);
            }
            if (!bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql6+sql7,new BeanListHandler<>(CompanyAnalysis.class),type,end);
            }
            if (bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql3+sql6+sql7,new BeanListHandler<>(CompanyAnalysis.class),begin,end);
            }
            if (!bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql3+sql6+sql7,
                        new BeanListHandler<>(CompanyAnalysis.class),type,begin,end);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<CompanySuperposition> getAnalysisTAndL(CompanyCondition cc) {

        String type = cc.getType();
        String begin = cc.getBegin();
        String end = cc.getEnd();

        boolean bType = StringUtil.isNull(type);
        boolean bBegin = StringUtil.isNull(begin);
        boolean bEnd = StringUtil.isNull(end);

        String sql1 = "select location,type01,count(*) as count from company";
        String sql2 = " where";
        String sql3 = " and";
        String sql4 = " type = ?";
        String sql5 = " time > ?";
        String sql6 = " time < ?";
        String sql7 = " group by location,type01";

        try {
            if (bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql7,new BeanListHandler<>(CompanySuperposition.class));
            }
            if (!bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql7,new BeanListHandler<>(CompanySuperposition.class),type);
            }
            if (bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql7,new BeanListHandler<>(CompanySuperposition.class),begin);
            }
            if (bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql6+sql7,new BeanListHandler<>(CompanySuperposition.class),end);
            }
            if (!bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql7,new BeanListHandler<>(CompanySuperposition.class),type,begin);
            }
            if (!bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql6+sql7,new BeanListHandler<>(CompanySuperposition.class),type,end);
            }
            if (bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql3+sql6+sql7,new BeanListHandler<>(CompanySuperposition.class),begin,end);
            }
            if (!bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql3+sql6+sql7,
                        new BeanListHandler<>(CompanySuperposition.class),type,begin,end);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<CompanySuperposition> getDistinctLocation(CompanyCondition cc) {

        String type = cc.getType();
        String begin = cc.getBegin();
        String end = cc.getEnd();

        boolean bType = StringUtil.isNull(type);
        boolean bBegin = StringUtil.isNull(begin);
        boolean bEnd = StringUtil.isNull(end);

        String sql1 = "select DISTINCT location from company";
        String sql2 = " where";
        String sql3 = " and";
        String sql4 = " type = ?";
        String sql5 = " time > ?";
        String sql6 = " time < ?";

        try {
            if (bType && bBegin && bEnd) {
                return queryRunner.query(sql1,new BeanListHandler<>(CompanySuperposition.class));
            }
            if (!bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4,new BeanListHandler<>(CompanySuperposition.class),type);
            }
            if (bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql5,new BeanListHandler<>(CompanySuperposition.class),begin);
            }
            if (bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql6,new BeanListHandler<>(CompanySuperposition.class),end);
            }
            if (!bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5,new BeanListHandler<>(CompanySuperposition.class),type,begin);
            }
            if (!bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql6,new BeanListHandler<>(CompanySuperposition.class),type,end);
            }
            if (bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql3+sql6,new BeanListHandler<>(CompanySuperposition.class),begin,end);
            }
            if (!bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql3+sql6,
                        new BeanListHandler<>(CompanySuperposition.class),type,begin,end);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<CompanyLineChart> getLineChart(CompanyCondition cc) {

        String type = cc.getType();
        String begin = cc.getBegin();
        String end = cc.getEnd();

        boolean bType = StringUtil.isNull(type);
        boolean bBegin = StringUtil.isNull(begin);
        boolean bEnd = StringUtil.isNull(end);

        String sql1 = "SELECT type01,date_format(time,'%Y-%m') as month,count(*) as count FROM company";
        String sql2 = " where";
        String sql3 = " and";
        String sql4 = " type = ?";
        String sql5 = " time >= ?";
        String sql6 = " time <= ?";
        String sql7 = " group by type01,month";

        try {
            if (bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql7,new BeanListHandler<>(CompanyLineChart.class));
            }
            if (!bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql7,new BeanListHandler<>(CompanyLineChart.class),type);
            }
            if (bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql7,new BeanListHandler<>(CompanyLineChart.class),begin);
            }
            if (bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql6+sql7,new BeanListHandler<>(CompanyLineChart.class),end);
            }
            if (!bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql7,new BeanListHandler<>(CompanyLineChart.class),type,begin);
            }
            if (!bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql6+sql7,new BeanListHandler<>(CompanyLineChart.class),type,end);
            }
            if (bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql3+sql6+sql7,new BeanListHandler<>(CompanyLineChart.class),begin,end);
            }
            if (!bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql3+sql6+sql7,
                        new BeanListHandler<>(CompanyLineChart.class),type,begin,end);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<CompanyLineChart> getDistinctMonth(CompanyCondition cc) {

        String type = cc.getType();
        String begin = cc.getBegin();
        String end = cc.getEnd();

        boolean bType = StringUtil.isNull(type);
        boolean bBegin = StringUtil.isNull(begin);
        boolean bEnd = StringUtil.isNull(end);

        String sql1 = "SELECT Distinct date_format(time,'%Y-%m') as month FROM company";
        String sql2 = " where";
        String sql3 = " and";
        String sql4 = " type = ?";
        String sql5 = " time >= ?";
        String sql6 = " time <= ?";
        String sql7 = " order by month asc";

        try {
            if (bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql7,new BeanListHandler<>(CompanyLineChart.class));
            }
            if (!bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql7,new BeanListHandler<>(CompanyLineChart.class),type);
            }
            if (bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql7,new BeanListHandler<>(CompanyLineChart.class),begin);
            }
            if (bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql6+sql7,new BeanListHandler<>(CompanyLineChart.class),end);
            }
            if (!bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql7,new BeanListHandler<>(CompanyLineChart.class),type,begin);
            }
            if (!bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql6+sql7,new BeanListHandler<>(CompanyLineChart.class),type,end);
            }
            if (bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql3+sql6+sql7,new BeanListHandler<>(CompanyLineChart.class),begin,end);
            }
            if (!bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql3+sql6+sql7,
                        new BeanListHandler<>(CompanyLineChart.class),type,begin,end);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
