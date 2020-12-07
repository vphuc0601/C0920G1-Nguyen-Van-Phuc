package IO.bai_tap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadNational {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader("src/IO/National.csv"));
        String line=null;
        while ((line=file.readLine()) != null ){
            String[] write = line.split(",");
            System.out.println(Arrays.toString(write));
        }
        file.close();

    }
}
