package CaseStudy.Models;

public class House extends Services  implements Comparable<House>{
    public House(String id,String nameservices, String araeuse, String rentalcots, String maxpeople, String typerental) {
        super(id, nameservices, araeuse, rentalcots, maxpeople, typerental);
    }
    String standard;
    String floor;
    String facilities;

    public House(String id, String nameservices, String araeuse, String rentalcots,
                 String maxpeople, String typerental, String standard, String floor, String facilities) {
        super(id, nameservices, araeuse, rentalcots, maxpeople, typerental);
        this.standard = standard;
        this.floor = floor;
        this.facilities = facilities;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    @Override
    public String toString() {
        return "House" +
                "Id='" + id + '\'' +
                ",tiêu chuẩn phòng='" + standard + '\'' +
                ", số tầng='" + floor + '\'' +
                ", tiện nghi khác='" + facilities + '\'' +
                ", tên dịch vụ='" + nameservices + '\'' +
                ", diện tích sử dụng='" + araeuse + '\'' +
                ", chi phí thuê='" + rentalcots + '\'' +
                ", số người tối đa='" + maxpeople + '\'' +
                ", kiểu thuê='" + typerental + '\''
                ;
    }

    @Override public void showInfor(){

        System.out.println(toString());
    }

    @Override
    public int compareTo(House house) {
        return this.getId().compareTo(house.getId());
    }
}
