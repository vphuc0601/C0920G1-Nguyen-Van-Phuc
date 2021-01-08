package Modul2.Controller;

public class Validate {
    private static String regex="";
    public static boolean checkGiaBan(String giaBan) {
        regex="^[1-9]{6}$";
        return giaBan.matches(regex);
    }
    public static boolean checkSoLuong(String soLuong) {
        regex="^[1-9]{0,3}$";
        return soLuong.matches(regex);
    }
    public static boolean checkPhamViBaoHanh(String phamViBaoHanh){
        regex="^Toàn Quốc|Quốc Tế$";
        return phamViBaoHanh.matches(regex);
    }
    public static boolean checkQuocGiaXachTay(String quocGiaXachTay){
        regex="^Viet Nam";
        return quocGiaXachTay.matches(regex);
    }
    public static boolean checkTrangThai(String trangThai){
        regex="^Đã sửa chữa|Chưa sửa chữa$";
        return trangThai.matches(regex);
    }
}
