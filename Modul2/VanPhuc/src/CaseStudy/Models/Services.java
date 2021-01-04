package CaseStudy.Models;

public abstract class Services {
    String id;
    String nameservices;
    String araeuse;
    String rentalcots;
    String maxpeople;
    String typerental;


    public Services() {

    }

    public  abstract void showInfor();


    public Services(String id, String nameservices, String araeuse, String rentalcots, String maxpeople, String typerental) {
        this.id = id;
        this.nameservices = nameservices;
        this.araeuse = araeuse;
        this.rentalcots = rentalcots;
        this.maxpeople = maxpeople;
        this.typerental = typerental;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameservices(){ return nameservices;}

    public void setTenDichVu(){this.nameservices = nameservices;}

    public String getAraeuse() {
        return araeuse;
    }

    public void setAraeuse(String araeuse) {
        this.araeuse = araeuse;
    }

    public String getRentalcots() {
        return rentalcots;
    }

    public void setRentalcots(String rentalcots) {
        this.rentalcots = rentalcots;
    }

    public String getMaxpeople() {
        return maxpeople;
    }

    public void setMaxpeople(String maxpeople) {
        this.maxpeople = maxpeople;
    }

    public String getTyperental() {
        return typerental;
    }

    public void setTyperental(String typerental) {
        this.typerental = typerental;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", tên dịch vụ='"+ nameservices +'\'' +
                ", diện tích sử dụng='" + araeuse + '\'' +
                ", chi phí thuê='" + rentalcots + '\'' +
                ", số người tối đa='" + maxpeople + '\'' +
                ", kiểu thuê='" + typerental + '\'' +
                '}';
    }

}
