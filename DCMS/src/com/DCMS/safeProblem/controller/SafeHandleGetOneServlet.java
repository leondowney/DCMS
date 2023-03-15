package com.DCMS.safeProblem.controller;

import com.DCMS.safeProblem.entity.Result;
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
@WebServlet("/safeHandle/getOne")
public class SafeHandleGetOneServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = Integer.valueOf(req.getParameter("id"));

        SafeHandleService safeHandleService = new SafeHandleServiceImpl();

        Result rs = safeHandleService.getOne(id);

        String s = JSON.toJSONString(rs);

        resp.getWriter().println(s);
    }
}
