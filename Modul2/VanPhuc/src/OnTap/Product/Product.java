package OnTap.Product;

public abstract class Product {
    private String id;
    private String serialProduct;
    private String name;
    private String price;
    private String amount;
    private String manufacturers;

    public Product(String id, String serialProduct, String name, String price, String amount, String manufacturers) {
        this.id = id;
        this.serialProduct = serialProduct;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.manufacturers = manufacturers;
    }

    public Product() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSerialProduct() {
        return serialProduct;
    }

    public void setSerialProduct(String serialProduct) {
        this.serialProduct = serialProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }
    public String showInfor(){
        return toString();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", serialProduct='" + serialProduct + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", amount='" + amount + '\'' +
                ", manufacturers='" + manufacturers + '\'' +
                '}';
    }
}
