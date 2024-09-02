package LEC34;

public class Subbaray_prod_less_thenk {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0 , left = 0 , pr = 1;
        if(k == 0)return 0;

        for(int i = 0;i < nums.length;i++){
            pr *= nums[i];

            while(pr >= k){
                if(left > i)return ans;
                pr /= nums[left];
                if(pr == 0)return 0;
                left++;
            }
            ans += i-left+1;
        }
        return ans;
    }
}
