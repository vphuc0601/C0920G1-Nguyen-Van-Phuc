package CaseStudy.Controllers;

public class Validate {
    private static String regex="";

    public static boolean checkIdVilla(String id) {
        regex="^SVVL-[0-9]{4}$";
        return id.matches(regex);
    }
    public static boolean checkIdHouse(String id) {
        regex="^SVHR-[0-9]{4}$";
        return id.matches(regex);
    }
    public static boolean checkIdRoom(String id) {
        regex="^SVHO-[0-9]{4}$";
        return id.matches(regex);
    }
    public static boolean checkTenDichVu(String tenDichVu){
        regex="^Diamond|Platinium|Gold|Silver|Member$";
        return tenDichVu.matches(regex);
    }
    public static boolean checkDienTichSuDung(String dienTichSuDung){
        regex="^[3-9][0-9]|[0-9]{3,4}$";
        return dienTichSuDung.matches(regex);
    }
    public static boolean checkDienTichHoBoi(String dienTichHoBoi){
        regex="^[3-9][0-9]|[0-9]{3,4}$";
        return dienTichHoBoi.matches(regex);
    }
    public static boolean checkChiPhiThue(String chiPhiThue){
        regex="^[0-9]{7}$";
        return chiPhiThue.matches(regex);
    }
    public static boolean checkNguoiToiDa(String nguoiToiDa){
        regex="^([1-9]|1[0-9])$";
        return nguoiToiDa.matches(regex);
    }
    public static boolean checkDichVuDiKem(String dichVuDiKem){
        regex="^(massage|karaoke|food|drink|car)$";
        return dichVuDiKem.matches(regex);
    }
    public static boolean checkSoTang(String soTang){
        regex="^([1-9][0-9])$";
        return soTang.matches(regex);
    }
    public static boolean checkKieuThue(String kieuThue){
        regex="";
        return kieuThue.matches(regex);
    }
    public static boolean checkTieuChuanPhong(String tieuChuanPhong){
        regex="";
        return tieuChuanPhong.matches(regex);
    }
    public static boolean checkBirthday(String birthday){
        regex="^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
                "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";
        return birthday.matches(regex);
    }
    public static boolean checkNameCustomer(String nameCustomer){
        regex= "^([A-Z][a-z]{1,3})\\s+([A-Z][a-z]{1,3})$";
        return nameCustomer.matches(regex);
    }
    public static boolean checkPhone(String phone){
        regex="^0([0-9]{9})$";
        return phone.matches(regex);
    }
    public static boolean checkEmail(String email){
        regex="^[a-z0-9_]+[a-z0-9]@([a-z0-9]+\\.)[a-z]+(|\\.[a-z]+)$";
        return email.matches(regex);
    }
    public static boolean checkGender(String gender){
        regex="^[mM][aA][lL][eE]|[fF][eE][mM][aA][lL][eE]|[uU][nN][kK][nN][oO][wW]$";
        return gender.matches(regex);
    }
    public static boolean checkIdCard(String idCard){
        regex="^[0-9]{9}";
        return idCard.matches(regex);
    }
    public static boolean checkGuest(String guest){
        regex="^Diamond|Platinium|Gold|Silver|Member$";
        return guest.matches(regex);
    }
}
