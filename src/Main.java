import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.printf(Task2.findWord("C:\\Users\\user\\Desktop\\LAB5.txt"));
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
