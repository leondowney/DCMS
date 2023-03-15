package com.DCMS.main.deyiFan.service.impl;



import com.DCMS.main.deyiFan.dao.PersonsDao;
import com.DCMS.main.deyiFan.dao.impl.PersonDaoImpl;
import com.DCMS.main.deyiFan.entity.Line;
import com.DCMS.main.deyiFan.entity.Person;
import com.DCMS.main.deyiFan.service.PersonsService;

import java.util.List;

/**
 * @author fandeyi
 * @date 2023/3/11 9:18
 * @description TODO
 */
public class PersonsServiceImpl implements PersonsService {
    @Override
    public List<Line> getLine() {
        PersonsDao goodsDao = new PersonDaoImpl();
        return goodsDao.getLine();
    }

    @Override
    public List<Person> getType(String begin, String end) {
        PersonsDao goodsDao = new PersonDaoImpl();
        return goodsDao.getType(begin,end);
    }

    @Override
    public List<Person> getAll(String type, String begin, String end) {
        PersonsDao goodsDao = new PersonDaoImpl();
        return goodsDao.getAll(type,begin,end);
    }

    @Override
    public List<Person> getAge(String type, String begin, String end) {
        PersonsDao goodsDao = new PersonDaoImpl();
        return goodsDao.getAge(type,begin,end);
    }

    @Override
    public List<Person> getArea(String type, String begin, String end) {
        PersonsDao goodsDao = new PersonDaoImpl();
        return goodsDao.getArea(type,begin,end);
    }
}
