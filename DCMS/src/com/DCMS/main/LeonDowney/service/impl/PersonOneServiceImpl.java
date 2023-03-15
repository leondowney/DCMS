package com.DCMS.main.LeonDowney.service.impl;

import com.DCMS.main.LeonDowney.dao.PersonOneDao;
import com.DCMS.main.LeonDowney.dao.impl.PersonOneDaoImpl;
import com.DCMS.main.LeonDowney.entity.Person;
import com.DCMS.main.LeonDowney.entity.Result;
import com.DCMS.main.LeonDowney.service.PersonOneService;

/**
 * @author Leon Downey
 * @date 2023/3/13 14:25
 * @describe：
 */
public class PersonOneServiceImpl implements PersonOneService {
    private PersonOneDao personOneDao = new PersonOneDaoImpl();
    @Override
    public Result getOne(String id) {
        Person person = personOneDao.getOneById(id);
        return new Result(200,"发送成功",person);
    }
}
