package CaseStudy.Models;

public class Room extends Services implements Comparable<Room>{

    String freeservices;

    public Room(String id, String nameservices, String araeuse, String rentalcots, String maxpeople, String typerental, String freeservices) {
        super(id, nameservices, araeuse, rentalcots, maxpeople, typerental);
        this.freeservices = freeservices;
    }

    public String getFreeservices() {
        return freeservices;
    }

    public void setFreeservices(String freeservices) {
        this.freeservices = freeservices;
    }
    @Override public void  showInfor(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Room" +
                "Id='" + id + '\'' +
                ",tiện nghi khác='" + freeservices + '\'' +
                ", tên dịch vụ='" + nameservices + '\'' +
                ", diện tích sử dụng='" + araeuse + '\'' +
                ", chi phí thuê='" + rentalcots + '\'' +
                ", số người tối đa='" + maxpeople + '\'' +
                ", kiểu thuê='" + typerental + '\''
                ;
    }

    @Override
    public int compareTo(Room room) {
        return this.getId().compareTo(room.getId());
    }
}
