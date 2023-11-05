package Stepik.Store.Steps;

import java.util.Scanner;

public class Main {

    public static int getSteps(int distance, int steps) {
        if (steps == 1) {
            return (distance == 0) ? 1 : 0;
        }

        int ways = 0;
        if (distance > 0) {
            ways += getSteps(distance - 1, steps - 1);
        }
        if (distance < steps - 1) {
            ways += getSteps(distance + 1, steps - 1);
        }
        return ways;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        var array = str.split(" ");
        int distance = Integer.parseInt(array[0]);
        int steps = Integer.parseInt(array[1]);
        System.out.println(getSteps(distance,steps));
    }
}
