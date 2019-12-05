package com.training.servlets;

import com.training.cdi.DonorManager;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/DonorServlet")
@Default
public class DonorServlet extends HttpServlet {

    @Inject
    private DonorManager mgr;

    public DonorServlet() {
    }

    @Inject
    public DonorServlet(DonorManager mgr){
        this.mgr=mgr;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] list=mgr.getAllDonors();
        request.setAttribute("list",list);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/showAll.jsp");
        dispatcher.forward(request,response);
    }
}
