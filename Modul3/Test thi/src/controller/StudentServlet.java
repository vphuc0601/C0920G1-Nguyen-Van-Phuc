package controller;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "StudentServlet",urlPatterns = {"","/home"})
public class StudentServlet extends HttpServlet {
    private StudentServiceImpl studentService=new StudentService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String action=request.getParameter("action");
        if(action == null){
            action="";
        }else{
            switch (action){
                case "create":
                    int student_id= Integer.parseInt(request.getParameter("student_id"));
                    String studennt_name=request.getParameter("student_name");
                    int student_age= Integer.parseInt(request.getParameter("student_age"));
                    String student_birthday=request.getParameter("student_birthday");
                    String student_email=request.getParameter("student_email");
                    String studen_address=request.getParameter("student_address");
                    Student student=new Student(student_id,studennt_name,student_age,student_birthday,student_email,studen_address);
                    try {
                        studentService.createStudent(student);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "edit":
                    break;
                case "delete":
                    break;
                case "search":
                    break;
                default:
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }else {
            switch (action){
                case "create":
                    request.getRequestDispatcher("create.jsp").forward(request,response);
                    break;
                case "edit":
                    request.setAttribute("student_edit",studentService.findStudentById(Integer.parseInt("student_id")));
//                    gói thông tin nhận từ service

                    request.getRequestDispatcher("edit.jsp").forward(request,response);
                    break;
                case "delete":

                    break;
                case "search":
                    break;
            }
        }

    }
}
