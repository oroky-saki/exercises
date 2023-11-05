package wordsBinarySearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

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
            BufferedReader reader = new BufferedReader(new FileReader("D:\\GitHub Repos\\!EXERCISES\\Exercises\\src\\main\\java\\wordsBinarySearch\\words_utf.txt", StandardCharsets.UTF_8));
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


    public static int binarySearch(String[] array, String t) {
        int count = 0;
        int left = 0;
        int right = array.length - 1;
        String target = new String(t.getBytes(),StandardCharsets.UTF_8);
        List<String> list = Arrays.asList(array);
        //Collections.sort(list);
        while (left <= right) {
            count++;
            int mid = left + (right - left) / 2;

            int comparisonResult = target.toLowerCase().compareTo(array[mid].toLowerCase());

            if (comparisonResult == 0) {
                System.out.println(count);
                return mid;
            } else if (comparisonResult < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(count);
        return -1; // Слово не найдено
    }

    public static int interpolSearch(String[] array, String t) {
        int count = 0;
        int left = 0;
        int right = array.length - 2;
        String target = new String(t.getBytes(), StandardCharsets.UTF_8).toLowerCase();

        while (left <= right) {
            // Используем интерполяцию для оценки ожидаемой позиции
            //System.out.println(array[right-1]);
            double ratio = (double)(target.hashCode() - array[left].toLowerCase().hashCode()) / (array[right].toLowerCase().hashCode() - array[left].toLowerCase().hashCode());
            int pos = (int)(left + ratio * (right - left));

            if (pos < left || pos > right) {
                break; // Выход, если оценка выходит за границы массива
            }

            int comparisonResult = target.compareTo(array[pos].toLowerCase());

            if (comparisonResult == 0) {
                System.out.println(count);
                return pos;
            } else if (comparisonResult < 0) {
                right = pos - 1;
            } else {
                left = pos + 1;
            }
        }
        System.out.println(count);
        return -1; // Слово не найдено
    }

    public static void main(String[] args) {

/*        List<String> words = new ArrayList<>(List.of("ящик", "абак", "ящерица", "кукуруза", "комарик", "киоск", "як", "яхта", "змееящерица"));

        for (String word : words) {
            int res = binarySearch(createListOfWords(), word);
            if (res > -1)
                System.out.println("Искомое слово " + word + " находится на позиции: " + res);
            else
                System.out.println("Искомое " + word + " слово отсутствует!");

        }*/

        String word  = "комарик";
        int res = binarySearch(createListOfWords(), word);
        if (res > -1)
            System.out.println("Искомое слово " + word + " находится на позиции: " + res);
        else
            System.out.println("Искомое " + word + " слово отсутствует!");

        System.out.println();

        int res2 = interpolSearch(createListOfWords(), word);
        if (res2 > -1)
            System.out.println("Искомое слово " + word + " находится на позиции: " + res2);
        else
            System.out.println("Искомое " + word + " слово отсутствует!");

    }
}
