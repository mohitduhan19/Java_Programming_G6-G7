package LEC8;

public class Maximum_subaaray_circular {
    public static int  kaden(int[] nums) {
        int cs = nums[0] , os = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(cs + nums[i] > nums[i]){
                cs = cs + nums[i];
            }else cs = nums[i];
            os = Math.max(os , cs);
        }
        return os;
    }

    public static int maxSubarraySumCircular(int[] nums) {
        if(nums.length == 0)return 0;
        int linearSum = kaden(nums);
        int totalSum = 0;

        for(int i = 0;i  < nums.length;i++){
            totalSum += nums[i];
            nums[i] *= -1;
        }

        int invertedSum = kaden(nums);
        if(totalSum + invertedSum == 0)return linearSum;
        return Math.max(linearSum , totalSum + invertedSum);
    }
    public static void main(String[] args) {
        int[] nums = {1,-2,3,-2};
        System.out.println(maxSubarraySumCircular(nums));
    }
}
