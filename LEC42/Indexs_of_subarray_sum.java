package LEC42;
import java.util.*;
public class Indexs_of_subarray_sum {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here
        int start=0,end=0;
        int sum=0;
        boolean flag = false;
        ArrayList<Integer> ans=new ArrayList<>();
        while(end<n){
            sum=sum+arr[end];

            while(sum>s && start<end){


                sum=sum-arr[start];
                start++;
            }

            if(sum==s){
                ans.add(start+1); ans.add(end+1);
                flag = true;
                break;
            }
            end++;
        }
        if(flag == false){
            ans.add(-1);
        }
        return ans;
    }
}
