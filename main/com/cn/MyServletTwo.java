package com.cn;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @description:
 * @author: helisen
 * @create: 2020-10-12 15:32
 **/
public class MyServletTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("我是MyServletTwo，处理get请求逻辑");
        writer.close();
        /*ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("我是MyServletTwo，处理get请求逻辑");
        outputStream.close();*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("我是MyServletTwo，处理post请求逻辑");
        outputStream.close();
    }

    @Override
    public void destroy() {
        System.out.println("destroy MyServletTwo");
    }

    /**
     * 第一次调用servlet的时候才会调用init方法，之后不会调用了，容器启动的时候并不会调用
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        System.out.println("init MyServletTwo");
    }
}
