package repository;

import bean.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements ProductRepositoryImpl {
    private BaseRepository baseRepository=new BaseRepository();
    String SQL_FIND_ALL_PRODUCT="select*from sanpham;";
    @Override
    public List<Product> findAllProduct() throws SQLException {
        List<Product> productList=new ArrayList<>();
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(SQL_FIND_ALL_PRODUCT);
        ResultSet resultSet=preparedStatement.executeQuery();
        Product product;
        while (resultSet.next()){
            int id=resultSet.getInt("id");
            String product_name=resultSet.getString("product_name");
            Double product_price=resultSet.getDouble("product_price");
            Double product_discount=resultSet.getDouble("product_discount");
            int product_stock=resultSet.getInt("product_stock");
            product=new Product(id,product_name,product_price,product_discount,product_stock);
            productList.add(product);
        }
        return productList;
    }
}
