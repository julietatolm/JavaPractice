package lesson_10_05_arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int[][] arr2 = {{1, 2, 3},{3, 4, 6}, {7, 8, 9}};

        //printArray(arr2);

        int[][][] arr1 = new int[2][2][2];
        arr1[0][0][0] = 1;

        int[][][] arr3 = {{{1, 2},{3, 4}} ,{{7, 8},{9, 10}}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.println("arr[" + i + "][" + j + "][" + k + "] = " + arr3[i][j][k]);
                }
            }
        }
    }

    private static void printArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
