package com.DCMS.main.deyiFan.dao.impl;



import com.DCMS.main.deyiFan.dao.PersonsDao;
import com.DCMS.main.deyiFan.entity.Line;
import com.DCMS.main.deyiFan.entity.Person;
import com.DCMS.main.deyiFan.util.DButil;
import com.DCMS.main.deyiFan.util.StringUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author fandeyi
 * @date 2023/3/10 21:27
 * @description TODO
 */
public class PersonDaoImpl implements PersonsDao {

    //折现查询
    @Override
    public List<Line> getLine() {
        QueryRunner runner = new QueryRunner(DButil.getDataSource());

        List<Line> line =null;
        String sql = "SELECT type name, count(*) count ,CONCAT(YEAR(time)  ,'-',MONTH(time)) AS time FROM company GROUP BY type,time";

        try {
             line = runner.query(sql, new BeanListHandler<Line>(Line.class));
            System.out.println("line~~~"+line);
            return line;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return null;
    }

    //查询公司分类
    @Override
    public List<Person> getType( String begin, String end) {
        QueryRunner runner = new QueryRunner(DButil.getDataSource());

        List<Person> Persons =null;
        try {
            System.out.println(3.0);

            Persons = runner.query("select type as name,count(*) as value from company where   time between ? and ? group by type",new BeanListHandler<>(Person.class),begin,end);
//            Persons = runner.query("select type01 as name,count(*) as value from company where type = ? and time between ? and ? group by type01", new BeanListHandler<Person>(Person.class),type,begin,end);

            System.out.println("type~~~");
            System.out.println(Persons);
            return Persons;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


    //查询危险品
    @Override
    public List<Person> getAll(String type, String begin, String end) {
        QueryRunner runner = new QueryRunner(DButil.getDataSource());
        List<Person> Persons =null;
        if (StringUtil.isNull(type)){
            String sql="select type01 as name,count(*) as value from company where  time between ? and ? group by type01";
            try {
                System.out.println(3.0);

                Persons = runner.query(sql,new BeanListHandler<>(Person.class),begin,end);
                System.out.println(3);
                System.out.println(Persons);
                return Persons;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }else {
            try {
                System.out.println(3.0);

                Persons = runner.query("select type01 as name,count(*) as value from company where type = ? and time between ? and ? group by type01",
                        new BeanListHandler<>(Person.class),type,begin,end);

                System.out.println(3);
                System.out.println(Persons);
                return Persons;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return null;
    }

    //查询年龄
    @Override
    public List<Person> getAge(String type, String begin, String end) {
        QueryRunner runner = new QueryRunner(DButil.getDataSource());

        List<Person> Persons =null;

        if (StringUtil.isNull(type)){
            try {
                String sql = "select   case when ( age >= 18 and age <= 25 ) then '青年' when ( age >= 26 and age <= 35 ) then '中年' when ( age >= 36 and age <= 60 ) then '壮年' when ( age >= 61 ) then '老年' else '其他' end 'name' ,count( * ) as value from person,company where person.name=company.person and time between  ? and ?  group by case when ( age >= 18 and age <= 25 ) then '青年' when ( age >= 26 and age <= 35 ) then '中年' when ( age >= 36 and age <= 60 ) then '壮年'  when ( age >= 61 ) then '老年' else '其他' end ";
                Persons = runner.query(sql,
                        new BeanListHandler<Person>(Person.class),begin,end);


                System.out.println(99999);
                System.out.println(Persons);
                return Persons;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }else {
        try {
            System.out.println(4.0);

               Persons = runner.query("select   case when ( age >= 18 and age <= 25 ) then '青年' when ( age >= 26 and age <= 35 ) then '中年' when ( age >= 36 and age <= 60 ) then '壮年' when ( age >= 61 ) then	'老年' else '其他' end 'name' ,count( * ) as value from person,company where person.name=company.person and type=? and time between  ? and ?  group by case when ( age >= 18 and age <= 25 ) then '青年' when ( age >= 26 and age <= 35 ) then '中年' when ( age >= 36 and age <= 60 ) then '壮年'  when ( age >= 61 ) then '老年' else '其他' end ",
                       new BeanListHandler<Person>(Person.class),type,begin,end);


            System.out.println(44444);
            System.out.println(Persons);
            return Persons;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        }
        return null;
    }

    //查询区域
    @Override
    public List<Person> getArea(String type, String begin, String end) {

        QueryRunner runner = new QueryRunner(DButil.getDataSource());
        List<Person> Persons = null;
        if (StringUtil.isNull(type)){

            String sql="select   case when ( location ='大同市' or location ='朔州市' or location ='忻州市' ) then '北区' when ( location ='运城市' or location ='晋城市' or location ='临汾市' or location='长治市' ) then '南区' when (location ='太原市' or location ='晋中市' ) then '中区' when (location ='吕梁市' ) then '西区' when (location ='阳泉市' ) then '东区'  end 'name',count( * ) value  from company where   time between  ? and ?  group by case when ( location ='大同市' or location ='朔州市' or location ='忻州市' ) then '北区'  when ( location ='运城市' or location ='晋城市' or location ='临汾市' or location='长治市' ) then '南区' when (location ='太原市' or location ='晋中市' ) then '中区' when (location ='吕梁市' ) then '西区' when (location ='阳泉市' ) then '东区'  end ";
            try {

                Persons  = runner.query(sql,   new BeanListHandler<Person>(Person.class),begin,end);

                return Persons;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }else {
            try {

                Persons = runner.query("select   case when ( location ='大同市' or location ='朔州市' or location ='忻州市' ) then '北区' when ( location ='运城市' or location ='晋城市' or location ='临汾市' or location='长治市' ) then '南区' when (location ='太原市' or location ='晋中市' ) then '中区' when (location ='吕梁市' ) then '西区' when (location ='阳泉市' ) then '东区'  end 'name',count( * ) value  from company where type = ? and time between  ? and ?  group by case when ( location ='大同市' or location ='朔州市' or location ='忻州市' ) then '北区'  when ( location ='运城市' or location ='晋城市' or location ='临汾市' or location='长治市' ) then '南区' when (location ='太原市' or location ='晋中市' ) then '中区' when (location ='吕梁市' ) then '西区' when (location ='阳泉市' ) then '东区'  end ",
                        new BeanListHandler<Person>(Person.class), type, begin, end);

                return Persons;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
