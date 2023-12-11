package leetcode;

public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k = 1;
        int count = 1;
        for(int i= 1; i < n; i++) {

            if(nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
                count=1;
            }

            else if(count < 2) {
                nums[k] = nums[i];
                k++;
                count++;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int k = removeDuplicates(nums);
        System.out.println(k);
    }
}
