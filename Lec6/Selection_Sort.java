package Lec6;

import java.util.Scanner;

public class Selection_Sort {
    public  static  void selectionsort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static boolean isSmaller(int[] nums , int i , int j){
        if(nums[i] <= nums[j])return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {5 , 2 , 1 , 7};
        selectionsort(nums);

        for (int i = 0;i < nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
