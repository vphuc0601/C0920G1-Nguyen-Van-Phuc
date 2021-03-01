package repository;

import bean.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductRepositoryImpl  {
    List<Product> findAllProduct() throws SQLException;
}
