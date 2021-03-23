package controller;

import common.*;
import model.NhanVien;
import service.INhanVienService;
import service.NhanVienServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "NhanVienServlet", urlPatterns = {"/nhanvien"})
public class NhanVienServlet extends HttpServlet {
    private INhanVienService service = new NhanVienServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createNewNhanVien(request,response);
                break;
            case "delete":
                deleteNhanVien(request,response);
                break;
            case "search":
                searchNhanVien(request,response);
                break;
            case "update":
                updateNhanVien(request,response);
                break;
            default:
                showAllNhanVien(request, response);
                break;
        }
    }

    private void searchNhanVien(HttpServletRequest request, HttpServletResponse response) {
        String hoten=request.getParameter("hoten");
        System.out.println(hoten);
        List<NhanVien> nhanVienList1=service.findByName(hoten);
        System.out.println(nhanVienList1.size());
        request.setAttribute("list", nhanVienList1);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/nhanvien/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteNhanVien(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        service.delete(id);
        showAllNhanVien(request,response);
    }

    private void showAllNhanVien(HttpServletRequest request, HttpServletResponse response) {
        List<NhanVien> nhanVienList = service.findAll();
        request.setAttribute("list",nhanVienList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/nhanvien/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createNewNhanVien(HttpServletRequest request, HttpServletResponse response) throws IOException {
        boolean check = true;
        String messageMa_NhanVien = null;
        String messageCmnd = null;
        String messageNgaySinh = null;
        String messageEmail = null;
        String hoten = request.getParameter("tennhanvien");
        String vitri_id = request.getParameter("vitri_id");
        String trinhdo_id = request.getParameter("trinhdo_id");
        String bophan_id = request.getParameter("bophan_id");
        String ngaysinh = request.getParameter("ngaysinhnhanvien");
        try {
            Validate.regexNgaysinh(ngaysinh);
        } catch (NgaySinhException e) {
            messageNgaySinh = e.getMessage();
            check = false;
        }
        String cmnd = request.getParameter("cmnd");
        try {
            Validate.regexCmnd(cmnd);
        } catch (CmndException e) {
            messageCmnd = e.getMessage();
            check = false;
        }
        String luong = request.getParameter("luong");
        String email = request.getParameter("email");
        try {
            Validate.regexEmail(email);
        } catch (EmailException e) {
            messageEmail = e.getMessage();
            check = false;
        }
        String diachi = request.getParameter("diachinhanvien");
        String user_name = null;
        String ma_nhanvien = request.getParameter("ma_nhanvien");
        try {
            Validate.regexMaNhanVien(ma_nhanvien);
        } catch (MaNhanVienException e) {
            messageMa_NhanVien = e.getMessage();
            check = false;
        }
        if (!check) {
            request.setAttribute("messageMa_NhanVien", messageMa_NhanVien);
            request.setAttribute("messageCmnd", messageCmnd);
            request.setAttribute("messageNgaySinh", messageNgaySinh);
            request.setAttribute("messageEmail", messageEmail);
            showFormCreateNhanVien(request, response);
        } else {
            NhanVien nhanVien = new NhanVien(hoten, vitri_id, trinhdo_id, bophan_id, ngaysinh, cmnd, luong, email, diachi, user_name, ma_nhanvien);
            service.create(nhanVien);
            showAllNhanVien(request, response);
        }
    }
    private void updateNhanVien(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        String hoten=request.getParameter("hoten");
        String vitri_id=request.getParameter("vitri_id");
        String trinhdo_id=request.getParameter("trinhdo_id");
        String bophan_id=request.getParameter("bophan_id");
        String ngaySinh=request.getParameter("ngaysinh");
        String cmnd=request.getParameter("cmnd");
        String luong=request.getParameter("luong");
        String email=request.getParameter("email");
        String diachi=request.getParameter("diachi");
        String ma_nhanvien=request.getParameter("ma_nhanvien");
        NhanVien nhanVien= new NhanVien(hoten,vitri_id,trinhdo_id,bophan_id,ngaySinh,cmnd,luong,email,diachi,ma_nhanvien);
        System.out.println(nhanVien.getHoten());
        service.update(id,nhanVien);
        showAllNhanVien(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreateNhanVien(request,response);
                break;
            case "delete":
                deleteNhanVien(request,response);
                break;
//            case "search":
//                searchNhanVienByName(request,response);
//                break;
            case "update":
                showFormEditNhanVien(request,response);
                break;
            default:
                showAllNhanVien(request, response);
                break;
        }
    }


    private void showFormEditNhanVien(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        NhanVien nhanVien=service.findNhanVienByID(id);
        request.setAttribute("nhanVien",nhanVien);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/nhanvien/edit.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreateNhanVien(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("nhanvien/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

}
