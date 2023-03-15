package com.DCMS.main.deyiFan.controller;

import com.alibaba.fastjson.JSON;

import com.DCMS.main.deyiFan.entity.Person;
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
 * @date 2023/3/11 9:20
 * @description TODO
 */
@WebServlet("/persons/analyze")
public class PersonGetAllServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        String begin = req.getParameter("begin");
        String end = req.getParameter("end");

        System.out.println("1");
        System.out.println(type);
        System.out.println(begin);
        System.out.println(end);

        PersonsService personsService = new PersonsServiceImpl();
        List<Person> typeAll = personsService.getAll(type, begin, end);
        List<Person> ageAll = personsService.getAge(type, begin, end);
        List<Person> areaAll = personsService.getArea(type, begin, end);
        List<Person> types = personsService.getType( begin, end);

        System.out.println("areaAll:"+areaAll);


        Result result = new Result(0, "", typeAll, ageAll,areaAll,types);
        String all = JSON.toJSONString(result);
        resp.getWriter().println(all);



    }
}
