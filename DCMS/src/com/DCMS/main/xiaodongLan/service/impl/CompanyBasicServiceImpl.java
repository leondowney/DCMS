package com.DCMS.main.xiaodongLan.service.impl;

import com.DCMS.main.xiaodongLan.bean.Company;
import com.DCMS.main.xiaodongLan.bean.Result;
import com.DCMS.main.xiaodongLan.dao.ICompanyBasicDao;
import com.DCMS.main.xiaodongLan.dao.impl.CompanyBasicDaoImpl;
import com.DCMS.main.xiaodongLan.service.ICompanyBasicService;

/**
 * @author 兰晓东
 * @create 2023-03-11 11:04
 * @describe:
 */
public class CompanyBasicServiceImpl implements ICompanyBasicService {

    private ICompanyBasicDao companyBasicDao = new CompanyBasicDaoImpl();
    @Override
    public Result getOne(String id) {
        Company company = companyBasicDao.getOneById(id);
        return new Result(200,"发送成功",company);
    }
}
