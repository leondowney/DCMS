package com.DCMS.main.xiaodongLan.service;

import com.DCMS.main.xiaodongLan.bean.CompanyStoryQuery;
import com.DCMS.main.xiaodongLan.bean.Result;

/**
 * @author 兰晓东
 * @create 2023-03-10 21:22
 * @describe:
 */
public interface ICommpanyStoryService {

   Result getAll(CompanyStoryQuery cq);
}
