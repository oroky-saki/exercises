package Stepik.Collections.LongPrefix;

import java.util.Scanner;

public class Main {

    public static int findLongPrefix(String s) {
        var words = s.split(" ");
        String prefix = words[0];
        for (int i = 0; i < words.length; i++) {
            while (!words[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return 0;
            }
        }

        return prefix.length();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(findLongPrefix(string));
    }
}
