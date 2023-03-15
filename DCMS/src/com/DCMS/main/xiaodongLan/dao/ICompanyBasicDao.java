package com.DCMS.main.xiaodongLan.dao;

import com.DCMS.main.xiaodongLan.bean.Company;

/**
 * @author 兰晓东
 * @create 2023-03-11 11:03
 * @describe:
 */
public interface ICompanyBasicDao {

    Company getOneById(String id);
}
