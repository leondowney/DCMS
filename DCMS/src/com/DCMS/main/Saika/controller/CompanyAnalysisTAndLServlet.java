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
 * Date：2023/3/11
 * Description：叠加柱状图servlet(by区域&类型)
 */
@WebServlet("/company/analysisTAndL")
public class CompanyAnalysisTAndLServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String type = req.getParameter("type");
        String begin = req.getParameter("begin");
        String end = req.getParameter("end");

        CompanyCondition cc = new CompanyCondition(begin,end);
        cc.setType(type);

        CompanyService companyService = new CompanyServiceImpl();

        Result result = companyService.getAnalysisTAndL(cc);

        String s = JSON.toJSONString(result);

        resp.getWriter().println(s);
    }
}
