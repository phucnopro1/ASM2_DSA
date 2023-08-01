package p7_asm2;

public class Space {
    public static void someAlgorithm() {
        // The algorithm implementation
    }

    public static void main(String[] args) {
        long initialMemory = Runtime.getRuntime().totalMemory();
        someAlgorithm(); // Call the algorithm you want to measure here
        long finalMemory = Runtime.getRuntime().totalMemory();

        long spaceUsed = finalMemory - initialMemory;
        System.out.println("Space used by the algorithm: " + spaceUsed + " bytes");
    }
}
