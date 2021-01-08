package Modul2.Controller;

import CaseStudy.Models.Villa;
import Modul2.Modell.DienThoaiChinhHang;
import Modul2.Modell.DienThoaiXachTay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
    public static List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void hienThiChuongTrinh() {
        boolean check = false;
        String choice;

        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI--");
            System.out.println("1.Thêm mới.");
            System.out.println("2.Xóa.");
            System.out.println("3.Xem danh sách điện thoại.");
            System.out.println("4.Tìm kiếm.");
            System.out.println("5.Thoát.");
            System.out.println("Chọn chức năng:");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    them();
                    break;
                case "2":
                    xoa();
                    break;
                case "3":
                    xem();
                    break;
                case "4":
                    timkiem();
                    break;
                case "5": {
                    System.out.println("Hẹn gặp lại!Cảm ơn!");
                    check = true;
                }
            }

        } while (!check);
    }

    public static String nhapId() {
        System.out.println("Nhập id:");
        String id = input.nextLine();
        return id;
    }

    public static String nhapTenDienThoai() {
        System.out.println("Nhập tên điện thoại:");
        String tenDienThoai = input.nextLine();
        return tenDienThoai;
    }

    public static String nhapGiaBan() {
        System.out.println("Nhập giá bán:");
        String giaBan = input.nextLine();
        while (!Validate.checkGiaBan(giaBan)) {
            System.out.println("Bạn đã nhập sai định dạng");
            giaBan = input.nextLine();
        }
        return giaBan;
    }

    public static String nhapSoLuong() {
        System.out.println("Nhập số lương:");
        String soLuong = input.nextLine();
        while (!Validate.checkSoLuong(soLuong)) {
            System.out.println("Bạn đã nhập sai định dạng");
            soLuong = input.nextLine();
        }
        return soLuong;
    }

    public static String nhaSanXuat() {
        System.out.println("Nhập nhà sản xuất:");
        String nhaSanXuat = input.nextLine();
        return nhaSanXuat;
    }

    public static String thoiGianBaoHanh() {
        System.out.println("Nhập thời gian bảo hành:");
        String thoiGianBaoHanh = input.nextLine();
        return thoiGianBaoHanh;
    }

    public static String phamViBaoHanh() {
        System.out.println("Nhập phạm vi bảo hành:");
        String phamViBaoHanh = input.nextLine();
        while (!Validate.checkPhamViBaoHanh(phamViBaoHanh)) {
            System.out.println("Bạn đã nhập sai định dạng");
            phamViBaoHanh = input.nextLine();
        }
        return phamViBaoHanh;
    }

    public static String quocGiaXachTay() {
        System.out.println("Nhập quốc gia xách tay:");
        String quocGiaXachTay = input.nextLine();
        while (!Validate.checkQuocGiaXachTay(quocGiaXachTay)) {
            System.out.println("Bạn đã nhập sai định dạng");
            quocGiaXachTay = input.nextLine();
        }
        return quocGiaXachTay;
    }

    public static String trangThai() {
        System.out.println("Nhập trạng thái:");
        String trangThai = input.nextLine();
        while (!Validate.checkTrangThai(trangThai)) {
            System.out.println("Bạn đã nhập sai định dạng");
            trangThai = input.nextLine();
            trangThai = input.nextLine();
        }
        return trangThai;
    }

    public static void them() {
        System.out.println("Chọn loại điện thoại thêm vào:");
        System.out.println("1.Điện thoại chính hãng.");
        System.out.println("2.Điện thoại xách tay.");
        System.out.println("Mời bạn chọn");
        String choice = input.nextLine();
        switch (choice) {
            case "1": {
                DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(nhapId(), nhapTenDienThoai(),
                        nhapGiaBan(), nhapSoLuong(), nhaSanXuat(), thoiGianBaoHanh(), phamViBaoHanh());
                dienThoaiChinhHangList.add(dienThoaiChinhHang);
                ReadWrite.ghiDienThoaiChinhHang("src/Modul2/Data/DienThoaiChinhHang.csv", dienThoaiChinhHangList);
            }
            case "2": {
                DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(nhapId(), nhapTenDienThoai(), nhapGiaBan(),
                        nhapSoLuong(), nhaSanXuat(), quocGiaXachTay(), trangThai());
                dienThoaiXachTayList.add(dienThoaiXachTay);
                ReadWrite.ghiDienThoaiXachTay("src/Modul2/Data/DienThoaiXachTay.csv", dienThoaiXachTayList);
            }

        }
    }

    public static void xoa() {
        System.out.println("Chọn loại điện thoại cần xóa:");
        System.out.println("1.Điện thoại chính hãng.");
        System.out.println("2.Điện thoại xách tay.");
        System.out.println("Mời bạn chọn");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                List<DienThoaiChinhHang> dienThoaiChinhHangList = ReadWrite.docFileDienThoaiChinhHang("src/Modul2/Data/DienThoaiChinhHang.csv");
                for (DienThoaiChinhHang dienthoai: dienThoaiChinhHangList) {
                    System.out.println(dienthoai);
                }
                System.out.println("Nhập tên điện thoại cần xóa");
                String tenDienThoai = input.nextLine();
                for (DienThoaiChinhHang dienThoai : dienThoaiChinhHangList) {
                    if (tenDienThoai.equals(dienThoai.getTenDienThoai())) {
                        System.out.println("1.Yes");
                        System.out.println("2.No");
                        String choice1 = input.nextLine();
                        switch (choice1) {
                            case "1":
                                dienThoaiChinhHangList.remove(dienThoai);
                                ReadWrite.ghiDienThoaiChinhHang1("src/Modul2/Data/DienThoaiChinhHang.csv", dienThoaiChinhHangList);
                                System.out.println(dienThoaiChinhHangList);
                            case "2":
                                System.exit(0);
                        }
                    }

                }
                break;
            case "2":
                System.out.println("Nhập tên điện thoại cần xóa");
                String tenDienThoai1 = input.nextLine();
                List<DienThoaiXachTay> dienThoaiXachTayList = ReadWrite.docFileDienThoaiXachTay("src/Modul2/Data/DienThoaiXachTsy.csv");
                for (DienThoaiXachTay dienThoai : dienThoaiXachTayList) {
                    if (tenDienThoai1.equals(dienThoai.getTenDienThoai())) {
                        System.out.println("1.Yes");
                        System.out.println("2.No");
                        String choice1 = input.nextLine();
                        switch (choice1) {
                            case "1":
                                dienThoaiXachTayList.remove(dienThoai);
                                ReadWrite.ghiDienThoaiXachTay("src/Modul2/Data/DienThoaiXachTay.csv", dienThoaiXachTayList);
                            case "2":
                                System.exit(0);
                        }
                    }
                }
                break;
        }
    }

    public static void xem() {
        System.out.println("Chọn loại điện thoại cần xem:");
        System.out.println("1.Điện thoại chính hãng.");
        System.out.println("2.Điện thoại xách tay.");
        System.out.println("Mời bạn chọn");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                List<DienThoaiChinhHang> dienThoaiChinhHangList = ReadWrite.docFileDienThoaiChinhHang("src/Modul2/Data/DienThoaiChinhHang.csv");
                int temp = 1;
                if (dienThoaiChinhHangList.size() != 0) {
                    for (DienThoaiChinhHang dienThoai : dienThoaiChinhHangList) {
                        System.out.println(temp + "." + dienThoai.toString());
                        temp++;
                    }
                } else {
                    System.out.println("File trống!!");
                }
                break;


            case "2":
                List<DienThoaiXachTay> dienThoaiXachTayList = ReadWrite.docFileDienThoaiXachTay("src/Modul2/Data/DienThoaiXachTsy.csv");
                int temp1 = 1;
                if (dienThoaiXachTayList.size() != 0) {
                    for (DienThoaiXachTay dienThoai : dienThoaiXachTayList) {
                        System.out.println(temp1 + "." + dienThoai.toString());
                    }
                } else {
                    System.out.println("File trống!!");
                    break;
                }

        }
    }

    public static void timkiem() {
        System.out.println("Chọn loại điện thoại cần tìm:");
        System.out.println("1.Điện thoại chính hãng.");
        System.out.println("2.Điện thoại xách tay.");
        System.out.println("Mời bạn chọn");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                List<DienThoaiChinhHang> dienThoaiChinhHangList = ReadWrite.docFileDienThoaiChinhHang("src/Modul2/Data/DienThoaiChinhHang.csv");
                System.out.println("Nhập tên điện thoại cần tìm:");
                String ten = input.nextLine();
                for (DienThoaiChinhHang dienThoai : dienThoaiChinhHangList) {
                    if (ten.equals(dienThoai.getTenDienThoai())) {
                        System.out.println(dienThoai.toString());
                    } else {
                        System.out.println("Không tìm thấy điện thoại cần tìm!!!");
                    }
                }
                break;
            case "2":
                List<DienThoaiXachTay> dienThoaiXachTayList = ReadWrite.docFileDienThoaiXachTay("src/Modul2/Data/DienThoaiXachTsy.csv");
                System.out.println("Nhập tên điện thoại cần tìm:");
                String ten1 = input.nextLine();
                for (DienThoaiXachTay dienThoai : dienThoaiXachTayList) {
                    if (ten1.equals(dienThoai.getTenDienThoai())) {
                        System.out.println(dienThoai.toString());
                    } else {
                        System.out.println("Không tìm thấy điện thoại cần tìm!!!");
                    }
                }
                break;

        }

    }
}

