package OnTap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriter {
    public static void writer(String pathFile, String line) {
        try {
            FileWriter writer = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> reader(String pathFile) {
        List<String[]> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line ;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] elementLine = line.split(",");
                list.add(elementLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void removeFile(String pathFile){
        try {
            FileWriter writer = new FileWriter(pathFile);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}