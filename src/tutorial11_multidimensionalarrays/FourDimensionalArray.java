package tutorial11_multidimensionalarrays;

public class FourDimensionalArray {

    public static void main(String[] args) {
        int[][][][] array4d = {{{{1, -2, 3}}, {{2, 3, 4}}}, {{{-4, -5, 6, 9}}, {{1}}, {{2, 3}}}};
        System.out.println(array4d[0][0][0][1]); //will print -2 from row 1
        System.out.println(array4d[0][1][0][0]); //will print 2 from row 2
        System.out.println(array4d[0][1][0][2]); //will print 4 from row 2
        System.out.println("break");
        for (int[][][] array3d: array4d) {
            for (int[][] array2d: array3d) {
                for (int[] array1d: array2d) {
                    for (int item: array1d) {
                        System.out.println(item);
                    }
                }
            }
        }
    }
}