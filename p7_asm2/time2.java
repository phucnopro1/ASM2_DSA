package p7_asm2;

public class time2 {
    public static void someAlgorithm() {
        // The algorithm implementation
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        someAlgorithm(); // Call the algorithm you want to measure here
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;
        System.out.println("Time taken by the algorithm: " + executionTime + " nanoseconds");
    }
}