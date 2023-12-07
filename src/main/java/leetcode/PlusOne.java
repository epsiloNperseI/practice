package leetcode;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) { //решение GPT
        int n = digits.length;

        for(int i = n - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }


}
