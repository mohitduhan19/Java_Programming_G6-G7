package Lec28;

public class product_except_self {
    public void productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }
        int[] suff = new int[nums.length];

        suff[suff.length - 1] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i];
        }

        int[] ans = new int[nums.length];

        ans[0] = suff[1];
        ans[ans.length - 1] = prefix[ans.length - 2];

        for (int i = 1; i < nums.length - 1; i++) {
            ans[i] = prefix[i - 1] * suff[i + 1];
        }

    }
}
