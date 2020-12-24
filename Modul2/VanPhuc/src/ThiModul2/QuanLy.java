package ThiModul2;

import OnTap.Product.ReaderWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLy {
    public static List<SoTietKiemDaiHan> soTietKiemDaiHans = new ArrayList<>();
    public static List<SoTietKiemVoThoiHan> soTietKiemVoThoiHans = new ArrayList<>();
    public static List<SoTietKiemCoThoiHan> soTietKiemCoThoiHans = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    QuanLy quanLy = new QuanLy();

    public static void readFile() {
        List<String[]> list = ReaderWriter.reader("src/ThiModul2/longTerm.csv");
        for (String[] list1 : list) {
            SoTietKiemDaiHan soTietKiemDaiHan = new SoTietKiemDaiHan(list1[0], list1[1], list1[2], list1[3],
                    list1[4], list1[5], list1[6], list1[7]);
            soTietKiemDaiHans.add(soTietKiemDaiHan);
        }
        List<String[]> list2 = ReaderWriter.reader("src/ThiModul2/shortTerm.csv");
        for (String[] list3 : list2) {
            SoTietKiemVoThoiHan soTietKiemVoThoiHan = new SoTietKiemVoThoiHan(list3[0], list3[1], list3[2], list3[3], list3[4],
                    list3[5]);
            soTietKiemVoThoiHans.add(soTietKiemVoThoiHan);
        }
        List<String[]> list3 = ReaderWriter.reader("src/ThiModul2/shortTerm.csv");
        for (String[] list4 : list3) {
            SoTietKiemCoThoiHan soTietKiemCoThoiHan = new SoTietKiemCoThoiHan(list4[0], list4[1], list4[2], list4[3], list4[4],
                    list4[5], list4[6]);
            soTietKiemCoThoiHans.add(soTietKiemCoThoiHan);
        }
    }


    public static void main(String[] args) {
        System.out.println("--Chương trình quản lý --");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1.Thêm mới sổ tiết kiệm");
        System.out.println("2.Xóa sổ tiết kiệm");
        System.out.println("3.Xem danh sách sổ tiết kiệm");
        System.out.println("4.Xem thông tin khách hàng");
        System.out.println("5.Tìm kiếm sổ tiết kiệm");
        System.out.println("6.Thoát");
        System.out.println("Chọn chức năng:");
        switch (input.nextLine()) {
            case "1":
                themSoTietKiem();
            case "2":
                xoaSoTietKiem();
            case "3":
                danhSachSoTietKiem();
            case "4":
                thongTinKhachHang();
            case "5":
                timSoTietKiem();
            case "6":
                System.exit(0);
        }
    }

    public static void themSoTietKiem() {
        System.out.println("1.Thêm sổ tiết kiêm dài hạn");
        System.out.println("2.Thêm sổ tiết kiệm ngắn hạn");

        switch (input.nextLine()) {
            case "1":
                SoTietKiemDaiHan soTietKiemDaiHan = new SoTietKiemDaiHan(maSo(), maKh(), ngayMoSo(), thoiGianBatDauGui()
                        , kyHan(), soTien(), laiSuat(), uuDai());
                ReaderWriter.writer("src/ThiModul2/longTerm.csv", soTietKiemDaiHan.getMaSo() + "," +
                        soTietKiemDaiHan.getMaKh() + "," + soTietKiemDaiHan.getNgayMoSo() + "," + soTietKiemDaiHan.getThoiGianBatDauGui()
                        + "," + soTietKiemDaiHan.getKyHan() + "," + soTietKiemDaiHan.getSoTien() + "," + soTietKiemDaiHan.getLaiSuat()
                        + "," + soTietKiemDaiHan.getUuDai());
            case "2":
                System.out.println("1.Vô thời hạn");
                System.out.println("2.Có thời hạn");
                switch (input.nextLine()) {
                    case "1":
                        SoTietKiemVoThoiHan soTietKiemVoThoiHan = new SoTietKiemVoThoiHan(maSo(), maKh(), ngayMoSo(), thoiGianBatDauGui()
                                , soTien(), laiSuat());
                        ReaderWriter.writer("src/ThiModul2/shortTerm.csv", soTietKiemVoThoiHan.getMaSo() + "," + soTietKiemVoThoiHan.getMaKh()
                                + "," + soTietKiemVoThoiHan.getNgayMoSo() + "," + soTietKiemVoThoiHan.getThoiGianBatDauGui() + "," +
                                soTietKiemVoThoiHan.getSoTien() + "," + soTietKiemVoThoiHan.getLaiSuat());
                    case "2":
                        SoTietKiemCoThoiHan soTietKiemCoThoiHan = new SoTietKiemCoThoiHan(maSo(), maKh(), ngayMoSo(), thoiGianBatDauGui(), kyHan(), soTien(), laiSuat());
                        ReaderWriter.writer("src/ThiModul2/shortTerm.csv", soTietKiemCoThoiHan.getMaSo() + "," + soTietKiemCoThoiHan.getMaKh()
                                + "," + soTietKiemCoThoiHan.getNgayMoSo() + "," + soTietKiemCoThoiHan.getThoiGianBatDauGui() + "," + soTietKiemCoThoiHan.getKyHan()
                                + "," + soTietKiemCoThoiHan.getSoTien() + "," + soTietKiemCoThoiHan.getLaiSuat());
                }
        }
    }

    public static void xoaSoTietKiem() {
        System.out.println("Nhập vào mã sô tiết kiệm");
        String id = input.nextLine();

        for (SoTietKiemDaiHan soTietKiemDaiHan : soTietKiemDaiHans) {
            if (soTietKiemDaiHan.getMaSo().equals(id)) {
                System.out.println("1.Yes");
                System.out.println("2.No");
                String choice = input.nextLine();
                switch (choice) {
                    case "1":
                        QuanLy.soTietKiemCoThoiHans.remove(soTietKiemDaiHan);
                        ReaderWriter.removeFile("src/ThiModul2/shortTerm.csv");
                        ReaderWriter.writer("src/ThiModul2/shortTerm.csv", soTietKiemDaiHans.toString());
                        System.out.println(soTietKiemDaiHans);
                        break;
                    case "2":
                        System.exit(0);
                }
            }
        }
        for (SoTietKiemVoThoiHan soTietKiemVoThoiHan : soTietKiemVoThoiHans) {
            if (soTietKiemVoThoiHan.getMaSo().equals(id)) {
                System.out.println("1.Yes");
                System.out.println("2.No");
                String choice = input.nextLine();
                switch (choice) {
                    case "1":
                        QuanLy.soTietKiemVoThoiHans.remove(soTietKiemVoThoiHan);
                        ReaderWriter.removeFile("src/ThiModul2/shortTerm.csv");
                        ReaderWriter.writer("src/ThiModul2/shortTerm.csv", soTietKiemVoThoiHan.toString());
                        System.out.println(soTietKiemVoThoiHan);
                        break;
                    case "2":
                        System.exit(0);
                }
            }
        }
        for (SoTietKiemCoThoiHan soTietKiemCoThoiHan : soTietKiemCoThoiHans) {
            if (soTietKiemCoThoiHan.getMaSo().equals(id)) {
                System.out.println("1.Yes");
                System.out.println("2.No");
                String choice = input.nextLine();
                switch (choice) {
                    case "1":
                        QuanLy.soTietKiemCoThoiHans.remove(soTietKiemCoThoiHan);
                        ReaderWriter.removeFile("src/ThiModul2/longTerm.csv");
                        ReaderWriter.writer("src/ThiModul2/longTerm.csv", soTietKiemCoThoiHan.toString());
                        System.out.println(soTietKiemCoThoiHan);
                        break;
                    case "2":
                        System.exit(0);
                }
            }
        }
    }

    public static void danhSachSoTietKiem() {
    }

    public static void thongTinKhachHang() {
    }

    public static void timSoTietKiem() {
    }

    public static String maSo() {
        System.out.println("Nhập mã sổ");
        return input.nextLine();
    }

    public static String maKh() {
        System.out.println("Nhập mã khách hàng");
        return input.nextLine();
    }

    public static String ngayMoSo() {
        System.out.println("Nhập ngày mở sổ");
        return input.nextLine();
    }

    public static String thoiGianBatDauGui() {
        System.out.println("Nhập thời gian bắt đầu gửi");
        return input.nextLine();
    }

    public static String soTien() {
        System.out.println("Nhập số tiền gửi");
        return input.nextLine();
    }

    public static String laiSuat() {
        System.out.println("Nhập lãi suất");
        return input.nextLine();
    }

    public static String uuDai() {
        System.out.println("Nhập lãi suất");
        return input.nextLine();
    }

    public static String kyHan() {
        System.out.println("Nhập kỳ hạn");
        return input.nextLine();
    }
}
