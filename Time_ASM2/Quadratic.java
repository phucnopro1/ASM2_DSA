package Time_ASM2;
public class Quadratic {
    public static void findPairsWithSum(int[] arr, int targetSum) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 6, 5, 8, 3, 7 };
        int targetSum = 9;

        findPairsWithSum(arr, targetSum);
    }
}