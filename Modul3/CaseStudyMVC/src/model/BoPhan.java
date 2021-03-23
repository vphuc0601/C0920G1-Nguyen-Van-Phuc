package model;

public class BoPhan {int id;
String boPhan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    public BoPhan(int id, String boPhan) {
        this.id = id;
        this.boPhan = boPhan;
    }
}
