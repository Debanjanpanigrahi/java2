public class finalDemo{
    public static void main(String[] args)
    {
        Random r1 = new Random();
        r1.PI=7.12;
        System.out.println(r1.PI);

        final int x;
        x=7;
        System.out.println(x);
    }
}

class Random{
    final double PI;

    Random(){
        this.PI = 3.14;
    }
}