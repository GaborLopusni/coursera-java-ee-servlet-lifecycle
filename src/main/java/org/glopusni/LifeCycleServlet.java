package org.glopusni;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/LifecycleServlet")
public class LifeCycleServlet extends HttpServlet {

    public LifeCycleServlet() {
        System.out.println("LifeCycleServlet has been created.");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy method in LifeCycleServlet called");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Init method in LifeCycleServlet called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet method in LifeCycleServlet called");
        req.getSession().invalidate();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in LifeCycleServlet called");
    }
}
