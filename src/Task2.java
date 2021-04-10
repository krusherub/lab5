import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

public class Task2 {
    public static String findWord(String path) throws IOException{
        try(BufferedReader read = new BufferedReader(new FileReader(path))){
            String str;
            String res = "";
            while((str = read.readLine()) != null){
                res += " " + str;
            }
            return findHelp(res);
        }
    }
    private static String findHelp(String str){
        String[] m = str.toLowerCase().split("\\s+");
        Arrays.sort(m);

        String maxWord = "", word = "";
        int maxCount = 0, count = 1;

        for (String s : m) {
            if (s.equals(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = s;
                count = 1;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            maxWord = word;
        }
        return maxWord;
    }
}
