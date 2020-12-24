package CaseStudy.Controllers;

import CaseStudy.Models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadWritter {
    public static List<Customer> readFileCustomer(String pathFile) {
        List<Customer> list = new ArrayList<>();
        Customer customer=null;
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] elementLine = line.split(",");
                customer=new Customer(elementLine[0],elementLine[1],elementLine[2],elementLine[3],elementLine[4],
                        elementLine[5],elementLine[6],elementLine[7]);
                list.add(customer);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


    public static List<Villa> readFileVilla(String pathFile) {
        List<Villa> list = new ArrayList<>();
        Villa villa=null;
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] elementLine = line.split(",");
                villa=new Villa(elementLine[0],elementLine[1],elementLine[2],elementLine[3],elementLine[4],
                        elementLine[5],elementLine[6],elementLine[7],elementLine[8],elementLine[9]);
                list.add(villa);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<House> readFileHouse(String pathFile) {
        List<House> list = new ArrayList<>();
        House house=null;
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] elementLine = line.split(",");
                house=new House(elementLine[0],elementLine[1],elementLine[2],elementLine[3],elementLine[4],
                        elementLine[5],elementLine[6],elementLine[7],elementLine[8]);
                list.add(house);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static List<Room> readFileRoom(String pathFile) {
        List<Room> list = new ArrayList<>();
        Room room=null;
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] elementLine = line.split(",");
                room=new Room(elementLine[0],elementLine[1],elementLine[2],elementLine[3],elementLine[4],
                        elementLine[5],elementLine[6]);
                list.add(room);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static List<Employee> readFileEmployee(String pathFile) {
        List<Employee> list = new ArrayList<>();
        Employee employee=null;
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] elementLine = line.split(",");
                employee=new Employee(elementLine[0],elementLine[1],elementLine[2]);
                list.add(employee);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void writeFileCustomer(String pathFile, List<Customer> customers) {
        try {
            FileWriter writer = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Customer customer:customers) {
                bufferedWriter.write(customer.getName()+","+ customer.getDayOfBirth()+","+customer.getGender()+","+
                        customer.getIdCard()+","+customer.getPhone()+","+customer.getEmail()+","+customer.getGuest()+","+customer.getAddress());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileVilla(String pathFile, List<Villa> villaList) {
        try {
            FileWriter writer = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Villa villa:villaList) {
                bufferedWriter.write(villa.getId()+","+villa.getTenDichVu()+","+villa.getDienTichSudung()+","+villa.getChiPhiThue()+","+villa.getSoNguoiToiDa()+","+
                        villa.getKieuThue()+","+villa.getTieuChuanPhong()+","+villa.getTienNghiKhac()+","+villa.getSoTang()+","+villa.getDienTichHoBoi());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileHouse(String pathFile, List<House> houses) {
        try {
            FileWriter writer = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (House house:houses) {
                bufferedWriter.write(house.getId()+","+house.getTenDichVu()+","+ house.getDienTichSudung()+","+house.getChiPhiThue()+","+
                        house.getSoNguoiToiDa()+","+house.getKieuThue()+","+house.getTieuChuanPhong()+","+house.getSoTang()+","+house.getTienNghiKhac());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileRoom(String pathFile, List<Room> rooms) {
        try {
            FileWriter writer = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Room room:rooms) {
                bufferedWriter.write(room.getId()+","+room.getTenDichVu()+","+room.getDienTichSudung()+","+room.getChiPhiThue()+","+
                        room.getSoNguoiToiDa()+","+room.getKieuThue()+","+room.getDichVuMienPhi());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeFile(String pathFile, String line) {
        try {
            FileWriter writer = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
