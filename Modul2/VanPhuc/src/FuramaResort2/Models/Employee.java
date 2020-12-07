package FuramaResort2.Models;

public class Employee {
    String maNV;
    String tenNV;
    String tuoiNV;
    String diachiNV;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTuoiNV() {
        return tuoiNV;
    }

    public void setTuoiNV(String tuoiNV) {
        this.tuoiNV = tuoiNV;
    }

    public String getDiachiNV() {
        return diachiNV;
    }

    public void setDiachiNV(String diachiNV) {
        this.diachiNV = diachiNV;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "maNV='" + maNV + '\'' +
                ", tenNV='" + tenNV + '\'' +
                ", tuoiNV='" + tuoiNV + '\'' +
                ", diachiNV='" + diachiNV + '\'' +
                '}';
    }
}
