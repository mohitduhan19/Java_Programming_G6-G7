package Lec7;

import java.util.Arrays;

public class upper_bound {
    static void upper_bound(int arr[], int key)
    {
        int upperBound = 0;

        while (upperBound < arr.length) {
            if (arr[upperBound] <= key)
                upperBound++;

            else{
                System.out.print("The upper bound of " + key + " is " + arr[upperBound] + " at index " + upperBound);
                return;
            }
        }
        System.out.print("The upper bound of " + key + " does not exist.");
    }

    public static void main(String[] args) {
        int array[] = { 10, 20, 30, 30, 40, 50 };
        int key = 30;
        Arrays.sort(array);

        upper_bound(array, key);
    }
}
