package OnTap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UltilReadWrite {


    public static List<ImportProduct> readProductImport()  {
        File file = new File("src/OnTap/ImportProduct.csv");
        List<ImportProduct> list = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            String[] arr;
            ImportProduct importProduct;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");

                importProduct = new ImportProduct(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                list.add(importProduct);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
    public static void writeProductImport(List<ImportProduct> list, boolean check){

        try {
            File file = new File("src/OnTap/ImportProduct.csv");
            FileWriter writer = new FileWriter(file,check);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            String line=null;
            for (ImportProduct importProduct: list) {
                line= importProduct.getId()+","+importProduct.getSerialProduct()+","+importProduct.getName()+","+importProduct.getPrice()+","+
                        importProduct.getManufacturers()+","+importProduct.getPriceImport()+","+importProduct.getProvinceImport()+","+
                        importProduct.getAmount()+","+importProduct.getTaxImport();
                bufferedWriter.write(line);
            }

            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void showListImportProduct(){
        List<ImportProduct> list= readProductImport();
        for (int i= 0; i<list.size();i++){
            System.out.println((i+1)+"."+list.get(i));
        }
    }
}
