package wordsBinarySearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BanirySearchWords {

    /*
        Найти данные слова в файле words_utf.txt
        ящик
        абак
        ящерица
        кукуруза
        комарик
        киоск
        як
        яхта
    */

    public static String[] createListOfWords() {
        List<String> list = new ArrayList<>();
        String[] array = new String[list.size()+1];
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/wordsBinarySearch/words_utf.txt"));
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                line = reader.readLine();
                list.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list.toArray(array);
    }


    public static int binarySearch(String[] array, String target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int comparisonResult = target.toLowerCase().compareTo(array[mid].toLowerCase());

            if (comparisonResult == 0) {
                return mid;
            } else if (comparisonResult < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1; // Слово не найдено
    }

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(List.of("ящик", "абак", "ящерица", "кукуруза", "комарик", "киоск", "як", "яхта"));

        for (String word : words) {
            int res = binarySearch(createListOfWords(), word);
            if (res > -1)
                System.out.println("Искомое слово " + word + " находится на позиции: " + res);
            else
                System.out.println("Искомое " + word + " слово отсутствует!");

        }



    }
}
