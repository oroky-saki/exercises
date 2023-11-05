package Stepik.SimpleExercises.CommonPoint;

import java.util.Scanner;

public class Main {

    public boolean checkCommonPoint(int x1, int y1, int r1, int x2, int y2, int r2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        boolean res = distance <= r1 + r2 && distance >= Math.abs(r1-r2);

        if (res)
            System.out.println("True");
        else
            System.out.println("False");

        if (res) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты центра и радиус первой окружности:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int r1 = scanner.nextInt();

        System.out.println("Введите координаты центра и радиус второй окружности:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int r2 = scanner.nextInt();

        Main m = new Main();
        boolean res = m.checkCommonPoint(x1,y1,r1,x2,y2,r2);

/*        if (res)
            System.out.println("True");
        else
            System.out.println("False");*/
    }
}
