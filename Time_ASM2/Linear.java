package Time_ASM2;

public class Linear {
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The array is empty or null.");
        }
        int maxElement = array[0]; // Initialize maxElement with the first element of the array

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i]; // Update maxElement if a larger element is found
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 7, 1, 8, 6, 2, 4};
        int maxElement = findMax(array);
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}

