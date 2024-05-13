import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FindMaxLength {
    
    public static void wordLengthMax(){
        //        Находим самое длинное слово
                try{
                    File file = new File("input.txt");
                    Scanner scanner = new Scanner(file);
                    String LongestWord = "";
                   
                    while (scanner.hasNext()){
                        String word = scanner.next();
                        if (word.length() > LongestWord.length()) {
                            LongestWord = word;
        
                        }
                    }
                    System.out.println("Самое длинное слово - " + LongestWord + ". Его длина составляет:" + LongestWord.length());
        
                } catch (FileNotFoundException e) {
                    System.err.println("Файл не найден");
                }
            }
}
