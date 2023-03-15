package com.DCMS.main.xiaodongLan.dao;

import com.DCMS.main.xiaodongLan.bean.CompanyStory;
import com.DCMS.main.xiaodongLan.bean.CompanyStoryQuery;

import java.util.List;

/**
 * @author 兰晓东
 * @create 2023-03-10 21:00
 * @describe:  商品列表
 */
public interface ICommpanyStoryDao {

    List<CompanyStory> getAll(CompanyStoryQuery cq);

}
