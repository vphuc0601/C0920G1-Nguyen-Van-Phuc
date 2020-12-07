package FuramaResort2.Controllers;

import FuramaResort2.Models.*;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;

public class MainController {
    ArrayList<Villa> villaArrayList = new ArrayList<>();
    ArrayList<House> houseArrayList = new ArrayList<>();
    ArrayList<Room> roomArrayList = new ArrayList<>();
    ArrayList<Custosmer> custosmerArrayList = new ArrayList<>();
    Custosmer custosmer=new Custosmer();
    String fileVilla = "src/FuramaResort2/Villa.csv";
    String fileHouse = "src/FuramaResort2/House.csv";
    String fileRoom = "src/FuramaResort2/Room.csv";
    String fileCustosmer = "src/FuramaResort2/Custosmer.csv";
    String fileBooking= "src/FuramaResort2/Booking.csv";

    public static Scanner input = new Scanner(System.in);

    void displayMainMenu() {
        System.out.println("1.Add New Services");
        System.out.println("2.Show Services");
        System.out.println("3.Add New Customer");
        System.out.println("4.Show Information of Customer");
        System.out.println("5.Add New Booking");
        System.out.println("6.Show Information of Employee");
        System.out.println("7.Exit");
        System.out.println("Please enter your choice:");

        String choose = input.nextLine();
        switch (choose) {
            case "1":
                addNewServies();
            case "2":
                showServices();
            case "3":
                addNewCustosmer();
            case "4":
                showInformationCustosmer();
            case "5":
                addNewBooking();
            case "6":
                showInformationofEmployee();
            case "7":
                System.exit(0);
        }
    }


