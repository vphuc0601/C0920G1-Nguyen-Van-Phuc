package CollectionFrameWork.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "NOKIA", 2000000);
        Product product2 = new Product(2, "SAMSUNG", 4.000000);
        Product product3 = new Product(3, "Iphone", 20.000000);
        Product product4 = new Product(4, "OPPO", 5.000000);
        List<Product> lists = new ArrayList<Product>();
        lists.add(product1);
        lists.add(product2);
        lists.add(product3);
        lists.add(product4);
        System.out.println("1.Add Product");
        System.out.println("2.Edit Product");
        System.out.println("3.Delete Product");
        System.out.println("4.Display Product");
        System.out.println("5.Search Product");
        System.out.println("6.Sort Product");
        System.out.println("----------------------------------");
        System.out.println("Please enter your choice:");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addProduct();
            case 2:
                editProduct();
            case 3:
                deleteProduct();
            case 4:
                display();
            case 5:
                search();
            case 6:
                sortProduct();
        }

    }

    private static void addProduct() {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(7, "Xiaomi", 3.000000));
        for (Product product: products) {
            System.out.println(product.toString());
        }

    }

    private static void editProduct() {

        ArrayList<Product> products = new ArrayList<>();
        System.out.println(products);
//        int index = products.indexOf(products);
        products.set(1, new Product(1, "Huawei", 3.000000));

    }

    private static void deleteProduct() {
        ArrayList<String> products = new ArrayList<>();
//        int index = products.indexOf(products);
        products.remove(1);
        System.out.println(products);
    }

    private static void display() {
        ArrayList<String> products = new ArrayList<>();
        System.out.println(products);
    }

    private static void search() {
        ArrayList<String> products = new ArrayList<>();
        System.out.println(products.indexOf(3));
    }

    private static void sortProduct() {
        ArrayList<String> products = new ArrayList<>();
        Collections.sort(products);
        System.out.println(products);
    }
}