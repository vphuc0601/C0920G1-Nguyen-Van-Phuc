package CollectionFrameWork.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student("Kien", 30, "HT");
        Student student2=new Student("Phuc", 32, "DN");
        Student student3= new Student("Hieu", 30, "QN");
        Student student4=new Student("Hung", 18, "QTr");
        List<Student> list= new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for (Student st:list) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator= new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : list){
            System.out.println(st.toString());
        }
    }
}
