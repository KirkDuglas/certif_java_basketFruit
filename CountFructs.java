import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class CountFructs { 
    public static void CountFructs(){
        try{
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            Map<String, Integer> freqWord = new TreeMap<>();


            while (scanner.hasNext()){
                String word = scanner.next();
                freqWord.put(word, freqWord.getOrDefault(word, 0) + 1);

            }
            System.out.println("В Вашей корзине лежит:");
            freqWord.forEach((word, frequency) -> System.out.println( word + " - " + frequency + " шт."));
        }
        catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        }
    }
    
}
