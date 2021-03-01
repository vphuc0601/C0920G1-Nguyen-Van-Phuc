package model;

public class Student {
    int student_id;
    String student_name;
    int student_age;
    String student_birthday;
    String student_email;
    String student_address;

    public Student() {
    }

    public Student(int student_id, String student_name, int student_age, String student_birthday, String student_email, String student_address) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_age = student_age;
        this.student_birthday = student_birthday;
        this.student_email = student_email;
        this.student_address = student_address;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_age(int student_age) {
        this.student_age = student_age;
    }

    public String getStudent_birthday() {
        return student_birthday;
    }

    public void setStudent_birthday(String student_birthday) {
        this.student_birthday = student_birthday;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public String getStudent_address() {
        return student_address;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }
}
