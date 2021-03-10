package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DiscountServlet", urlPatterns = {"","/discount"})
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription= request.getParameter("description");
        float productPrice= Float.parseFloat(request.getParameter("price"));
        float productDiscount=Float.parseFloat(request.getParameter("discount"));
        double discountPrice=productPrice*productDiscount*0.01;
        double amount=productPrice-discountPrice;
        request.setAttribute("des", productDescription);
        request.setAttribute("price", productPrice);
        request.setAttribute("discount",productDiscount);
        request.setAttribute("discountAmount", discountPrice);
        request.setAttribute("amount",amount);
        RequestDispatcher dispatcher= request.getRequestDispatcher("/product/result.jsp");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/product/home.jsp");
    }
}
