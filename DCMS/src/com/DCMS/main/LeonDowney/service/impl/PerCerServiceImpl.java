package com.DCMS.main.LeonDowney.service.impl;

import com.DCMS.main.LeonDowney.dao.PerCerDao;
import com.DCMS.main.LeonDowney.dao.impl.PerCerDaoImpl;
import com.DCMS.main.LeonDowney.entity.Certification;
import com.DCMS.main.LeonDowney.entity.Result;
import com.DCMS.main.LeonDowney.service.PerCerService;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/14 09:22
 * @describe：
 */
public class PerCerServiceImpl implements PerCerService {
    PerCerDao perCerDao=new PerCerDaoImpl();
    @Override
    public Result getAll(Integer id) {
        List<Certification> cerList = perCerDao.getAll(id);

        Result rs = new Result(0,"查询成功!",cerList);


        return rs;
    }

}
