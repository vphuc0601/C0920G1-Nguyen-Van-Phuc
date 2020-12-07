package OnTap;

public class ExportProduct extends Product{
    private String priceExport;
    private String nationalExport;
    public ExportProduct(String id, String serialProduct, String name, String price, String amount, String manufacturers, String priceExport, String nationalExport) {
        super(id, serialProduct, name, price, amount, manufacturers);
        this.priceExport= priceExport;
        this.nationalExport=nationalExport;
    }



    public String getPriceExport() {
        return priceExport;
    }

    public void setPriceExport(String priceExport) {
        this.priceExport = priceExport;
    }

    public String getNationalExport() {
        return nationalExport;
    }

    public void setNationalExport(String nationalExport) {
        this.nationalExport = nationalExport;
    }
    public String showInfor(){
        return toString();
    }

    @Override
    public String toString() {
        return super.toString()+
                "ExportProduct{" +
                "priceExport='" + priceExport + '\'' +
                ", nationalExport='" + nationalExport + '\'' +
                '}';
    }
}
