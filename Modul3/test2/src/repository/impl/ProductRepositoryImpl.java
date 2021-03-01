package repository.impl;

import bean.Product;
import repository.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private BaseRepository baseRepository=new BaseRepository();
    @Override
    public void insertProduct(Product product) throws SQLException {

    }

    @Override
    public Product selectProduct(int id) {
        return null;
    }

    @Override
    public List<Product> selectAllProduct() {
        return null;
    }

    @Override
    public boolean deleteProduct(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateProduct(Product product) throws SQLException {
        return false;
    }
}
