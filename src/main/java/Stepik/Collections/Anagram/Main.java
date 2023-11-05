package Stepik.Collections.Anagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static int isAnagram(String s1, String s2) {

        var listS1 = Arrays.asList(s1.split(""));
        var listS2 = Arrays.asList(s2.split(""));
        Collections.sort(listS1);
        Collections.sort(listS2);
        for (int i = 0; i < listS1.size(); i++) {
            if (!listS1.get(i).equals(listS2.get(i))) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(isAnagram(s1, s2));
    }
}
