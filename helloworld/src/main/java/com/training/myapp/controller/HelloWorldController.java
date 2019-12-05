package com.training.myapp.controller;

import com.training.myapp.model.Customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@javax.servlet.annotation.WebServlet("/hello")
public class HelloWorldController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello From Servlet</h1>");

        request.setAttribute("name","John");
        request.setAttribute("age",32);
        Customer customer=new Customer(101,"John","john@gmail.com",12345668l);

        request.getSession().setAttribute("customer",customer);
        List<Customer> customers= Arrays.asList(
                new Customer(101,"Jon Doe","jon@gmail.com",123488888l),
                new Customer(102,"Jane Doe","jane@gmail.com",123422288l),
                new Customer(103,"Alex B","alex@gmail.com",123488666l),
                new Customer(102,"Jason T","jason@gmail.com",123488777l)
        );

        request.setAttribute("customers",customers);

       // request.getRequestDispatcher("data.jsp").forward(request,response);
        request.getRequestDispatcher("jstl.jsp").forward(request,response);
        out.close();
    }
}
