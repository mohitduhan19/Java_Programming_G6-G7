package Lec7;

import java.util.Scanner;

public class Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        int cs = nums[0] , os = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(cs + nums[i] > nums[i]){
                cs = cs + nums[i];
            }else cs = nums[i];
            os = Math.max(os , cs);
        }
        return os;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
