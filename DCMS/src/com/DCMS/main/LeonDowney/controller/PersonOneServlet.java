package com.DCMS.main.LeonDowney.controller;

import com.alibaba.fastjson.JSON;
import com.DCMS.main.LeonDowney.entity.Result;
import com.DCMS.main.LeonDowney.service.PersonOneService;
import com.DCMS.main.LeonDowney.service.impl.PersonOneServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leon Downey
 * @date 2023/3/13 14:27
 * @describe： 员工条件查询
 */
@WebServlet("/person/getOne")
public class PersonOneServlet extends HttpServlet {
    private static PersonOneService personOneService = new PersonOneServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Result one = personOneService.getOne(id);
        String s = JSON.toJSONString(one);
        resp.getWriter().println(s);
//        System.out.println(one);
    }
}
