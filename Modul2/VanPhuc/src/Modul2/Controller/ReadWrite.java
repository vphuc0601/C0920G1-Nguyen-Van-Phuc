package Modul2.Controller;

import CaseStudy.Models.Customer;
import Modul2.Modell.DienThoaiChinhHang;
import Modul2.Modell.DienThoaiXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
    public static void ghiDienThoaiChinhHang(String pathFile, List<DienThoaiChinhHang> dienThoaiChinhHangs) {
        try {
            FileWriter writer = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (DienThoaiChinhHang dienThoaiChinhHang:dienThoaiChinhHangs) {
                bufferedWriter.write(dienThoaiChinhHang.getId()+","+ dienThoaiChinhHang.getTenDienThoai()+","+
                        dienThoaiChinhHang.getGiaBan()+","+ dienThoaiChinhHang.getSoLuong()
                        +","+dienThoaiChinhHang.getNhaSanXuat()+","+dienThoaiChinhHang.getThoiGianBaoHanh()
                        +","+dienThoaiChinhHang.getPhamViBaoHanh());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void ghiDienThoaiXachTay(String pathFile, List<DienThoaiXachTay> dienThoaiXachTays) {
        try {
            FileWriter writer = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (DienThoaiXachTay dienThoaiXachTay:dienThoaiXachTays) {
                bufferedWriter.write(dienThoaiXachTay.getId()+","+ dienThoaiXachTay.getTenDienThoai()+","+
                        dienThoaiXachTay.getGiaBan()+","+ dienThoaiXachTay.getSoLuong()
                        +","+dienThoaiXachTay.getNhaSanXuat()+","+dienThoaiXachTay.getQuocGiaXachTay()
                        +","+dienThoaiXachTay.getTrangThai());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<DienThoaiChinhHang> docFileDienThoaiChinhHang(String pathFile) {
        List<DienThoaiChinhHang> list = new ArrayList<>();
        DienThoaiChinhHang dienThoaiChinhHang=null;
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] elementLine = line.split(",");
                dienThoaiChinhHang=new DienThoaiChinhHang(elementLine[0],elementLine[1],elementLine[2],elementLine[3],elementLine[4],
                        elementLine[5], elementLine[6]);
                list.add(dienThoaiChinhHang);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static List<DienThoaiXachTay> docFileDienThoaiXachTay(String pathFile) {
        List<DienThoaiXachTay> list = new ArrayList<>();
        DienThoaiXachTay dienThoaiXachTay=null;
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] elementLine = line.split(",");
                dienThoaiXachTay=new DienThoaiXachTay(elementLine[0],elementLine[1],elementLine[2],elementLine[3],elementLine[4],
                        elementLine[5], elementLine[6]);
                list.add(dienThoaiXachTay);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void ghiDienThoaiChinhHang1(String pathFile, List<DienThoaiChinhHang> dienThoaiChinhHangs) {
        try {
            FileWriter writer = new FileWriter(pathFile,false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (DienThoaiChinhHang dienThoaiChinhHang:dienThoaiChinhHangs) {
                bufferedWriter.write(dienThoaiChinhHang.getId()+","+ dienThoaiChinhHang.getTenDienThoai()+","+
                        dienThoaiChinhHang.getGiaBan()+","+ dienThoaiChinhHang.getSoLuong()
                        +","+dienThoaiChinhHang.getNhaSanXuat()+","+dienThoaiChinhHang.getThoiGianBaoHanh()
                        +","+dienThoaiChinhHang.getPhamViBaoHanh());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
