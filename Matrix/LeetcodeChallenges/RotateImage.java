//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/

public class RotateImage {
    public static void main(String args[]) {
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        printMatrix(array);

        int[][] output = rotateImage(array);
        printMatrix(output);

        rotateImageInPlace(array);
        printMatrix(array);
    }

    //Rotate with additional array
    public static int[][] rotateImage(int[][] matrix) {
        int len = matrix.length;
        if (matrix.length == matrix[0].length) {
            int[][] output = new int[len][len];
            for (int i = 0, k = len - 1; i < len; i++, k--) {
                for (int j = 0; j < len; j++) {
                    output[j][k] = matrix[i][j];
                }
            }
            return output;
        }
        return matrix;
    }

    //Rotate in-place
    public static void rotateImageInPlace(int[][] matrix) {
        int len = matrix.length;
        //Transpose matrix
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        //swap first and last columns of the matrix using two pointers
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][len -1 - j];
                matrix[i][len - 1 - j] = tmp;
            }
        }
    }

    static void printMatrix(int[][] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
