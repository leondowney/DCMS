package com.DCMS.main.LeonDowney.controller;

import com.alibaba.fastjson.JSON;
import com.DCMS.main.LeonDowney.entity.Result;
import com.DCMS.main.LeonDowney.service.PerCerService;
import com.DCMS.main.LeonDowney.service.impl.PerCerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leon Downey
 * @date 2023/3/14 09:24
 * @describe： 员工资质
 */
@WebServlet("/person/certification/getAll")
public class PerCerServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer pid = Integer.parseInt(req.getParameter("pid"));

        PerCerService perCerService=new PerCerServiceImpl();

        Result result = perCerService.getAll(pid);

        String s = JSON.toJSONString(result);

        resp.getWriter().println(s);

    }
}
