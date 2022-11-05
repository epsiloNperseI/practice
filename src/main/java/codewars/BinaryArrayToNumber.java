package codewars;

//Given an array of ones and zeroes, convert the equivalent binary value to an integer.
//        Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

import java.util.List;

public class BinaryArrayToNumber {
    public static int сonvertBinaryArrayToInt(List<Integer> binary) { // 1,1,1,1

        StringBuilder binaryString = new StringBuilder();
        for (Integer integer: binary) {
            binaryString.append(integer);
        }
        return Integer.parseInt(binaryString.toString(),2);
    }
}