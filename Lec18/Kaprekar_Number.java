package Lec18;

public class Kaprekar_Number {
    static boolean iskaprekar(int n)
    {
        if (n == 1)
            return true;

        // Count number of digits in square
        int sq_n = n * n;
        int count_digits = 0;
        while (sq_n != 0)
        {
            count_digits++;
            sq_n /= 10;
        }
        sq_n = n*n; // Recompute square as it was changed

        // Split the square at different points and see if sum
        // of any pair of splitted numbers is equal to n.
        for (int r_digits=1; r_digits<count_digits; r_digits++)
        {
            int eq_parts = (int) Math.pow(10, r_digits);

            // To avoid numbers like 10, 100, 1000 (These are not
            // Kaprekar numbers
            if (eq_parts == n)
                continue;

            // Find sum of current parts and compare with n
            int sum = sq_n/eq_parts + sq_n % eq_parts;
            if (sum == n)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        for (int i=1; i<10000; i++)
            if (iskaprekar(i)){
                System.out.println("True");
                System.out.print(i + " ");
            }

    }
}
