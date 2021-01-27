package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceIml implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products=new HashMap<>();
        products.put(1, new Product(1, "NokiaE75", "3000000", "Good", "Nokia"));
        products.put(2, new Product(2, "NokiaN70", "4000000", "Good", "Nokia"));
        products.put(3, new Product(3, "Iphone XS Mas", "18000000", "VeryGood", "Iphone"));
        products.put(4, new Product(4, "Samsung S8+", "8000000", "Good", "Samsung"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void add(Product product) {
        products.put(product.getId(), product);
    }


    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);

    }


}
