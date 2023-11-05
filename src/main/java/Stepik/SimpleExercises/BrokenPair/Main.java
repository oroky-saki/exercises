package Stepik.SimpleExercises.BrokenPair;

import java.util.*;

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
        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size()-1) {
                System.out.println(numbers.get(i));
                break;
            }
            if (numbers.get(i) != numbers.get(i+1)) {
                System.out.println(numbers.get(i));
                break;
            }
            else {
                i++;
            }
        }
    }
}
