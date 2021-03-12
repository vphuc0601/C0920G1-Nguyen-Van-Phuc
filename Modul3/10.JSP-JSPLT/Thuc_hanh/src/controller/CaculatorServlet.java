package controller;

import model.Caculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CaculatorServlet", urlPatterns = {"","/calculate"})
public class CaculatorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float a=Float.parseFloat(request.getParameter("first-operand"));
        float b=Float.parseFloat(request.getParameter("second-operand"));
        String operator=request.getParameter("operator");
        float result= Caculator.caculate(a,b,operator);
        request.setAttribute("result",result);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/caculator/result.jsp");
        dispatcher.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("caculator/caculator.jsp");
    }
}
