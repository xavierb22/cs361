public class RecursionEvaluation {

    // Recursive factorial function
    public static int factorial(int n) {
        System.out.println("Entering factorial(" + n + ")");
        
        if (n <= 1) {
            System.out.println("Base case reached: factorial(" + n + ")");
            return 1;
        } else {
            int result = n * factorial(n - 1);
            System.out.println("Returning from factorial(" + n + ") with result: " + result);
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
    }
}