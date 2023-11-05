package Stepik.AlgosOne.AnyEven;

import java.util.Scanner;

public class Main {

    public static String getAnyEven(String str) {

        var digits = str.split(" ");
        for (String digit : digits) {
            if (Integer.parseInt(digit) % 2 == 0)
                return digit;
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.nextLine();
        System.out.println(getAnyEven(digits));
    }
}
