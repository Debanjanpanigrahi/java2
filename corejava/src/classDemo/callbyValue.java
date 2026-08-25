class Demo{
    public static void main(String[] args)
    {
        /*call by value */
        int x=4;
        int y=5;
        System.out.println(x+" "+y);
        AddTen(x,y);
        System.out.println(x+" "+y);

        /*call by reference */
        Random r1 = new Random(x,y);
        System.out.println(r1.x+" "+r1.y);
        r1.AddTen(r1);
        System.out.println(r1.x+" "+r1.y);

        Random r2 = new Random(r1);
        System.out.println(r1.x+" "+r1.y);
        System.out.println(r2.x+" "+r2.y);
    }

    public static void AddTen(int x,int y)
    {
        x=x+10;
        y=y+10;
    }
}

class Random
{
    int x;
    int y;

    Random(int x,int y){
        this.x = x;
        this.y = y;
    }

    Random(Random r)
    {
        r.x = r.x +10;
        r.y = r.y +10;
    } 
    public static void AddTen(Random r)
    {
        r.x=r.x+10;
        r.y=r.y+10;
    }
}