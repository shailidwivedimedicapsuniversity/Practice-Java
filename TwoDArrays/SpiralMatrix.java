package TwoDArrays;

public class SpiralMatrix {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top row (left to right)
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right column (top to bottom)
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Bottom row (right to left)
            if (startRow < endRow) { // To avoid double printing in the same row
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // Left column (bottom to top)
            if (startCol < endCol) { // To avoid double printing in the same column
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            // Move to the next inner layer
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}, 
            {13, 14, 15, 16}
        };
        printSpiral(matrix);
    }
}
