package algorithms;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static final Map<Character, Integer> romanMap = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000
    );

    public int romanToInt(String s) {

        int result = 0;
        int current = 0;
        int next = 0;

        String [] array = s.split("");
        int [] resultArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            current = romanMap.get(array[i]);
            if (i < s.length() - 1) {

                next = romanMap.get(array[i + 1]);
                if (current < next) {
                    resultArray[i] = -current;
                } else {
                    resultArray[i] = current;
                }
            } else {
                resultArray[i] = current;

            }

        }


        for (int i : resultArray) {
            result += i;
        }
        System.out.println(result);

        return result;
    }

    public int romanToIntByGpt(String s) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));
            int next = 0;
            if (i < s.length() - 1) {
                next = romanMap.get(s.charAt(i + 1));
            }

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }


}
