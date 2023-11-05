package Stepik.Collections.Vote;

import java.util.*;

public class Main {

    public static String vote(String str) {
        var digits = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String s : digits) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int newValue = map.get(s);
                map.put(s, newValue+1);
            }
        }
        String maxKey = "";
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.nextLine();
        System.out.println(vote(digits));
    }
}
