package CaseStudy.Models;

public class Employee {
    String nameEmployee;
    String ageEmployee;
    String addressEmployee;

    public Employee(String nameEmployee, String ageEmployee, String addressEmployee) {
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.addressEmployee = addressEmployee;
    }

    public Employee() {}

    public String getNameEmployee() {
        return nameEmployee;
    }

    public String getAgeEmployee() {
        return ageEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public void setAgeEmployee(String ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    @Override
    public String toString() {
        return "Employee:" +
                " nameEmployee='" + nameEmployee + '\'' +
                ", ageEmployee='" + ageEmployee + '\'' +
                ", addressEmploye='" + addressEmployee + '\'' ;
    }
}
