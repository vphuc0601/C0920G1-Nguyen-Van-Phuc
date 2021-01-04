package CaseStudy.Controllers;

import CaseStudy.Models.*;
import java.lang.*;
import java.util.*;

public class MainController {
    public static List<Villa> villaList = new ArrayList<>();
    public static List<House> houseList = new ArrayList<>();
    public static List<Room> roomList = new ArrayList<>();
    public static List<Customer> customerList = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);


    public static void displayMenu() {
        System.out.println("----MENU----");
        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customers");
        System.out.println("4. Show Information of Customers");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Exit");
        String choice = input.nextLine();
        switch (choice) {
            case "1" : addNewServices();break;
            case "2" : showServices();break;
            case "3" : addNewCustomers();break;
            case "4" : showInformationCustomers();break;
            case "5" : addNewBooking();break;
            case "6" : showInformationEmployee();break;
        }
    }

    public static void addNewServices() {
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        System.out.println("5. Exit");
        int choice = input.nextInt();
        switch (choice) {
            case 1: {
                Villa villa = new Villa(inputIdVilla(), inputnameServices(), inputareaUse(), inputrentalCots(), inputmaxPeople(),
                        inputtypeRental(), inputstandard(), inputfacilities(),
                        inputfloor(), inputareapool());
                villaList.add(villa);
                ReadWritter.writeFileVilla("src/CaseStudy/Data/Villa.csv", villaList);
            }
            break;
            case 2: {
                House house = new House(inputIdHouse(), inputnameServices(), inputareaUse(), inputrentalCots(), inputmaxPeople(),
                        inputtypeRental(), inputstandard(), inputfloor(), inputfacilities());
                houseList.add(house);
                ReadWritter.writeFileHouse("src/CaseStudy/Data/House.csv", houseList);
            }
            break;
            case 3: {
                Room room = new Room(inputIdRoom(), inputnameServices(), inputareaUse(), inputrentalCots(), inputmaxPeople(),
                        inputtypeRental(), inputfreeservices());
                roomList.add(room);
                ReadWritter.writeFileRoom("src/CaseStudy/Data/Room.csv", roomList);
            }
            break;
            case 4:
                displayMenu();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    public static void showServices() {
        System.out.println("1. Show all Villa");
        System.out.println("2. Show all House");
        System.out.println("3. Show all Room");
        System.out.println("4. Show All Name Villa Not Duplicate");
        System.out.println("5.Show All Name House Not Duplicate");
        System.out.println("6.Show All Name Name Not Duplicate");
        System.out.println("7. Back to menu");
        System.out.println("8. Exit");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                showAllNameVillaNotDuplicate();
            case 5:
                showAllNameHouseNotDuplicate();
            case 6:
                showAllNameRoomNotDuplicate();
            case 7:
                displayMenu();
            case 8:
                System.exit(0);
        }

    }

    private static String inputIdVilla() {
        System.out.println("Enter id villa:");
        input.nextLine();
        String idVilla = input.nextLine();
        while (!Validate.checkIdVilla(idVilla)) {
            System.out.println("Villa invalid, please try again");
            idVilla = input.nextLine();
        }
        return idVilla;

    }

    private static String inputIdHouse() {
        System.out.println("Enter id house:");
        String idHouse = input.nextLine();
        while (!Validate.checkIdHouse(idHouse)) {
            System.out.println("House invalid, please try again");
            idHouse = input.nextLine();
        }
        return idHouse;
    }

    private static String inputIdRoom() {
        System.out.println("Enter id room:");
        String idRoom = input.nextLine();
        while (!Validate.checkIdRoom(idRoom)) {
            System.out.println("Villa invalid, please try again");
            idRoom = input.nextLine();
        }
        return idRoom;
    }

    private static String inputnameServices() {
        System.out.println("Enter name services:");
        String tenDichVu = input.nextLine();
        while (!Validate.checkTenDichVu(tenDichVu)) {
            System.out.println("Name services invalid, please try again");
            tenDichVu = input.nextLine();
        }
        return tenDichVu;
    }

    private static String inputareaUse() {
        System.out.println("Enter area use:");
        String dienTichSuDung = input.nextLine();
        while (!Validate.checkDienTichSuDung(dienTichSuDung)) {
            System.out.println("Area use invalid, please try again");
            dienTichSuDung = input.nextLine();
        }
        return dienTichSuDung;
    }

    private static String inputrentalCots() {
        System.out.println("Enter Rental cots:");
        String chiPhiThue = input.nextLine();
        while (!Validate.checkChiPhiThue(chiPhiThue)) {
            System.out.println("Rental cots invalid, please try again");
            chiPhiThue = input.nextLine();
        }
        return chiPhiThue;
    }

    private static String inputmaxPeople() {
        System.out.println("Enter max people :");
        String soNguoiToiDa = input.nextLine();
        while (!Validate.checkNguoiToiDa(soNguoiToiDa)) {
            System.out.println("People invalid, please try again");
            soNguoiToiDa = input.nextLine();
        }
        return soNguoiToiDa;
    }

    private static String inputtypeRental() {
        System.out.println("Enter rental:");
        return input.nextLine();
    }

    private static String inputstandard() {
        System.out.println("Enter standard :");
        return input.nextLine();
    }

    private static String inputfacilities() {
        System.out.println("Enter facilities:");
        return input.nextLine();
    }

    private static String inputfloor() {
        System.out.println("Enter floor:");
        String soTang = input.nextLine();
        while (!Validate.checkSoTang(soTang)) {
            System.out.println("Floor invalid, please try again");
            soTang = input.nextLine();
        }
        return soTang;
    }

    private static String inputareapool() {
        System.out.println("Enter areapool:");
        return input.nextLine();
    }

    private static String inputfreeservices() {
        System.out.println("Enter freeservices:");
        return input.nextLine();
    }

    private static String inputNameCustomer() {
        System.out.println("Enter name customer:");
        String nameCustomer = input.nextLine();
        while (!Validate.checkNameCustomer(nameCustomer)) {
            System.out.println("Name invalid, please try again");
            nameCustomer = input.nextLine();
        }
        return nameCustomer;
    }

    private static String inputDateOfBirth() {
        System.out.println("Enter your birthday:");
        String birthday = input.nextLine();
        while (!Validate.checkBirthday(birthday)) {
            System.out.println("Birthday invalid, please try agin");
            birthday = input.nextLine();
        }
        return birthday;
    }

    private static String inputGender() {
        System.out.println("Enter your gender:");
        String gender = input.nextLine();
        while (!Validate.checkGender(gender)) {
            System.out.println("Gender invalid, please try again");
            gender = input.nextLine();
        }
        return gender;
    }

    private static String inputIdCard() {
        System.out.println("Enter your IdCard:");
        String idCard = input.nextLine();
        while (!Validate.checkIdCard(idCard)) {
            System.out.println("ID card invalid, please try again");
            idCard = input.nextLine();
        }
        return idCard;

    }

    private static String inputPhone() {
        System.out.println("Enter your phone:");
        String phone = input.nextLine();
        while (!Validate.checkPhone(phone)) {
            System.out.println("Phone invalid, please try again");
            phone = input.nextLine();
        }
        return phone;
    }

    private static String inputEmail() {
        System.out.println("Enter your email:");
        String email = input.nextLine();
        while (!Validate.checkEmail(email)) {
            System.out.println("Email invalid, please try again");
            email = input.nextLine();
        }
        return email;
    }

    private static String inputGuest() {
        System.out.println("Enter guest:");
        String guest = input.nextLine();
        while (!Validate.checkGuest(guest)) {
            System.out.println("Guest invalid, please try again");
            guest = input.nextLine();
        }
        return guest;
    }

    private static String inputAddress() {
        System.out.println("Enter your address:");
        return input.nextLine();
    }

    public static void addNewCustomers() {
        Customer customer = new Customer(inputNameCustomer(), inputDateOfBirth()
                , inputGender(), inputIdCard(), inputPhone(), inputEmail(), inputGuest(), inputAddress());
        ReadWritter.writeFileCustomer("src/CaseStudy/Data/Customer.csv", customerList);
    }

    public static void showInformationCustomers() {
        List<Customer> customerList = ReadWritter.readFileCustomer("src/CaseStudy/Data/Customer.csv");
        Collections.sort(customerList);
        int temp = 1;
        for (Customer customer : customerList) {
            customer = customerList.get(temp - 1);
            System.out.println(temp + "." + customer.toString());
            temp++;
        }
    }

    public static void addNewBooking() {
        List<Customer> customerList = ReadWritter.readFileCustomer("src/CaseStudy/Data/Customer.csv");
        Collections.sort(customerList);
        int temp = 1;
        for (Customer customer : customerList) {
            customer = customerList.get(temp - 1);
            System.out.println(temp + "." + customer);
            temp++;
        }
        System.out.println("Booking customer");
        int choice = input.nextInt();
        Customer bookingCustomer = customerList.get(choice - 1);
        System.out.println(bookingCustomer);
        System.out.println("1. Booking Villa");
        System.out.println("2. Booking House");
        System.out.println("3. Booking Room");
        System.out.println("Please booking");
        int sc = input.nextInt();
        switch (sc) {
            case 1 -> {
                List<Villa> villaList = ReadWritter.readFileVilla("src/CaseStudy/Data/Villa.csv");
                int i = 1;
                for (Villa villa : villaList) {
                    villa = villaList.get(i - 1);
                    System.out.println(i + "." + villa);
                    i++;
                }
                System.out.println("Booking Villa");
                int i1 = input.nextInt();
                Villa bookingVilla = villaList.get(i1 - 1);
                String line = bookingCustomer.toString() + bookingVilla.toString();
                ReadWritter.writeFile("src/CaseStudy/Data/Booking.csv", line);
                System.out.println("Add succes!!!");
            }
            case 2 -> {
                List<House> houseList = ReadWritter.readFileHouse("src/CaseStudy/Data/House.csv");
                int j = 1;
                for (House house : houseList) {
                    house = houseList.get(j - 1);
                    System.out.println(j + "." + house);
                    j++;
                }
                System.out.println("Booking House");
                int j1 = input.nextInt();
                House bookingHouse = houseList.get(j1 - 1);
                String line1 = bookingCustomer.toString() + bookingHouse.toString();
                ReadWritter.writeFile("src/CaseStudy/Data/Booking.csv", line1);
                System.out.println("Add succes!!!");
            }
            case 3 -> {
                List<Room> roomList = ReadWritter.readFileRoom("src/CaseStudy/Data/Room.csv");
                int k = 1;
                for (Room room : roomList) {
                    System.out.println(k + "." + room.toString());
                    k++;
                }
                System.out.println("Booking Room");
                int k1 = input.nextInt();
                Room bookingRoom = roomList.get(k1 - 1);
                String line2 = bookingCustomer.toString() + bookingRoom.toString();
                ReadWritter.writeFile("src/CaseStudy/Data/Room.csv", line2);
                System.out.println("Add succes!!!");
            }
        }

    }

    public static void showAllVilla() {
        List<Villa> villaList = ReadWritter.readFileVilla("src/CaseStudy/Data/Villa.csv");
        int temp = 1;
        if (villaList.size() != 0) {
            for (Villa villa : villaList) {
                System.out.println(temp + "." + villa.toString());
                temp++;
            }
        } else {
            System.out.println(" File is empty");
        }

    }

    public static void showAllHouse() {
        List<House> houseList = ReadWritter.readFileHouse("src/CaseStudy/Data/House.csv");
        int temp = 1;
        for (House house : houseList) {
            System.out.println(temp + "." + house.toString());
            temp++;
        }
    }

    public static void showAllRoom() {
        List<Room> roomList = ReadWritter.readFileRoom("src/CaseStudy/Data/Room.csv");
        int temp = 1;
        for (Room room : roomList) {
            System.out.println(temp + "." + room.toString());
            temp++;
        }
    }

    public static void showAllNameVillaNotDuplicate() {
        List<Villa> villaList = ReadWritter.readFileVilla("src/CaseStudy/Data/Villa.csv");
        TreeSet<Villa> villaTreeSet = new TreeSet<>(villaList);
        villaTreeSet.addAll(villaList);
        for (Villa villa:villaTreeSet) {
            System.out.println(villa);
        }
    }

    public static void showAllNameHouseNotDuplicate() {
        List<House> houseList=ReadWritter.readFileHouse("src/CaseStudy/Data/House.csv");
        TreeSet<House> houseTreeSet = new TreeSet<>(houseList);
        houseTreeSet.addAll(houseList);
        for (House house:houseTreeSet) {
            System.out.println(house);
        }
    }

    public static void showAllNameRoomNotDuplicate() {
        List<Room> roomList=ReadWritter.readFileRoom("src/CaseStudy/Data/Room.csv");
        TreeSet<Room> roomTreeSet = new TreeSet<>(roomList);
        roomTreeSet.addAll(roomList);
        for (Room room: roomTreeSet) {
            System.out.println(room);
        }

    }

    public static void showInformationEmployee() {
        List<Employee> employeeList = ReadWritter.readFileEmployee("src/CaseStudy/Data/Employee.csv");
        for (int i = 1; i <= employeeList.size(); i++) {
            Employee employee = employeeList.get(i - 1);
            Map<Integer, Employee> map = new HashMap<>();
            map.put(i, employee);
            Set<Integer> set = map.keySet();
            for (Object key : set) {
                System.out.println(key + ". " + map.get(key));
            }
        }
    }
}

