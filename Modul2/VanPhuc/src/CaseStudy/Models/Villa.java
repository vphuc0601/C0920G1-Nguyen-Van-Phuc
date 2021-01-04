package CaseStudy.Models;

public class Villa extends Services implements Comparable<Villa>{
    String areapool;
    String standard;
    String floor;
    String facilities;


    public Villa(String id, String nameservices, String araeuse, String rentalcots, String maxpeople, String typerental, String areapool, String standard, String floor, String facilities) {
        super(id, nameservices, araeuse, rentalcots, maxpeople, typerental);
        this.areapool = areapool;
        this.standard = standard;
        this.floor = floor;
        this.facilities = facilities;
    }

    public String getAreapool() {
        return areapool;
    }

    public void setAreapool(String areapool) {
        this.areapool = areapool;
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
        return "Villa: " +
                "Id='" + id + '\'' +
                ",diện tích hồ bơi='" + areapool + '\'' +
                ", tiêu chuẩn phòng='" + standard + '\'' +
                ", số tầng='" + floor + '\'' +
                ", tiện nghi khác='" + facilities + '\'' +
                ", tên dịch vụ='" + nameservices + '\'' +
                ", diện tích sứ dụng='" + araeuse + '\'' +
                ", chi phí thuê='" + rentalcots + '\'' +
                ", số người tối đa='" + maxpeople + '\'' +
                ", kiểu thuê='" + typerental + '\'' ;
    }

    @Override public void showInfor(){
        System.out.println(toString());
    }

    @Override
    public int compareTo(Villa villa) {
        return this.getId().compareTo(villa.getId());
    }
}
