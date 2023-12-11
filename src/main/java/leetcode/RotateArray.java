package leetcode;

public class RotateArray {

    public void rotate(int[] nums, int k) { //stackOverFlow
        if (k == 0) {
            return;
        }

        int[] reversedArray = new int[nums.length];

        for(int x = 0; x <= nums.length-1; x++){
            reversedArray[(x+k) % nums.length ] = nums[x];
        }

    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
    }

}
