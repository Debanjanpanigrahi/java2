package Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
            int[][] marks = new int[3][3];
            int x=101;
            for (int row = 0; row < marks.length;row++){
                for(int col=0;col<marks[row].length;col++){
                    marks[row][col] = x;
                    x++;
                }
            }

            for(int row = 0 ; row < marks.length;row++){
                for(int col = 0 ;col<marks[row].length;col++){
                    System.out.print(marks[row][col]+"\t");
                }
                System.out.printf("\n");
            }
    }
}
