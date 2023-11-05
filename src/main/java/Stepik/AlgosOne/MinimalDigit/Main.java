package Stepik.AlgosOne.MinimalDigit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int getMin(List<String> list) {
        int min = Integer.MAX_VALUE;
        for (String value : list) {
            var x = value.split("");
            if (x[x.length-1].equals("3")) {
                int intVal = Integer.parseInt(value);
                if (intVal <= min) {
                    min = intVal;
                }
            }
        }


        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= count; i++) {
            String d = scanner.nextLine();
            list.add(d);
        }
        System.out.println(getMin(list));
    }
}
