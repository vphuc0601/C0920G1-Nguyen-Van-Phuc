package IO.thuc_hanh;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

    }
    private static void copyFileUsingSteam(File source, File dest){
        InputStream is= null;
        OutputStream os= null;
        try{
            is= new FileInputStream(source);
            os= new FileOutputStream(dest);
            byte[] buffer= new byte[1024];
            int lenght;
            while ((lenght=is.read(buffer))>0){
                os.write(buffer,0,lenght);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter source file");
        String sourcePath= sc.nextLine();
        System.out.println("Enter destination file");
        String destPath= sc.nextLine();
        File sourceFile= new File(sourcePath);
        File destFile= new File(destPath);
        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            System.out.println("Copy completed");

        } catch (IOException e) {
            System.out.println("Can't copy this file");
            System.out.println(e.getMessage());
        }
    }
}
