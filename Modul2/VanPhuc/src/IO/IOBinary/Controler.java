package IO.IOBinary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controler {
    public static List<Product> productList= new ArrayList<>();
    public static Scanner sc= new Scanner(System.in);
    private static int inputId(){
        System.out.println("Enter id product:");
        int id= sc.nextInt();
        return id;
    }
    private static String inputName(){
        System.out.println("Enter name product:");
        String name=sc.nextLine();
        return name;
    }
    private static String inputMaker(){
        System.out.println("Enter maker product:");
        String maker=sc.nextLine();
        return maker;
    }
    private static int inputPrice(){
        System.out.println("Enter price product:");
        int price=sc.nextInt();
        return price;
    }
    private static String inputOther(){
        System.out.println("Enter other:");
        String other=sc.nextLine();
        return other;
    }
    public static void addProduct(){
        Product product= new Product(inputId(),inputName(),inputMaker(),inputPrice(),inputOther());
        productList.add(product);
        try {
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("src/IO/IOBinary/product.io"));
            objectOutputStream.writeObject(product);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void showProduct(){
        ObjectInputStream objectInputStream= null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("src/IO/IOBinary/product.io"));
            objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Product products:productList) {
            System.out.println(products.toString());
        }
    }
    public static void editProduct(){
        showProduct();
        System.out.println("Please enter your choice:");
        int choice=sc.nextInt();
        for (Product product:productList) {
            if (choice == product.getId()){
                System.out.println(product.toString());
                product= new Product(inputId(),inputName(),inputMaker(),inputPrice(),inputOther());
                productList.add(product);
            }else {
                System.out.println("Product invalid");
            }
        }
    }
    public static void searchProduct(){
        System.out.println("1. Search by id");
        System.out.println("2. Search by name");
        System.out.println("Please enter your choice");
        String choice= sc.nextLine();
        switch (choice){
            case "1":
                {
                    int a=sc.nextInt();
                    for (Product product:productList) {
                        if(a==product.getId()){
                            System.out.println(product.toString());
                        }
                        else{
                            System.out.println("Product invalid");
                        }
                    }
                }
            case "2":
            {
                String b=sc.nextLine();
                for (Product product:productList) {
                    if(b.equals(product.getName())){
                        System.out.println(product.toString());
                    }
                    else {
                        System.out.println("Product invalid");
                    }
                }
            }

        }
    }
    public static void deleteProduct(){

    }
}
