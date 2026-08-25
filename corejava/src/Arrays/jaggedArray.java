package Arrays;

public class jaggedArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0]=new int [3];
        arr[1]=new int[4];
        arr[2]=new int[5];

        int x=101;

        /*storing data in array*/
        for (int row = 0; row < arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = x;
                x++;
            }
        }

        /*Displaying array element*/

        for(int row = 0 ; row < arr.length;row++){
            for(int col = 0 ;col<arr[row].length;col++){
                System.out.print(arr[row][col]+"\t");
            }
            System.out.printf("\n");
        }

    }
}
