package leetcode;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int count = removeDuplicates(nums);
        System.out.println(count);
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        int j = 1;

        for (int i = 1; i < nums.length; i++) {

            int aInCurrent = nums[i];
            int aInPrev = nums[i - 1];

            if (aInCurrent != aInPrev) {
                nums[j] = aInCurrent;
                j++;
            }

        }

        return j;
    }

}
