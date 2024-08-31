package Lec10;

public class Majority_Element {
    public static int getval(int[] nums){
        int val = nums[0] , count = 1;
        for(int i = 1; i < nums.length;i++){
            if(nums[i] == val){
                count++;
            }else count--;
            if(count== 0){
                count = 1;
                val = nums[i];
            }
        }
        return val;
    }
    public static int majorityElement(int[] nums) {
        if(nums.length == 0)return 0;
        int temp = getval(nums);
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == temp)count++;
        }
        if(count > nums.length/2)return temp;
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = { 2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
