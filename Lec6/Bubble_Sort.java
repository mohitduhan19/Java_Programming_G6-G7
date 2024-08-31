package Lec6;

import java.util.Scanner;

public class Bubble_Sort {
    public static void bubblesort(int[] nums){
        for(int itr = 1;itr<= nums.length-1;itr++){
            for(int j = 0;j < nums.length-itr;j++){
                if(isSmaller(nums , j+ 1 , j)){
                  int temp = nums[j+1];
                  nums[j+1] = nums[j];
                  nums[j] = temp;
                }
            }
        }
    }
    public static boolean isSmaller(int[] nums , int i , int j){
        if(nums[i] <= nums[j])return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {3 , 2 ,4 ,1};
        bubblesort(nums);
        for(int i = 0;i < nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}
