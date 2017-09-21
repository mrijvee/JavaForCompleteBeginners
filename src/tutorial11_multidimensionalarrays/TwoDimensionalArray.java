package tutorial11_multidimensionalarrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[] values = {3, 5, 2343}; //1d array
        System.out.println(values[2]);
        int[][] grid = { //2d array
                {3, 5, 2343}, //row1.......column1 = 3, 5, 2343
                {2, 4},       //row2.......column2 = 2, 4
                {1, 2, 3, 4} //row3........column3 = 1, 2, 3, 4
        };
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);
        System.out.println(grid[2][0]);
        String[][] texts = {{"Is... where "}, {"anyone... is "}, {"there?... everyone? "}};
        for (int row = 0; row < texts.length; row++) {
            for (int col = 0; col < texts[row].length; col++  ) {
                System.out.println(texts[row][col]);
            }
            String[][] words = new String[2][];
            System.out.println(" " + words[0]);
        }
        String[][] words1 = new String[2][0];
        words1[0] = new String[3];
        words1[0][1] = "Hi there, ";
        words1[0][2] = "what's up?";
        System.out.print(words1[0][1]);
        System.out.print(words1[0][2]);
    }
}
