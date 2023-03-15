package com.DCMS.main.yangLi.Controller;

import com.alibaba.fastjson.JSON;
import com.DCMS.main.yangLi.Bean.Result;
import com.DCMS.main.yangLi.Servise.DcServiseimpl;
import com.DCMS.main.yangLi.Servise.IDcService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * author: 李洋
 * datetime:2023/3/11 14:45
 * email:1473321819@qq.com
 *
 * @description:
 */
@WebServlet("/company/record/getone")
public class ZsServlet  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer cid = Integer.parseInt(req.getParameter("cid"));


        IDcService iDcService=new DcServiseimpl();
       List getone = iDcService.getone(cid);


        Result result = new Result();

        result.setStatus(200);
        result.setMsg("成功");
        result.setData(getone);
        String s = JSON.toJSONString(result);

        resp.getWriter().println(s);

    }
}
