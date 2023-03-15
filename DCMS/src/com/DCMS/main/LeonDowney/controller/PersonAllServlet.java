package com.DCMS.main.LeonDowney.controller;

import com.alibaba.fastjson.JSON;
import com.DCMS.main.LeonDowney.entity.PersonCondition;
import com.DCMS.main.LeonDowney.entity.Result;
import com.DCMS.main.LeonDowney.service.PersonService;
import com.DCMS.main.LeonDowney.service.impl.PersonServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leon Downey
 * @date 2023/3/12 10:13
 * @describe： 员工查所有
 */
@WebServlet("/person/getAll")

public class PersonAllServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String num = req.getParameter("num");
        String company = req.getParameter("company");

//        System.out.println(name);
//        System.out.println(num);
//        System.out.println(company);

        PersonCondition cc = new PersonCondition(name,num,company);

        PersonService personService = new PersonServiceImpl();


        Result all = personService.getAll(cc);

        String s = JSON.toJSONString(all);

        resp.getWriter().println(s);

//        System.out.println(all);

    }
}
