package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceIml;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductsServlet", urlPatterns = {"","/products_list.jsp"})
public class ProductsServlet extends HttpServlet {
    private ProductService productService=new ProductServiceIml();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }
            switch (action){
                case "show":
                    showProduct(request,response);
                    break;
                case "add":
                    addProduct(request,response);
                    break;
                case "edit":
                    editProduct(request,response);
                    break;
                case "delete":
                    deleteProduct(request,response);
                    break;
                default:

                    break;
            }



    }



    private void showProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        Product product=this.productService.findById(id);
        RequestDispatcher dispatcher;
        if(product==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("product", product);
            dispatcher=request.getRequestDispatcher("product/show.jsp");
        }
        dispatcher.forward(request,response);
    }

    private void addProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=(int) (Math.random()*1000);
        String name=request.getParameter("name");
        String price=request.getParameter("price");
        String description=request.getParameter("description");
        String manufacturers=request.getParameter("manufacturers");
        Product product=new Product(id, name, price, description, manufacturers);
        this.productService.add(product);
        RequestDispatcher dispatcher=request.getRequestDispatcher("product/add.jsp");
        request.setAttribute("message", "Product was added");
        dispatcher.forward(request,response);
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        Product product=this.productService.findById(id);
        String name=request.getParameter("name");
        String price=request.getParameter("price");
        String description=request.getParameter("description");
        String manufacturers=request.getParameter("manufacturers");
        RequestDispatcher dispatcher;
        if(product==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }else{
            product.setName(name);
            product.setPrice(Double.parseDouble(price));
            product.setDescription(description);
            product.setManufacturers(manufacturers);
            this.productService.update(id,product);
            request.setAttribute("product", product);
            request.setAttribute("message","Product was updated");
            dispatcher=request.getRequestDispatcher("product/edit.jsp");
        }
        dispatcher.forward(request,response);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        Product product=this.productService.findById(id);
        RequestDispatcher dispatcher;
        if(product==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }else {
            this.productService.remove(id);
            response.sendRedirect("/product_list.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "show":
                showProductForm(request,response);
                break;
            case "add":
                addProductForm(request,response);
                break;
            case "edit":
                editProductForm(request, response);
                break;
            case "delete":
                deleteProductForm(request, response);
                break;
            default:
                listProduct(request, response);

                break;
        }

    }

    private void showProductForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void addProductForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void editProductForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void deleteProductForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
    }
}
