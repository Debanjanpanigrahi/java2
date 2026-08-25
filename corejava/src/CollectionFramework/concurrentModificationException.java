package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class concurrentModificationException {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
        {
            int value = it.next();
            if(value == 3){
                list.remove(value);//concurrent modification exception
            }

            System.out.println(value);
        }
    } 
}