package com.DCMS.main.LeonDowney.service.impl;

import com.DCMS.main.LeonDowney.dao.ExperienceDao;
import com.DCMS.main.LeonDowney.dao.impl.ExperienceDaoImpl;
import com.DCMS.main.LeonDowney.entity.Experience;
import com.DCMS.main.LeonDowney.entity.ExperienceCondition;
import com.DCMS.main.LeonDowney.entity.Result;
import com.DCMS.main.LeonDowney.service.ExperienceService;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/13 17:36
 * @describe：
 */
public class ExperienceServiceImpl implements ExperienceService {
    ExperienceDao experienceDao = new ExperienceDaoImpl();
    @Override
    public Result getAll(ExperienceCondition ec) {
        List<Experience> experienceList = experienceDao.getAll(ec);

        Result rs = new Result(0,"查询成功!",experienceList);

        return rs;

    }

}
