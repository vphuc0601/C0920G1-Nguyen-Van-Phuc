package OnTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    public static List<ImportProduct> importProducts = new ArrayList<>();
    public static List<ExportProduct> exportProducts = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void readFile() {
        List<String[]> list = ReaderWriter.reader("src/OnTap/ImportProduct.csv");
        for (String[] list1 : list) {
            ImportProduct importProduct = new ImportProduct(list1[0], list1[1], list1[2], list1[3],
                    list1[4], list1[5], list1[6], list1[7], list1[8]);
            importProducts.add(importProduct);
        }
        List<String[]> list2 = ReaderWriter.reader("src/OnTap/ExportProduct.csv");
        for (String[] list3 : list2) {
            ExportProduct exportProduct = new ExportProduct(list3[0], list3[1], list3[2], list3[3], list3[4],
                    list3[5], list3[6], list3[7]);
            exportProducts.add(exportProduct);
        }
    }

    public static void main(String[] args) {
        readFile();
        System.out.println("--Chương trình quản lý sản phâm--");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1.Add produt");
        System.out.println("2.Delete product");
        System.out.println("3.Show infor product");
        System.out.println("4.Search product");
        System.out.println("5.Exit");
        ManagerProduct managerProduct = new ManagerProduct();

        switch (input.nextLine()) {
            case "1" -> managerProduct.addProduct();
            case "2" -> managerProduct.deleteProduct();
            case "3" -> managerProduct.showInforProduct();
            case "4" -> managerProduct.searchProduct();
            case "5" -> System.exit(0);
        }
    }

    public void addProduct() {
        System.out.println("1.Add importProduct");
        System.out.println("2.Add exportProduct");
        String choose = input.nextLine();
        switch (choose) {
            case "1": {
                ImportProduct importProduct = new ImportProduct(inputId(), inputSerialProduct(), inputName(),
                        inputPrice(), inputAmount(), inputManufacturers(), inputPriceImport(),
                        inputProvinceImport(), inputTaxImport());
                ReaderWriter.writer("src/OnTap/ImportProduct.csv", importProduct.getId() + ","
                        + importProduct.getSerialProduct() + "," + importProduct.getName() + ","
                        + importProduct.getPrice() + "," + importProduct.getAmount() + ","
                        + importProduct.getManufacturers() + "," + importProduct.getPriceImport() + ","
                        + importProduct.getProvinceImport() + "," + importProduct.getTaxImport())
                ;
                break;

            }
            case "2": {
                ExportProduct exportProduct = new ExportProduct(inputId(), inputSerialProduct(), inputName(), inputPrice(),
                        inputAmount(), inputManufacturers(), inputPriceExport(), inputNationalExport());
                ReaderWriter.writer("src/OnTap/ExportProduct.csv", exportProduct.getId() + "," + exportProduct.getSerialProduct() + ","
                        + exportProduct.getName() + "," + exportProduct.getPrice() + "," + exportProduct.getAmount() + ","
                        + exportProduct.getManufacturers() + "," + exportProduct.getPriceExport() + "," + exportProduct.getNationalExport());

            }
        }
    }

    public void deleteProduct() {
        System.out.println("1.Delete importProduct:");
        System.out.println("2.Delete exportProduct:");
        String choose = input.nextLine();
        switch (choose) {
            case "1": {
                System.out.println(importProducts);
                System.out.println("Please enter ID delete:");
                String id = input.nextLine();
                UltilReadWrite.showListImportProduct();
                List<ImportProduct> list = UltilReadWrite.readProductImport();
                for (ImportProduct importProduct1 : list) {
                    if (importProduct1.getId().equals(id)) {
                        list.remove(importProduct1);
                    } else {
                        System.out.println("File entry");
                    }
                }
                UltilReadWrite.writeProductImport(list, false);
                UltilReadWrite.showListImportProduct();

                break;
            }
            case "2": {
                System.out.println(exportProducts);
                System.out.println("Please enter ID delete:");
                String id1 = input.nextLine();
                for (ExportProduct exportProduct : exportProducts) {
                    if (exportProduct.getId().equals(id1)) {
                        ManagerProduct.exportProducts.remove(exportProduct);
                    }
                    ReaderWriter.removeFile("src/OnTap/EXportProduct.csv");
                    ReaderWriter.writer("src/OnTap/EXportProduct.csv", exportProducts.toString());
                    break;
                }
            }
        }
    }

    public void showInforProduct() {

        System.out.println("1.Show importProduct:");
        System.out.println("2.Show exportProduct:");
        String choose = input.nextLine();

        switch (choose) {
            case "1":
                System.out.println(importProducts);
                break;
            case "2":
                System.out.println(exportProducts);
                break;
        }
    }

    public void searchProduct() {
        System.out.println("1.Search ImportProduct:");
        System.out.println("2.Search ImportProduct:");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                System.out.println(importProducts);
                System.out.println("Please enter ID search:");
                String id = input.nextLine();
                for (ImportProduct importProduct : importProducts) {
                    if (importProduct.getId().equals(id)) {
                        System.out.println(importProduct);
                    }
                }
                break;
            case "2":
                System.out.println(exportProducts);
                System.out.println("Please enter ID search:");
                String id1 = input.nextLine();
                for (ExportProduct exportProduct : exportProducts) {
                    if (exportProduct.getId().equals(id1)) {
                        System.out.println(exportProduct);
                    }
                }
                break;
        }
    }


    public String inputId() {
        System.out.println("Nhap ID:");
        return input.nextLine();
    }

    public String inputSerialProduct() {

        System.out.println("Nhap ma san pham:");
        return input.nextLine();
    }

    public String inputName() {
        System.out.println("Nhập tên sản phảm:");
        return input.nextLine();
    }

    public String inputPrice() {
        System.out.println("Nhập giá sản phẩm:");
        return input.nextLine();
    }

    public static String inputAmount() {
        System.out.println("Nhập số lượng:");
        return input.nextLine();
    }

    public String inputManufacturers() {
        System.out.println("Nhập nhà sản xuất:");
        return input.nextLine();
    }

    public String inputPriceImport() {
        System.out.println("Nhập giá nhập khẩu");
        return input.nextLine();
    }

    public String inputProvinceImport() {
        System.out.println("Nhập tỉnh nhập khẩu:");
        return input.nextLine();
    }

    public String inputTaxImport() {
        System.out.println("Nhập thuế nhập khẩu:");
        return input.nextLine();
    }

    public String inputPriceExport() {
        System.out.println("Nhập giá xuất khẩu:");
        return input.nextLine();
    }

    public String inputNationalExport() {
        System.out.println("Nhập quốc gia xuất khẩu:");
        return input.nextLine();
    }
}
