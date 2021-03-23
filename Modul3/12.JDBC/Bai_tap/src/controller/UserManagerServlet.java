package controller;

import model.User;
import service.IUserService;
import service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserManagerServlet", urlPatterns = {"","/user"})

public class UserManagerServlet extends HttpServlet {

    private IUserService service= new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String action= request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                createUser(request,response);
                break;
            case "update":
                updateUser(request,response);
                break;
            case "delete":
                deleteUser(request,response);
                break;
            case "searchByName":
                searchByName(request,response);
                break;
            case "searchByCountry":
                searchByCountry(request,response);
                break;
            default:
                showUserList(request,response);
                break;
        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action= request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                showFormCreate(request,response);
                break;
            case "edit":
                showFormEdit(request,response);
                break;
            case "delete":
                deleteUser(request,response);
                break;
            default:
                showUserList(request,response);
                break;
        }
    }




    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        User user=service.findUserById(id);
        request.setAttribute("user",user);
        RequestDispatcher dispatcher=request.getRequestDispatcher("user/edit.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void    updateUser(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String country=request.getParameter("country");
        User user= new User(name, email, country);
        int id=Integer.parseInt(request.getParameter("id"));
        service.update(id,user);
        showUserList(request,response);
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String country=request.getParameter("country");
        User user= new User(name,email,country);
        service.create(user);
        showUserList(request,response);
    }
    private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        service.delete(id);
        showUserList(request,response);
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("user/create.jsp");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showUserList(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList=service.findAll();
        request.setAttribute("userList",userList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("user/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void searchByName(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("name");
        List<User> userList=service.findByName(name);
        request.setAttribute("userList",userList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("user/info.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void searchByCountry(HttpServletRequest request, HttpServletResponse response) {
        String country=request.getParameter("country");
        List<User> userList=service.findByCountry(country);
        request.setAttribute("userList",userList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("user/info.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
