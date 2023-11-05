package Stepik.SimpleExercises.ExcessDigit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] stringNumbers = str.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String s :
                stringNumbers) {
            numbers.add(Integer.parseInt(s));
        }

        int sum = numbers
                .stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum - 5050);
    }
}
