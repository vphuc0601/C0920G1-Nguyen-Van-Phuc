package model;

public class TrinhDo {int id;
String trinhDo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public TrinhDo(int id, String trinhDo) {
        this.id = id;
        this.trinhDo = trinhDo;
    }
}
