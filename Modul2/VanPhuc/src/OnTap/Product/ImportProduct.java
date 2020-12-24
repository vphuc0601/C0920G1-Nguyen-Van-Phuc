package OnTap.Product;

public class ImportProduct extends Product {
    private String priceImport;
    private String provinceImport;
    private String taxImport;

    public ImportProduct(String id, String serialProduct, String name, String price, String amount, String manufacturers, String priceImport, String provinceImport, String taxImport) {
        super(id, serialProduct, name, price, amount, manufacturers);
        this.priceImport = priceImport;
        this.provinceImport = provinceImport;
        this.taxImport = taxImport;
    }

    public String getPriceImport() {
        return priceImport;
    }

    public void setPriceImport(String priceImport) {
        this.priceImport = priceImport;
    }

    public String getProvinceImport() {
        return provinceImport;
    }

    public void setProvinceImport(String provinceImport) {
        this.provinceImport = provinceImport;
    }

    public String getTaxImport() {
        return taxImport;
    }

    public void setTaxImport(String taxImport) {
        this.taxImport = taxImport;
    }


    public String showInfor(){
        return toString();
    }

    @Override
    public String toString() {
        return super.toString()+
                "ImportProduct{" +
                "priceImport='" + priceImport + '\'' +
                ", provinceImport='" + provinceImport + '\'' +
                ", taxImport='" + taxImport + '\'' +
                '}';
    }
}
