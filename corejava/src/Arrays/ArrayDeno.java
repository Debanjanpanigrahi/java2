package Arrays;

public class ArrayDeno {
    public static void main(String[] args) {
        int[] rollNumbers=new int[3];
        int num=101;

        for(int index=0;index<rollNumbers.length;index++){
            rollNumbers[index]=num;
            num++;
        }

        for(int index = 0 ; index < rollNumbers.length;index++){
            System.out.println(rollNumbers[index]);
        }
    }
}
