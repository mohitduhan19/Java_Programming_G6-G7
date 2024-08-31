package Lec7;

import java.util.Arrays;

public class lower_bound {
    static int lower(int array[], int key)
    {
        int lowerBound = 0;
        while (lowerBound < array.length) {
            if (key > array[lowerBound])
                lowerBound++;
            else
                return lowerBound;
        }

        return lowerBound;
    }
    public static void main(String[] args) {
        int array[] = { 4, 6, 10, 12, 18, 18, 20, 20, 30, 45 };
        int key = 18;
        Arrays.sort(array);
        System.out.println(lower(array, key));
    }
}
