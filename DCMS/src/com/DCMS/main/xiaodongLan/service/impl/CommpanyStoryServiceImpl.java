package com.DCMS.main.xiaodongLan.service.impl;

import com.DCMS.main.xiaodongLan.bean.CompanyStory;
import com.DCMS.main.xiaodongLan.bean.CompanyStoryQuery;
import com.DCMS.main.xiaodongLan.bean.Result;
import com.DCMS.main.xiaodongLan.dao.ICommpanyStoryDao;
import com.DCMS.main.xiaodongLan.dao.impl.CommpanyStoryDaoImpl;
import com.DCMS.main.xiaodongLan.service.ICommpanyStoryService;

import java.util.List;

/**
 * @author 兰晓东
 * @create 2023-03-10 21:23
 * @describe:
 */
public class CommpanyStoryServiceImpl implements ICommpanyStoryService {

    private ICommpanyStoryDao iCommpanyStoryDao = new CommpanyStoryDaoImpl();


    @Override
    public Result getAll(CompanyStoryQuery cq) {
        List<CompanyStory> all = iCommpanyStoryDao.getAll(cq);
        return new Result(200,"发送成功",all);
    }
}
