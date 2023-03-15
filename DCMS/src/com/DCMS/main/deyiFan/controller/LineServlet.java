package com.DCMS.main.deyiFan.controller;

import com.alibaba.fastjson.JSON;
import com.DCMS.main.deyiFan.entity.Line;
import com.DCMS.main.deyiFan.entity.Result;
import com.DCMS.main.deyiFan.service.PersonsService;
import com.DCMS.main.deyiFan.service.impl.PersonsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author fandeyi
 * @date 2023/3/13 21:52
 * @description TODO
 */
@WebServlet("/persons/line")
public class LineServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PersonsService ps = new PersonsServiceImpl();
        List<Line> line = ps.getLine();
        System.out.println("line:"+line);

        Result result = new Result(0, "", line, null, null, null);
        String res = JSON.toJSONString(result);
        resp.getWriter().println(res);
        System.out.println("res:"+res);
    }
}
