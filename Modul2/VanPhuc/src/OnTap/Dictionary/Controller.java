package OnTap.Dictionary;

import CaseStudy.Controllers.ReadWritter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public static List<Word> wordList=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    private static String inputPronoun(){
        System.out.println("Enter pronoun:");
        return sc.nextLine();
    }
    private static String inputNoun(){
        System.out.println("Enter noun:");
        return inputNoun();
    }
    private static String inputAdjective(){
        System.out.println("Enter adjective:");
        return inputAdjective();
    }
    private static String inputVerb(){
        System.out.println("Enter verb:");
        return inputVerb();
    }
    private static String inputSynonymous(){
        return inputSynonymous();
    }
    public static void addWord(){
        Word word=new Word(inputPronoun(), inputNoun(), inputAdjective(), inputVerb(),inputSynonymous());
        wordList.add(word);
        ReadWritter.writeFile("src/OnTap/Dictionary/dictionary.csv",wordList.toString());
    }
    public static void searchWord(){
        ReadWritter.readFileCustomer("src/OnTap/Dictionary/dictionary.csv");
        System.out.println("Enter name:");
        String name=sc.nextLine();
        for (Word word:wordList) {
            if(name.equals(word.getNoun())){
                System.out.println(word.toString());
            }else {
                System.out.println("Word invalid");
            }
        }
    }
    public static void editWord(){
        ReadWritter.readFileCustomer("src/OnTap/Dictionary/dictionary.csv");
        System.out.println("Enter word edit:");
        String name=sc.nextLine();
        for (Word word:wordList) {
            if(name.equals(word.getNoun())){
                Word word1= new Word(inputPronoun(), inputNoun(), inputAdjective(), inputVerb(),inputSynonymous());
                wordList.add(word1);
            }
            System.out.println(wordList);
        }
    }
    public static void deleteWord(){
        ReadWritter.readFileCustomer("src/OnTap/Dictionary/dictionary.csv");
        System.out.println("Enter word delete:");
        String name=sc.nextLine();
        wordList.removeIf(word -> name.equals(word.getNoun()));
    }
}
