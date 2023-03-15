package com.DCMS.safeProblem.controller;

import com.DCMS.safeProblem.entity.Result;
import com.DCMS.safeProblem.entity.SafeHandleCondition;
import com.DCMS.safeProblem.service.SafeHandleService;
import com.DCMS.safeProblem.service.impl.SafeHandleServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author：jiangtao_liu
 * Date：2023/3/14
 * Description：
 */
@WebServlet("/safeHandle/getAll")
public class SafeHandleGetAllServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String title = req.getParameter("title");
        String level = req.getParameter("level");
        String link = req.getParameter("link");
        String company = req.getParameter("company");
        String stats = req.getParameter("stats");
        String begin = req.getParameter("begin");
        String end = req.getParameter("end");

        SafeHandleCondition shc = new SafeHandleCondition(title,link,level,company,stats,begin,end);

        SafeHandleService safeHandleService = new SafeHandleServiceImpl();

        Result rs = safeHandleService.getAll(shc);

        String s = JSON.toJSONString(rs);

        resp.getWriter().println(s);

    }
}
