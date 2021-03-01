package bean;

public class Product {
    int id;
    String product_name;
    Double product_price;
    Double product_discount;
    int product_stock;

    public Product() {
    }

    public Product(int id, String product_name, Double product_price, Double product_discount, int product_stock) {
        this.id = id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_discount = product_discount;
        this.product_stock = product_stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    public Double getProduct_discount() {
        return product_discount;
    }

    public void setProduct_discount(Double product_discount) {
        this.product_discount = product_discount;
    }

    public int getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(int product_stock) {
        this.product_stock = product_stock;
    }
}
