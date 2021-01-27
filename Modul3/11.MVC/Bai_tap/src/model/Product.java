package model;

public class Product {
    Integer id;
    String name;
    double price;
    String description;
    String manufacturers;

    public Product(Integer id, String name, String price, String description, String manufacturers) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.manufacturers = manufacturers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }
}
