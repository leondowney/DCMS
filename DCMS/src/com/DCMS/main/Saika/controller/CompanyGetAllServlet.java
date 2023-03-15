package com.DCMS.main.Saika.controller;

import com.DCMS.main.Saika.entity.CompanyCondition;
import com.DCMS.main.Saika.entity.Result;
import com.DCMS.main.Saika.service.CompanyService;
import com.DCMS.main.Saika.service.impl.CompanyServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author：jiangtao_liu
 * Date：2023/3/10
 * Description：展示所有单位servlet(含搜索)
 */
@WebServlet("/company/getAll")
public class CompanyGetAllServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String location = req.getParameter("location");
        String type = req.getParameter("type");

        CompanyService companyService = new CompanyServiceImpl();

        CompanyCondition cc = new CompanyCondition(name,location,type);

        Result result = companyService.getAll(cc);

        String s = JSON.toJSONString(result);

        resp.getWriter().println(s);

    }
}
