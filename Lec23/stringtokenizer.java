package Lec23;

import java.util.StringTokenizer;

public class stringtokenizer {
    public static void main(String[] args) {
        String input = "Alice,Bob,Charlie,David";

        StringTokenizer tokenizer = new StringTokenizer(input, ",");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
