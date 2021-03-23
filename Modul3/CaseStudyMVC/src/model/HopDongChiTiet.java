package model;

public class HopDongChiTiet {
    int id;
    int hopdong_id;
    int dichvudikem_id;
    int soLuong;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHopdong_id() {
        return hopdong_id;
    }

    public void setHopdong_id(int hopdong_id) {
        this.hopdong_id = hopdong_id;
    }

    public int getDichvudikem_id() {
        return dichvudikem_id;
    }

    public void setDichvudikem_id(int dichvudikem_id) {
        this.dichvudikem_id = dichvudikem_id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public HopDongChiTiet(int id, int hopdong_id, int dichvudikem_id, int soLuong) {
        this.id = id;
        this.hopdong_id = hopdong_id;
        this.dichvudikem_id = dichvudikem_id;
        this.soLuong = soLuong;
    }
}
