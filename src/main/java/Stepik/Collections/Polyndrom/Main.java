package Stepik.Collections.Polyndrom;

import java.util.Scanner;

public class Main {

    public static int check(String digits) {
        var x = digits.split(" ");
        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(x[x.length-i-1])) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.nextLine();
        System.out.println(check(digits));
    }
}
