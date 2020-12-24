package CaseStudy.Models;

public class Employee {
    String nameEmployee;
    String ageEmployee;
    String adreesEmploye;

    public Employee(String nameEmployee, String ageEmployee, String adreesEmploye) {
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.adreesEmploye = adreesEmploye;
    }

    public Employee() {

    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public void setAgeEmployee(String ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public void setAdreesEmploye(String adreesEmploye) {
        this.adreesEmploye = adreesEmploye;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", ageEmployee='" + ageEmployee + '\'' +
                ", adreesEmploye='" + adreesEmploye + '\'' +
                '}';
    }
}
