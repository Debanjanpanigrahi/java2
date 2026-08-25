

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class collectionInterface {
    public static void main(String[] args)
    {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        int n = c.size();
        System.out.println(c.size());
        System.out.println(c.isEmpty()); 
        Iterator<Integer> it = c.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        Integer[] arr = c.toArray(new Integer[0]);
        for(int ele : arr)
        {
            System.out.println(ele);
        }

        boolean b = c.add(100);
        System.out.println(b);

        c.addAll(List.of(5,6,7,8,9));
        System.out.println(c);
    }
}
