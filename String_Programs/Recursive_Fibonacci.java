public class FibonacciNth {
    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases: if n is 0, return 0; if n is 1, return 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Recursive case: sum of the two preceding numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;  // Example: Find the 10th Fibonacci number
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
