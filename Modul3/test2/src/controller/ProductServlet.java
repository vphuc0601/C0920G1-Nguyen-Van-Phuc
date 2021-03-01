package controller;

import bean.Product;
import service.ProductService;
import service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet",urlPatterns = {"","/product"})
public class ProductServlet extends HttpServlet {
    private ProductService productService=new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }else {
            switch (action){
                case "update":
                    Integer id= Integer.valueOf(request.getParameter("id"));
                    Product product=productService.selectProduct(id);
                    request.setAttribute("productInfo", product);
                    request.getRequestDispatcher("edit.jsp").forward(request,response);
                    break;
                default:
                    loadList(request,response);
            }
        }
    }
    private void loadList(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("productListFromServlet",productService.selectAllProduct());
        request.getRequestDispatcher("list_product.jsp").forward(request,response);
    }
}
