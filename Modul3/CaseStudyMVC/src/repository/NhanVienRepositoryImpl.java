package repository;

import model.NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienRepositoryImpl implements INhanVienRepository {
    public static final String SELECT_ALL_NHANVIEN_SQL="SELECT * FROM nhan_vien";
    public static final String CREATE_NEW_NHANVIEN_SQL="insert into nhan_vien (hoten, vitri_id, trinhdo_id,bophan_id, " +
            "ngaysinh, CMND, luong, email, diachi, user_name, ma_nhanvien) " +
            "values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String SELECT_NHANVIEN_BY_ID="select*from nhan_vien where id=?";
    public static final String UPDATE_NHANVIEN_SQL="update nhan_vien set hoten=?, vitri_id=?, trinhdo_id=?, bophan_id=?, " +
            "ngaysinh=?,cmnd=?, luong=?, email=?, diachi=?, ma_nhanvien=? where id=?";
    public static final String DELETE_NHANVIEN_BY_ID="delete from nhan_vien where id=?";
    public static final String SEARCH_NHANVIEN_SQL="select * from nhan_vien where `hoten` LIKE ?";
    @Override
    public List<NhanVien> findAll() {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet rs=null;
        List<NhanVien> nhanVienList=new ArrayList<>();
        if(connection!=null){
            try {
                preparedStatement=connection.prepareStatement(SELECT_ALL_NHANVIEN_SQL);
                rs=preparedStatement.executeQuery();
                NhanVien nhanVien=null;
                while (rs.next()){
                    int id=rs.getInt("id");
                    String hoten=rs.getString("hoten");
                    String vitri_id=rs.getString("vitri_id");
                    String trinhdo_id=rs.getString("trinhdo_id");
                    String bophan_id=rs.getString("bophan_id");
                    String ngaySinh=rs.getString("ngaysinh");
                    String cmnd=rs.getString("CMND");
                    String luong=rs.getString("luong");
                    String email=rs.getString("email");
                    String diachi=rs.getString("diachi");
                    String ma_nhanvien=rs.getString("ma_nhanvien");
                    String username=null;
                    nhanVien=new NhanVien(id,hoten,vitri_id,trinhdo_id,bophan_id,ngaySinh,cmnd,luong,email,diachi,username, ma_nhanvien);
                    nhanVienList.add(nhanVien);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    rs.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return nhanVienList;
    }

    @Override
    public void create(NhanVien nhanVien) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if(connection!=null){
            try {
                preparedStatement=connection.prepareStatement(CREATE_NEW_NHANVIEN_SQL);
                preparedStatement.setString(1,nhanVien.getHoten());
                preparedStatement.setString(2,nhanVien.getVitri_id());
                preparedStatement.setString(3,nhanVien.getTrinhdo_id());
                preparedStatement.setString(4,nhanVien.getBophan_id());
                preparedStatement.setString(5,nhanVien.getNgaySinh());
                preparedStatement.setString(6,nhanVien.getCmnd());
                preparedStatement.setString(7,nhanVien.getLuong());
                preparedStatement.setString(8,nhanVien.getEmail());
                preparedStatement.setString(9,nhanVien.getDiachi());
                preparedStatement.setString(10,nhanVien.getUsername());
                preparedStatement.setString(11,nhanVien.getMa_nhanvien());
//                hoten, vitri_id, trinhdo_id,bophan_id, ngaysinh, cmnd, luong, email, diachi, ma_nhanvien
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        DBConnection.close();
    }

    @Override
    public void update(int id, NhanVien nhanVien) {
        Connection connection=DBConnection.getConnection();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE_NHANVIEN_SQL);
            preparedStatement.setString(1,nhanVien.getHoten());
            System.out.println(nhanVien.getHoten());
            preparedStatement.setString(2, nhanVien.getVitri_id());
            preparedStatement.setString(3,nhanVien.getTrinhdo_id());
            preparedStatement.setString(4,nhanVien.getBophan_id());
            preparedStatement.setString(5,nhanVien.getNgaySinh());
            preparedStatement.setString(6,nhanVien.getCmnd());
            preparedStatement.setString(7,nhanVien.getLuong());
            preparedStatement.setString(8,nhanVien.getEmail());
            preparedStatement.setString(9,nhanVien.getDiachi());
            preparedStatement.setString(10,nhanVien.getMa_nhanvien());
            preparedStatement.setInt(11,id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        Connection connection=DBConnection.getConnection();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(DELETE_NHANVIEN_BY_ID);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<NhanVien> findByName(String hoten) {
        List<NhanVien> nhanVienList= new ArrayList<>();
        NhanVien nhanVien;
        Connection connection=DBConnection.getConnection();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(SEARCH_NHANVIEN_SQL);
            String para="%"+ hoten + "%";
            preparedStatement.setString(1,para);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                int id=rs.getInt("id");
                String hoten1=rs.getString("hoten");
                String vitri_id=rs.getString("vitri_id");
                String trinhdo_id=rs.getString("trinhdo_id");
                String bophan_id=rs.getString("bophan_id");
                String ngaySinh=rs.getString("ngaysinh");
                String cmnd=rs.getString("CMND");
                String luong=rs.getString("luong");
                String email=rs.getString("email");
                String diachi=rs.getString("diachi");
                String ma_nhanvien=rs.getString("ma_nhanvien");
                String username=null;
                nhanVien = new NhanVien(id, hoten1,vitri_id,trinhdo_id,bophan_id,ngaySinh,cmnd,luong,email,diachi,username,ma_nhanvien);
                nhanVienList.add(nhanVien);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhanVienList;
    }

    @Override
    public NhanVien findNhanVienByID(int id) {
        Connection connection=DBConnection.getConnection();
        NhanVien nhanVien=null;
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(SELECT_NHANVIEN_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                String hoten=rs.getString("hoten");
                String vitri_id=rs.getString("vitri_id");
                String trinhdo_id=rs.getString("trinhdo_id");
                String bophan_id=rs.getString("bophan_id");
                String ngaySinh=rs.getString("ngaysinh");
                String cmnd=rs.getString("CMND");
                String luong=rs.getString("luong");
                String email=rs.getString("email");
                String diachi=rs.getString("diachi");
                String ma_nhanvien=rs.getString("ma_nhanvien");
                String user_name=null;
                nhanVien=new NhanVien(id,hoten,vitri_id,trinhdo_id,bophan_id,ngaySinh,cmnd,luong,email,diachi,user_name, ma_nhanvien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhanVien;
    }
}
