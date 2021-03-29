package repository;

import model.PhongTro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhongTroRrepositoryImpl implements IPhongTroRepository {
public static final String SELECT_ALL_PHONGTRO_SQL="select * from phong_tro";
    @Override
    public List<PhongTro> findAll() {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet rs=null;
        List<PhongTro> phongTroList= new ArrayList<>();
        if(connection!=null){
            try {
                preparedStatement=connection.prepareStatement(SELECT_ALL_PHONGTRO_SQL);
                rs=preparedStatement.executeQuery();
                PhongTro phongTro=null;
                while (rs.next()){
                    int id=rs.getInt("id");
                    String ma_phongtro=rs.getString("ma_phongtro");
                    String ten_thue=rs.getString("ten_thue");
                    String dienthoai=rs.getString("dienthoai");
                    String ngaythue=rs.getString("ngaythue");
                    String ghichu=rs.getString("ghichu");
                    int thanhtoan_id=rs.getInt("thanhtoan_id");
                    phongTro= new PhongTro();
                    phongTroList.add(phongTro);
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
        return userList;
    }

    @Override
    public void create(PhongTro phongTro) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<PhongTro> findByName(String name) {
        return null;
    }

    @Override
    public PhongTro findPhongTroID(int id) {
        return null;
    }


}
