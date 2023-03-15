package com.DCMS.main.LeonDowney.service.impl;

import com.DCMS.main.LeonDowney.dao.PersonDao;
import com.DCMS.main.LeonDowney.dao.impl.PersonDaoImpl;
import com.DCMS.main.LeonDowney.entity.PersonCondition;
import com.DCMS.main.LeonDowney.entity.Result;
import com.DCMS.main.LeonDowney.entity.Person;
import com.DCMS.main.LeonDowney.service.PersonService;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/12 10:09
 * @describe：
 */
public class PersonServiceImpl implements PersonService {
    @Override
    public Result getAll(PersonCondition cc) {
        PersonDao personDao = new PersonDaoImpl();

        List<Person> all = personDao.getAll(cc);


        return new Result(0,"",all);
    }

    @Override
    public Integer getCount() {
        PersonDao personDao = new PersonDaoImpl();

        return  personDao.getCount().intValue();
    }
}
