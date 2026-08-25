

public class lesson2 {
    public static void main(String[] args)
    {
        // Addition add = new Addition();
        // int result = add.calculate(3, 4);
        // System.out.println(result);
        print(3,4,(a,b)->a+b);
        calculator c = (a,b)->a+b;
        print(3,4,c);
    }   

    public static void print(int a,int b,calculator c)
    {
        System.out.println(c.calculate(a, b));
    }

}

@FunctionalInterface
interface calculator{
    int calculate(int a,int b);
} 

// class Addition implements calculator{
//     @Override
//     public int calculate(int a,int b)
//     {
//         return a+b;
//     }
// }