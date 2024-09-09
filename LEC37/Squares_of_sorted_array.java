package LEC37;

public class Squares_of_sorted_array {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int l = 0;
        int r = nums.length-1;

        int idx = nums.length-1;

        while(l <= r){
            int val1 = nums[l]*nums[l];
            int val2 = nums[r]*nums[r];

            if(val1 > val2){
                res[idx] = val1;
                l++;
            }else{
                res[idx] = val2;
                r--;
            }
            idx--;
        }
        return res;
    }
}
