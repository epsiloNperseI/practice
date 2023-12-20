package leetcode.sort;

import java.util.List;
import java.util.stream.IntStream;

public class MaximizeSum {


    public int largestSumAfterKNegations(int[] nums, int k) {
        shellSort(nums);
        int min = Integer.MAX_VALUE;
        int indexOfMin = 0;
        for (int i = 0; k != 0; i++) {
            if (i >= nums.length) {
                int arraySize = nums.length;
                if (k % 2 != 0) {
                    if (min > nums[arraySize - 1]) {
                        nums[0] = -nums[0];
                    } else {
                        nums[indexOfMin] = -nums[indexOfMin];
                    }
                }
                break;
            } else {
                if (nums[i] < 0) {
                    nums[i] = -nums[i];
                    if (nums[i] < min) {
                        min = nums[i];
                        indexOfMin = i;
                    }
                    k--;
                } else if (nums[i] == 0) {
                    break;
                } else if (nums[i] > 0) {
                    if (k % 2 != 0) {
                        int findMinimum = 0;
                        int minimumValueIndex = i;

                        while (findMinimum < i) {
                            if (nums[findMinimum] < nums[i]) {
                                minimumValueIndex = findMinimum;
                            }
                            findMinimum++;
                        }

                        nums[minimumValueIndex] = -nums[minimumValueIndex];
                        if (nums[minimumValueIndex] < min) {
                            min = nums[minimumValueIndex];
                            indexOfMin = minimumValueIndex;
                        }
                    }
                    break;
                }
            }
        }

        System.out.println(List.of(nums));
        return IntStream.of(nums).sum();
    }

    public void shellSort(int[] array) {
        int n = array.length;


        for (int interval = n / 2; interval > 0; interval /= 2) {

            for (int i = interval; i < n; i++) {

                int temp = array[i];

                int j;


                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];

                }


                array[j] = temp;
            }
        }
    }

//    1005. Maximize Sum Of Array After K Negations
//    Given an integer array nums and an integer k, modify the array in the following way:
//
//    choose an index i and replace nums[i] with -nums[i].
//    You should apply this process exactly k times. You may choose the same index i multiple times.
//
//    Return the largest possible sum of the array after modifying it in this way.
//
//            Example 1:
//
//    Input: nums = [4,2,3], k = 1
//    Output: 5
//    Explanation: Choose index 1 and nums becomes [4,-2,3].

//    Example 2:
//    Input: nums = [3,-1,0,2], k = 3
//    Output: 6
//    Explanation: Choose indices (1, 2, 2) and nums becomes [3,1,0,2].
//    Example 3:
//
//    Input: nums = [2,-3,-1,5,-4], k = 2
//    Output: 13
//    Explanation: Choose indices (1, 4) and nums becomes [2,3,-1,5,4].
}
