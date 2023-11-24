package com.zad5.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    Logger logger = LoggerFactory.getLogger("HelloServlet");

    protected void doAction(HttpServletRequest req, HttpServletResponse resp, String arg)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.println("{ \"msg\": \"Witaj " + arg + "\" }");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Inside doGet method");
        doAction(req, resp, "! (Wywołano z doGet)");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Inside doPost method");
        doAction(req, resp, "! (Wywołano z doPost)");
    }

}
