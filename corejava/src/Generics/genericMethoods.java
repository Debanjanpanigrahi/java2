package Generics;

public class genericMethoods {
    public static void main(String[] args)
    {
        int IntRes = (int)getResult(5);
        System.out.println(IntRes);
    }

    public static Object getResult(Object obj)
    {
        return obj;
    }

    public static <T> T getRes(T x)
    {
        return x;
    }
    public static <T,U> int getRes(T x,U y)
    {
        return (Integer.parseInt(x+" "+y));
    }
}

class Box <T extends Number>{
    T value;

    public void printDouble(){
        System.out.println(value.doubleValue());
    }
}
