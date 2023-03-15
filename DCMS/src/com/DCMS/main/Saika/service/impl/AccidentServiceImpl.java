package com.DCMS.main.Saika.service.impl;

import com.DCMS.main.Saika.dao.AccidentDao;
import com.DCMS.main.Saika.dao.impl.AccidentDaoImpl;
import com.DCMS.main.Saika.entity.Accident;
import com.DCMS.main.Saika.entity.AccidentCondition;
import com.DCMS.main.Saika.entity.Result;
import com.DCMS.main.Saika.service.AccidentService;

import java.util.List;
/**
 * Author：jiangtao_liu
 * Date：2023/3/10
 * Description：
 */
public class AccidentServiceImpl implements AccidentService {

    AccidentDao accidentDao = new AccidentDaoImpl();
    @Override
    public Result getAll(AccidentCondition ac) {

        List<Accident> accidentList = accidentDao.getAll(ac);

        Result rs = new Result(0,"查询成功!",accidentList);

        return rs;



    }
}
