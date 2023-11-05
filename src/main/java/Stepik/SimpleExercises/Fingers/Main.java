package Stepik.SimpleExercises.Fingers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int result = 0;

        if (N % 8 == 1 || N % 8 == 5) {
            result = N % 8;
        } else if (N % 8 == 2 || N % 8 == 0) {
            result = 2;
        } else if (N % 8 == 3 || N % 8 == 7) {
            result = 3;
        } else if (N % 8 == 4 || N % 8 == 6) {
            result = 4;
        }

        System.out.println(result);
    }
}
