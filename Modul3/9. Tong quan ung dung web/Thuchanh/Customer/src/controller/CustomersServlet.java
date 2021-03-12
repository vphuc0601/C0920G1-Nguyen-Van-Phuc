package controller;

import model.Customers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomersServlet", urlPatterns = {"","/customers"})
public class CustomersServlet extends HttpServlet {
    private static List<Customers> customersList;
    @Override
    public void init() throws ServletException {
        customersList =new ArrayList<>();
        customersList.add(new Customers("Phuc","12-12-1988","Da Nang","img/image1.jpg"));
        customersList.add(new Customers("Son","12-10-1998","Ha Noi","img/image2.jpg"));
        customersList.add(new Customers("Tuan","02-01-1978","Hue","img/image3.jpg"));
        customersList.add(new Customers("Giang","24-09-1992","Quang Nam","img/image4.jpg"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customersList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/customers/customerslist.jsp");
        dispatcher.forward(request,response);
    }
}
