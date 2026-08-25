public class Demo{
    public static void main(String args[])
    {
        //Autoboxing
        int x=10;
        Integer y = x;

        System.out.println("x : "+x);
        System.out.println("y : "+y.intValue());

        //unboxing
        Integer a =  Integer.valueOf(1000);
        Integer b =  Integer.valueOf(1000);
        if(a == b){
            System.out.println("a and b are refering to the same object references");
        }
        else{
            System.out.println("a and b are not refering to the same object references");
        }

        if(a.intValue() == b.intValue()){
            System.out.println("values are same");
        }
        System.out.println(a);
        System.out.println(b);
    }
}