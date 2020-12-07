package IO.bai_tap;

import java.io.*;

public class Reader_Writer {
    public static void main(String[] args) {
        try {
            BufferedReader fileCopy = new BufferedReader(new FileReader("src/Phuc2.txt"));
            BufferedWriter filePaste = new BufferedWriter(new FileWriter("src/Phuc1.txt"));
            String line = null;
            System.out.println("Tep da ton tai");
            while ((line = fileCopy.readLine()) != null){
                filePaste.write(line);
                filePaste.newLine();
            }
            filePaste.close();
            fileCopy.close();
        } catch (FileNotFoundException e) {
            System.out.println("Tep khong ton tai");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



//    FileReader file1;
//
//    {
//        try {
//            file1 = new FileReader("Phuc2.txt");
//            BufferedReader fileCopy = new BufferedReader(file1);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }















}