    void addNewServies() {
        System.out.println("1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        System.out.println("4.Back to menu");
        System.out.println("5.Exit");

        String choose = input.nextLine();
        System.out.println("Please enter your choice:");
        switch (choose) {
            case "1":
                addNewVilla();
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            case "4":
                displayMainMenu();
            case "5":
                System.exit(0);
        }
    }

    public void addNewVilla() {

        System.out.println("Nhap tieu chuan phong: ");
        String tieuchuanphong = input.nextLine();
        System.out.println("Nhap tien nghi khac: ");
        String tiennghikhac = input.nextLine();
        System.out.println("Nhap so tang: ");
        String sotang = input.nextLine();
        System.out.println("Nhap dien tich ho boi: ");
        String dientichhoboi = input.nextLine();
        Villa villa = new Villa(nhapMadichvu(), Integer.parseInt(nhapDientichsudung()), Integer.parseInt(nhapChiphithue()), Integer.parseInt(nhapNguoitoida()),
                nhapKieuthue(), tieuchuanphong, tiennghikhac, Integer.parseInt(sotang), Integer.parseInt(dientichhoboi));
        villaArrayList.add(villa);
        try {
            FileWriter writerVilla = new FileWriter(fileVilla,true);
            BufferedWriter writer = new BufferedWriter(writerVilla);
            for (Villa villa1 : villaArrayList) {
                writer.write(villa1.getMadichvu() + "," + villa1.getDientichsudung() + "," +
                        villa1.getChiphithue() + "," + villa1.getNguoitoida() + "," + villa1.getKieuthue() + ","
                        + tieuchuanphong + "," + tiennghikhac + "," + sotang + "," + dientichhoboi);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void addNewHouse() {
        System.out.println("Nhap tieu chuan phong: ");
        String tieuchuanphong = input.nextLine();
        System.out.println("Nhap tien nghi khac: ");
        String tiennghikhac = input.nextLine();
        System.out.println("Nhap so tang: ");
        String sotang = input.nextLine();
        House house = new House(nhapMadichvu(), Integer.parseInt(nhapDientichsudung()), Integer.parseInt(nhapChiphithue()), Integer.parseInt(nhapNguoitoida()),
                nhapKieuthue(), tieuchuanphong, tiennghikhac, Integer.parseInt(sotang));
        houseArrayList.add(house);

        try {
            FileWriter writerHouse = new FileWriter(fileHouse,true);
            BufferedWriter writer = new BufferedWriter(writerHouse);
            for (House house1 : houseArrayList) {
                writer.write(house1.getMadichvu() + "," + house1.getDientichsudung() + "," +
                        house1.getChiphithue() + "," + house1.getNguoitoida() + "," + house1.getKieuthue() + ","
                        + house1.getTieuchuanphong() + "," + house1.getTiennghikhac() + "," + house1.getSotang());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void addNewRoom() {
        String dichvumienphi = input.nextLine();
        Room room = new Room(nhapMadichvu(), Integer.parseInt(nhapDientichsudung()), Integer.parseInt(nhapChiphithue()), Integer.parseInt(nhapNguoitoida()),
                nhapKieuthue(), dichvumienphi);
        roomArrayList.add(room);
        try {
            FileWriter writerRoom = new FileWriter(fileRoom,true);
            BufferedWriter writer = new BufferedWriter(writerRoom);
            for (Room room1 : roomArrayList) {
                writer.write(room1.getMadichvu() + "," + room1.getDientichsudung() + "," +
                        room1.getChiphithue() + "," + room1.getNguoitoida() + "," + room1.getKieuthue()
                        + "," + room1.getDichvumienphi());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addNewCustosmer() {
        Custosmer custosmer = new Custosmer(nhapHoten(), nhapNgaysinh(), nhapGioitinh(), nhapCMND(), nhapPhone(), nhapMail(), nhapLoaikhach(), nhapDiachi());
        custosmerArrayList.add(custosmer);

        try {
            FileWriter writerCustosmer = new FileWriter(fileCustosmer,true);
            BufferedWriter writer = new BufferedWriter(writerCustosmer);
            for (Custosmer custosmer1 : custosmerArrayList) {
                writer.write(custosmer1.getHoten() + "," + custosmer1.getNgaysinh() + "," + custosmer1.getGioitinh() + "," + custosmer1.getCmnd() + "," +
                        custosmer1.getPhone() + "," + custosmer1.getEmail() + "," + custosmer1.getLoaikhach() + "," + custosmer1.getDiachi());
                writer.newLine();
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void addNewBooking(){
        List<Custosmer> list = getAllCustosmer();
        showInformationCustosmer();
//        Custosmer cus = null;
        System.out.println("Chon customer");
        int choose = input.nextInt();
//        cus=list.get(choose-1);
        try {
            File file1 = new File("src/FuramaResort2/Booking.csv");
            FileWriter fileWriter = new FileWriter(file1, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(list.indexOf(choose-1));
            bufferedWriter.newLine();
            bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("1.Booking Villa");
        System.out.println("2.Booking House");
        System.out.println("3.Booking Room");
        String choose1 = input.nextLine();
        System.out.println("Please enter your choice:");
        switch (choose1){
            case "1":
                showAllVilla();
                System.out.println("Chon villa:");
                choose = input.nextInt();
                try {
                    FileWriter fileWriter = new FileWriter(fileBooking, true);
                    BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
                    bufferedWriter.write(villaArrayList.indexOf(choose-1));
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            case "2":
                showAllHouse();
                System.out.println("Chon House:");
                choose= input.nextInt();
                try{
                    FileWriter fileWriter= new FileWriter(fileBooking, true);
                    BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
                    bufferedWriter.write(houseArrayList.indexOf(choose-1));
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            case "3":
                showAllRoom();
                System.out.println("Chon Room:");
                choose= input.nextInt();
                try{
                    FileWriter fileWriter=new FileWriter(fileBooking, true);
                    BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
                    bufferedWriter.write(roomArrayList.indexOf(choose-1));
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
        }
    }


    private static final String REG_ID = "(SV)(VL|HO|RO)-[0-9]{4}";
    private static final String REG_DIENTICH = "[3-9][0-9]";
    private static final String REG_CHIPHITHUE = "[0-9]{6}";
    private static final String REG_NGUOITOIDA = "[1-19]";
    private static final String REG_HOTEN="[A-Z]([a-z]+|\\s[a-z]+)";
    private static final String REG_NGAYSINH="^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
            "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
            "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";
    private static final String REG_GIOITINH="(Nam|Nu|Khac)";
    private static final String REG_CMND="[0-9]{3}( )[0-9]{3}( )[0-9]{3}";
    private static final String REG_PHONE="(84|0[3|5|7|8|9])+([0-9]{8})";
    private static final String REG_MAIL="(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

    public String nhapMadichvu() {
        System.out.println("Nhap ma dich vu");
        return CheckFormat.check(input.nextLine(), REG_ID);
    }

    public String nhapDientichsudung() {
        System.out.println("Nhap dien tich su dung: ");
        return CheckFormat.check(input.nextLine(), REG_DIENTICH);
    }

    public String nhapChiphithue() {
        System.out.println("Nhap chi phi thue: ");
        return CheckFormat.check(input.nextLine(), REG_CHIPHITHUE);
    }

    public String nhapNguoitoida() {
        System.out.println("Nhap so nguoi toi da: ");
        return CheckFormat.check(input.nextLine(), REG_NGUOITOIDA);


    }

    public String nhapKieuthue() {
        System.out.println("nhap kieu thue: ");
        return input.nextLine();
    }

    public String nhapHoten() {
        System.out.println("Nhập tên khách hàng:");
        return CheckFormat.check(input.nextLine(),REG_HOTEN);
    }

    public String nhapNgaysinh() {
        System.out.println("Nhập ngày sinh:");
        return CheckFormat.check(input.nextLine(),REG_NGAYSINH);
    }

    public String nhapGioitinh() {
        System.out.println("Nhập giới tính:");
        return CheckFormat.check(input.nextLine(),REG_GIOITINH);
    }

    public String nhapCMND() {
        System.out.println("Nhập CMND: ");
        return CheckFormat.check(input.nextLine(),REG_CMND);
    }

    public String nhapPhone() {
        System.out.println("Nhập số điện thoại: ");
        return CheckFormat.check(input.nextLine(),REG_PHONE);
    }

    public String nhapMail() {
        System.out.println("Nhập email:");
        return CheckFormat.check(input.nextLine(),REG_MAIL);
    }

    public String nhapLoaikhach() {
        System.out.println("Nhập loại khách:");
        return input.nextLine();
    }

    public String nhapDiachi() {
        System.out.println("Nhập địa chỉ: ");
        return input.nextLine();
    }


    void showServices() {
        System.out.println("1.Show all Villa");
        System.out.println("2.Show all House");
        System.out.println("3.Show all Room");
        System.out.println("4.Show All Name Villa Not Duplicate");
        System.out.println("5.Show All Name House Not Duplicate");
        System.out.println("6.Show All Name Name Not Duplicate");
        System.out.println("7.Back to menu");
        System.out.println("8.Exit");
        Scanner sc = new Scanner(System.in);
        int choose = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter your choice:");
        switch (choose) {
            case 1:
                showAllVilla();
            case 2:
                showAllHouse();
            case 3:
                showAllRoom();
            case 4:
                ShowAllNameVillaNotDuplicate();
            case 5:
                ShowAllNameHouseNotDuplicate();
            case 6:
                ShowAllNameRoomNotDuplicate();
            case 7:
                displayMainMenu();
            case 8:
                System.exit(0);
        }
    }

    void showAllVilla() {
        try {
            FileReader readerVilla = new FileReader(fileVilla);
            BufferedReader reader = new BufferedReader(readerVilla);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] readVilla;
                readVilla = line.split(",");
                Villa villa = new Villa(readVilla[0], Double.parseDouble(readVilla[1]), Double.parseDouble(readVilla[2]), Integer.parseInt(readVilla[3]),
                        readVilla[4], readVilla[5], readVilla[6], Integer.parseInt(readVilla[7]), Double.parseDouble(readVilla[8]));
                villaArrayList.add(villa);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Villa villa1 : villaArrayList) {
            System.out.println("Villa:" + villa1.showInfor());
        }
    }


    void showAllHouse() {
        try {
            FileReader readerHouse = new FileReader(fileHouse);
            BufferedReader reader = new BufferedReader(readerHouse);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] readHouse;
                readHouse = line.split(",");
                House house = new House(readHouse[0], Double.parseDouble(readHouse[1]), Double.parseDouble(readHouse[2]), Integer.parseInt(readHouse[3]),
                        readHouse[4], readHouse[5], readHouse[6], Integer.parseInt(readHouse[7]));
                houseArrayList.add(house);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (House house1 : houseArrayList) {
            System.out.println("House: " + house1.showInfor());
        }
    }

    void showAllRoom() {
        try {
            FileReader readerRoom = new FileReader(fileRoom);
            BufferedReader reader = new BufferedReader(readerRoom);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] readRoom;
                readRoom = line.split(",");
                Room room = new Room(readRoom[0], Double.parseDouble(readRoom[1]), Double.parseDouble(readRoom[2]), Integer.parseInt(readRoom[3]),
                        readRoom[4], readRoom[5]);
                roomArrayList.add(room);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Room room1 : roomArrayList) {
            System.out.println("Room: " + room1.showInfor());
        }
    }

    void ShowAllNameVillaNotDuplicate() {
    }

    void ShowAllNameHouseNotDuplicate() {
    }

    void ShowAllNameRoomNotDuplicate() {
    }

    private void showInformationCustosmer() {
        List<Custosmer> list =getAllCustosmer();
        list.sort(new Comparater());
        int i=1;
        for (Custosmer custosmer1: list) {
            System.out.println(i+". "+custosmer1);
            i++;
        }
    }
    private void showInformationofEmployee(){

    }
    private List<Custosmer> getAllCustosmer(){
        List<Custosmer> list =new ArrayList<>();
        try {
            FileReader readerCustosmer = new FileReader(fileCustosmer);
            BufferedReader reader = new BufferedReader(readerCustosmer);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] readCustosmer;
                readCustosmer = line.split(",");
                Custosmer custosmer = new Custosmer(readCustosmer[0], readCustosmer[1], readCustosmer[2], readCustosmer[3],
                        readCustosmer[4], readCustosmer[5], readCustosmer[6], readCustosmer[7]);
                list.add(custosmer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
