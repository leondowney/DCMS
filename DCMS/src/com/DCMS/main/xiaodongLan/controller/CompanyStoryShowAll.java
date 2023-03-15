package com.DCMS.main.xiaodongLan.controller;

import com.alibaba.fastjson.JSON;
import com.DCMS.main.xiaodongLan.bean.CompanyStoryQuery;
import com.DCMS.main.xiaodongLan.bean.Result;
import com.DCMS.main.xiaodongLan.service.ICommpanyStoryService;
import com.DCMS.main.xiaodongLan.service.impl.CommpanyStoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 兰晓东
 * @create 2023-03-10 21:26
 * @describe:
 */
@WebServlet("/company/companyStory/getAll")
public class CompanyStoryShowAll extends HttpServlet {

    private ICommpanyStoryService iCommpanyStoryService = new CommpanyStoryServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String companyId = req.getParameter("companyId");
        String proName = req.getParameter("proName");
        String proTime = req.getParameter("proTime");
        CompanyStoryQuery companyStoryQuery = new CompanyStoryQuery();
        companyStoryQuery.setId(id == null ? "" : id);
        companyStoryQuery.setCompanyId(Integer.parseInt(companyId));
        companyStoryQuery.setProName(proName == null ? "" : proName);
        companyStoryQuery.setProTime(proTime == null ? "": proTime);
        Result all = iCommpanyStoryService.getAll(companyStoryQuery);
        String s = JSON.toJSONString(all);
        resp.getWriter().println(s);
    }
}
