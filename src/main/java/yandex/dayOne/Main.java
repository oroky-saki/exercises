package yandex.dayOne;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split(" ");
        int x = Integer.parseInt(array[0]);
        int y = Integer.parseInt(array[1]);
        int z = Integer.parseInt(array[2]);
        int res = (x*4) + (4*x*y*2) - (4*y*z) + (z*4);
        System.out.println(res);
    }
}
