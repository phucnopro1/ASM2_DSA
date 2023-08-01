package Space_ASM2;

public class Linear {
    public static int[] findFibonacciNumbers(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] fibonacciNumbers = findFibonacciNumbers(n);

        System.out.println("First " + n + " Fibonacci numbers:");
        for (int number : fibonacciNumbers) {
            System.out.print(number + " ");
        }
    }
}
