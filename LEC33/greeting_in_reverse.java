package LEC33;

public class greeting_in_reverse {
    public static class ReverseGreeting implements Runnable {

        private String greeting;
        public ReverseGreeting(String greeting) {
            this.greeting = greeting;
        }
        private String reverseString(String str) {
            return new StringBuilder(str).reverse().toString();
        }

        @Override
        public void run() {
            System.out.println(reverseString(greeting));
        }
    }
        public static void main(String[] args) {
        String[] greetings = {"Hello", "Hi", "Welcome", "Good Morning", "Good Night"};
        for (String greeting : greetings) {
            Thread thread = new Thread(new ReverseGreeting(greeting));
            thread.start();
        }
    }
}
