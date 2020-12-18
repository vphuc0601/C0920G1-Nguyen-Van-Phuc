package CaseStudy.Models;

public class Customer implements Comparable<Customer> {
    String name;
    String dayOfBirth;
    String gender;
    String idCard;
    String phone;
    String email;
    String guest;
    String address;


    public Customer(String name, String dayOfBirth, String gender, String idCard,
                    String phone, String email, String guest, String address) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.guest = guest;
        this.address = address;
    }

    public Customer() {

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String render) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfor() {
        System.out.println(toString()) ;
    }

    @Override
    public String toString() {
        return "Customer" +
                "name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", guest='" + guest + '\'' +
                ", address='" + address + '\''
                ;
    }

    @Override
    public int compareTo(Customer customer) {
        return this.getName().compareTo(customer.getName());
    }


}
