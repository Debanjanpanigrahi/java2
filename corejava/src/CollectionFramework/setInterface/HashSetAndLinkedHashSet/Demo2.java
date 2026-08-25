import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(80);
        set.add(23);
        set.add(10);
        set.add(20);
        set.add(50);

        System.out.print(set);
        System.out.println("set.first ->"+set.first());
        System.out.println("set.last -> "+set.last());
        /*strictly lesser than the element passed */
        System.out.println("set.headset -> "+set.headSet(80));
        /*from element inclusive */
        System.out.println("set.tailSet"+set.tailSet(80));
        /*from element inclusive and to Element exclusive */
        System.out.println(set.subSet(23, 80));
        System.out.println(set.lower(10));
        System.out.println(set.floor(10));
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.print(set);
        Iterator<Integer> it=set.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("set.headSet(): "+set.headSet(80,true));
    }    
}
