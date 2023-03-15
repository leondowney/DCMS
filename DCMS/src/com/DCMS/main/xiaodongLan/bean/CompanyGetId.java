package com.DCMS.main.xiaodongLan.bean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 兰晓东
 * @create 2023-03-11 9:52
 * @describe:
 */
@WebServlet("/ds/company/getId")
public class CompanyGetId extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
    }

}
