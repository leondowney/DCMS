package com.DCMS.main.yangLi.Controller;

import com.alibaba.fastjson.JSON;
import com.DCMS.main.yangLi.Bean.Dangerousc;
import com.DCMS.main.yangLi.Bean.DangerouscCondition;
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
 * datetime:2023/3/10 11:42
 * email:1473321819@qq.com
 *
 * @description:
 */
@WebServlet("/company/record/getAll")
public class DcServlet extends HttpServlet {



    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Result result = new Result();
        IDcService iDcService = new DcServiseimpl();


        String hth = req.getParameter("hth");
        String htmc = req.getParameter("htmc");
        String htrq = req.getParameter("htrq");
        Integer cid = Integer.parseInt(req.getParameter("cid"));
        DangerouscCondition dc = new DangerouscCondition();

        dc.setCid(cid);
        dc.setHth(hth);
        dc.setHtmc(htmc);
        dc.setHtrq(htrq);

        List<Dangerousc> all = iDcService.getAll(dc);
        result.setStatus(200);
        result.setMsg("成功");
        result.setData(all);
        String s = JSON.toJSONString(result);

        resp.getWriter().println(s);

    }
}
