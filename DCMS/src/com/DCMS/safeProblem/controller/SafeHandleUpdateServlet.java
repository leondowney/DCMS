package com.DCMS.safeProblem.controller;

import com.DCMS.safeProblem.entity.Result;
import com.DCMS.safeProblem.entity.SafeHandle;
import com.DCMS.safeProblem.service.SafeHandleService;
import com.DCMS.safeProblem.service.impl.SafeHandleServiceImpl;
import com.DCMS.safeProblem.util.StringUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author：jiangtao_liu
 * Date：2023/3/14
 * Description：
 */
@WebServlet("/safeHandle/update")
public class SafeHandleUpdateServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Integer id = Integer.valueOf(req.getParameter("id"));
        String title = req.getParameter("title");
        String link = req.getParameter("link");
        String level = req.getParameter("level");
        String content = req.getParameter("content");
        String company = req.getParameter("company");
        String person = req.getParameter("person");
        String part = req.getParameter("part");
        String stats = req.getParameter("stats");
        String result = req.getParameter("result");

        SafeHandle safeHandle = new SafeHandle();

        try {
            if (!StringUtil.isNull(req.getParameter("discoverTime"))){
                Date discoverTime = format.parse(req.getParameter("discoverTime"));
                safeHandle.setDiscoverTime(discoverTime);
            }
            if (!StringUtil.isNull(req.getParameter("assignTime"))){
                Date assignTime = format.parse(req.getParameter("assignTime"));
                safeHandle.setAssignTime(assignTime);
            }
            if (!StringUtil.isNull(req.getParameter("handTime"))){
                Date handTime = format.parse(req.getParameter("handTime"));
                safeHandle.setHandTime(handTime);
            }
            if (!StringUtil.isNull(req.getParameter("closeTime"))){
                Date closeTime = format.parse(req.getParameter("closeTime"));
                safeHandle.setCloseTime(closeTime);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        safeHandle.setId(id);
        safeHandle.setTitle(title);
        safeHandle.setLevel(level);
        safeHandle.setLink(link);
        safeHandle.setContent(content);
        safeHandle.setCompany(company);
        safeHandle.setPerson(person);
        safeHandle.setPart(part);
        safeHandle.setStats(stats);
        safeHandle.setResult(result);

        System.out.println("stats:" + stats);
        SafeHandleService safeHandleService = new SafeHandleServiceImpl();
        Result update = safeHandleService.update(safeHandle);

        String s = JSON.toJSONString(update);

        resp.getWriter().println(s);
    }
}
