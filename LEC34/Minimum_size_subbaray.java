package LEC34;

public class Minimum_size_subbaray {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE , left = 0 , sum = 0 , temp = 0;

        for(int i= 0;i < nums.length;i++)temp += nums[i];
        if(temp < target)return 0;

        for(int i = 0;i < nums.length;i++){
            sum += nums[i];

            while(sum >= target){
                len = Math.min(len , i-left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return len;
    }
}
