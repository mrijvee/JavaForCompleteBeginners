package tutorial11_multidimensionalarrays;

public class ThreeDimensionalArray {
    public static void main(String[] args) {

        int[][][] array3d = {{{1, -2, 3}, {2, 3, 4}}, {{-4, -5, 6, 9}, {1}, {2, 3}}};
        System.out.println(array3d[0][0][1]);
        System.out.println(array3d[0][1][1]);
        System.out.println(array3d[0][1][2]);
        System.out.println(array3d[1][0][1]); //will print -5 and we do [1][0][1] not [0][2][1] because it's a new curly brace
        System.out.println(array3d[1][0][2]); //keep track of the curly braces when doing 3d and upwards
        System.out.println(array3d[1][1][0]); //will print 1 from 2nd to last row. Once again, keep track of curly braces
        System.out.println(array3d[1][2][0]); //will print 2 from the last row
        System.out.println("break");
        for (int[][] array2D: array3d) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}