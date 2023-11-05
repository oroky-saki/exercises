package Stepik.AlgosOne.HuntingResult;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // 334555
    // 231435
    public static String encodeHuntingResult(String str) {
        String result = "";
        var array = str.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String digit : array) {
            if (!map.containsKey(digit)) {
                map.put(digit, 1);
            } else {
                int val = map.get(digit);
                map.put(digit, val+1);
            }
        }
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            result += entry.getValue() + entry.getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        System.out.println(encodeHuntingResult(result));
    }
}
