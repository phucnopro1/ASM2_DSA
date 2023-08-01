package Space_ASM2;

public class Quadratic {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i * j;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] resultMatrix = generateMatrix(n);

        System.out.println("Generated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
