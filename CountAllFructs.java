import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CountAllFructs {
    public static void CountAllFructs() {
            try{
                File file = new File("input.txt");
                Scanner scanner = new Scanner(file);
                int countWord = 0;
    
                while (scanner.hasNext()){
                    scanner.next();
                    countWord++;
                }
                System.out.println("В Вашей корзине лежит " + countWord + " фруктов." );
            } catch (FileNotFoundException e){
                System.err.println("Файл не найден");
            }
    
        }
   }