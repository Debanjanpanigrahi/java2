
public class Demo1 {
    public static void main(String[] args)
    {
        Box b1 = new Box(10);
        int number = (int)b1.getValue();
        System.out.println(number+10);

        BoxGenerics<Integer> b2= new BoxGenerics<>(number);
        System.out.println(b2.getValue()+5);

        Pair<String> pair1= new Pair<>("Debanjan", "Panigrahi");
        pair1.printName();

        ModifiedPair<Integer,String> pair2 = new ModifiedPair<>(2,"Debanjan");
        
    }
}

 class  Box {
    /*class of generic type */
    private Object value;

    Box(Object value)
    {
        this.value = value;
    }

    public Object getValue(){
        return this.value;
    }


}

class BoxGenerics<T>{

    private T value;

    BoxGenerics(T value)
    {
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public void  setValue(T value){
        this.value = value;
    }
}

class Pair<T>{
    T x;
    T y;

    Pair(T first,T second){
        this.x = first;
        this.y = second;
    }

    void printName(){
        System.out.println(x +" "+y);
    }
}

class ModifiedPair<T,U>{
    T first;
    U second;

    ModifiedPair(T first,U second)
    {
        this.first = first;
        this.second = second;
    }
}

