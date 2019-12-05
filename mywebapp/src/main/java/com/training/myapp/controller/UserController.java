package com.training.myapp.controller;

import com.training.myapp.exception.UserNotFoundException;
import com.training.myapp.model.User;
import com.training.myapp.service.UserService;
import com.training.myapp.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="*.do")
public class UserController extends HttpServlet {

    private UserService userService=new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String path=request.getServletPath();
        PrintWriter out=response.getWriter();
        if (path.equals("/login.do")){
            String username=request.getParameter("username");
            String password=request.getParameter("password");

            try{
                User user=userService.authenticateUser(username,password);
                out.println("<h2>Login successful!</h2>");
                out.println("<h2>Welcome: "+user.getUserName()+"</h2>");
            }catch(UserNotFoundException e){

                out.println("<h2 style='color: red'>" + e.getMessage()+ "</h2>");
                out.println("<a href='loginPage.jsp'>Sign In Again</a>");

            }

        }else if (path.equals("/register.do")){
                String username=request.getParameter("username");
                String password=request.getParameter("password");
                String emailId=request.getParameter("email");
                long contact=Long.parseLong(request.getParameter("contact"));

                User user=new User(username,password,emailId,contact);
                userService.registerNewUser(user);
                out.println("<h1>Registration successful</h1>");
                out.println("<h2><a href='loginPage.jsp'>Login</a></h2>");
        }
        out.close();
    }

}
