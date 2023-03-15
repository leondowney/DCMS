package com.DCMS.main.Saika.controller;

import com.DCMS.main.Saika.entity.AccidentCondition;
import com.DCMS.main.Saika.entity.Result;
import com.DCMS.main.Saika.service.AccidentService;
import com.DCMS.main.Saika.service.impl.AccidentServiceImpl;
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
 * Description：展示单位事故记录servlet(含搜索)
 */
@WebServlet("/company/accident/getAll")
public class AccidentGetAllServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccidentService accidentService = new AccidentServiceImpl();

        String name = req.getParameter("name");
        String level = req.getParameter("level");
        String time = req.getParameter("time");
        Integer cid = Integer.valueOf(req.getParameter("cid"));

        AccidentCondition ac = new AccidentCondition(name,level,time,cid);

        Result result = accidentService.getAll(ac);

        String s = JSON.toJSONString(result);

        resp.getWriter().println(s);
    }
}
