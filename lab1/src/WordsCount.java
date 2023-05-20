import java.util.*;
import java.io.*;
import java.lang.*;

public class WordsCount {

    public static void main(String[] args) throws FileNotFoundException {

        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        Scanner txtFile = new Scanner(new File("C:\\Users\\user\\IdeaProjects\\lab1\\" +
                "\\test.txt"));
        while (txtFile.hasNext()) {
            String word = txtFile.next();
            if (map.containsKey(word)) {
                int count = map.get(word) + 1;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }
        txtFile.close();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}