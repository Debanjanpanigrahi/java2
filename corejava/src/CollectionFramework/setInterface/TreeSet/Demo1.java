
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args)
    {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(80);
        set.add(23);
        set.add(10);
        set.add(90);
        set.add(50);

        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println("HeadSet : "+set.headSet(80));//returns smaller elements
        System.out.println("TailSet : "+set.tailSet(70));//return larger elements from element is inclusive
        //from element inclusive toElement exclusive
        System.out.println(set.subSet(10, 20));

        //navigable set
        

        
    }
}
