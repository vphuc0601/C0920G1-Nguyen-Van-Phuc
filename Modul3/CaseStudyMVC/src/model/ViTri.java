package model;

public class ViTri {int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenViTri() {
        return tenViTri;
    }

    public void setTenViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public ViTri(int id, String tenViTri) {
        this.id = id;
        this.tenViTri = tenViTri;
    }

    String tenViTri;
}
