package IO.IOBinary;

import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        System.out.println("*****MANAGERP_RODUCT*****");
        System.out.println("1. Add product");
        System.out.println("2. Show product");
        System.out.println("3. Edit product");
        System.out.println("4. Search product");
        System.out.println("5. Delete product");
        System.out.println("Enter your choice:");
        Scanner sc= new Scanner(System.in);
        String choice=sc.nextLine();
        switch (choice){
            case "1": Controler.addProduct();break;
            case "2": Controler.showProduct();break;
            case "3": Controler.editProduct();break;
            case "4": Controler.searchProduct();break;
            case "5": Controler.deleteProduct();break;
        }
    }


}
