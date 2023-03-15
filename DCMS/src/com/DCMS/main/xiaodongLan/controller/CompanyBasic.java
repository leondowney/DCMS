package com.DCMS.main.xiaodongLan.controller;

import com.alibaba.fastjson.JSON;
import com.DCMS.main.xiaodongLan.bean.Result;
import com.DCMS.main.xiaodongLan.service.ICompanyBasicService;
import com.DCMS.main.xiaodongLan.service.impl.CompanyBasicServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 兰晓东
 * @create 2023-03-11 11:00
 * @describe:
 */
@WebServlet("/company/companyBasic/getOneById")
public class CompanyBasic extends HttpServlet {

    private static ICompanyBasicService iCompanyBasicService = new CompanyBasicServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Result one = iCompanyBasicService.getOne(id);
        String s = JSON.toJSONString(one);
        resp.getWriter().println(s);
    }
}
