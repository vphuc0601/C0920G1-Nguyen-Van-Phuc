package common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String REGEX_MA_NHANVIEN="^(NV-)\\d{4}$";
    private static final String REGEX_CMND="^[0-9]{9}";
    private static final String REGEX_NGAYSINH="^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
    private static final String REGEX_EMAIL="^[a-z0-9_]+[a-z0-9]@([a-z0-9]+\\.)[a-z]+(|\\.[a-z]+)$";
    public static void regexMaNhanVien(String ma_nhanvien) throws MaNhanVienException {
            pattern=Pattern.compile(REGEX_MA_NHANVIEN) ;
            matcher=pattern.matcher(ma_nhanvien);
            if(!matcher.find()) throw new MaNhanVienException ("Mã nhân viên không đúng định dạng");
    }
    public static void regexCmnd(String cmnd) throws CmndException {
        pattern=Pattern.compile(REGEX_CMND);
        matcher=pattern.matcher(cmnd);
        if(!matcher.find()) throw new CmndException ("CMND không đúng định dạng");
    }
    public static void regexNgaysinh(String ngaysinh) throws NgaySinhException {
        pattern=Pattern.compile(REGEX_NGAYSINH);
        matcher=pattern.matcher(ngaysinh);
        if(!matcher.find()) throw  new  NgaySinhException("Ngày sinh không đúng định dạng");
    }
    public static void regexEmail (String email) throws EmailException {
        pattern=Pattern.compile(REGEX_EMAIL);
        matcher=pattern.matcher(email);
        if(!matcher.find()) throw new EmailException("Email không đúng định dạng");
    }
}
