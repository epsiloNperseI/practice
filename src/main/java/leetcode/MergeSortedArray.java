package leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        MergeSortedArray mergeSortedArray = new MergeSortedArray();

        int[] nums1 = {1,2,3,0,0};
        int[] nums2 = {2,5};


        mergeSortedArray.merge(nums1, 3, nums2, 2);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int indexMerged = m + n - 1;

        // Объединяем, начиная с конца nums1
        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] > nums2[index2]) {
                nums1[indexMerged] = nums1[index1];
                index1--;
            } else {
                nums1[indexMerged] = nums2[index2];
                index2--;
            }
            indexMerged--;
        }

        while (index2 >= 0) {
            nums1[indexMerged] = nums2[index2];
            index2--;
            indexMerged--;
        }

    }

    private static void shiftRight(int[] arr, int startIndex, int valueForFirst) {
        if (arr == null || arr.length < 2 || startIndex < 0 || startIndex >= arr.length) {
            return; // Проверка на корректность входных данных
        }

        for (int i = arr.length - 2; i >= startIndex; i--) {
            arr[i + 1] = arr[i];
        }
        arr[startIndex] = valueForFirst;
    }


}
