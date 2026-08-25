import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo1 {
    public static void main(String[] args)
    {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1.get(1));
        l1.set(1, 5);
        System.out.println(l1);
        l1.addAll(0, List.of(2,3,4,5));
        System.out.println(l1);
        l1.indexOf(2);
        l1.lastIndexOf(2);
        ListIterator<Integer> it =l1.listIterator(); 
        System.out.println("Printing list : -");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("Printing list in reverse : ");

        while(it.hasPrevious())
        {
            System.out.println(it.previous());
        }

        
    }    
}