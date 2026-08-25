public class Demo {
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.fun();
    }
}

class Outer{
    int x = 10;

    class Inner{
        int x = 20;
        void fun(){
            System.out.print(x);
            System.out.print(Outer.this.x);
        }
    }
}