package Stepik.Store.Fibb;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<Integer, Long> cache = new HashMap<>();

    public static long getValueOfNumberFibb(int number) {

        if (cache.containsKey(number))
            return cache.get(number);

        if (number <= 1)
            return number;
        else {
            long res = getValueOfNumberFibb(number-1) + getValueOfNumberFibb(number-2);
            cache.put(number, res);
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(getValueOfNumberFibb(number));
    }
}
