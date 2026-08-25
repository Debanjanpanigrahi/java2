

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(100);
        Set<Integer> set3 = new HashSet<>(100,0.75f);
        Set<Integer> set4 = new LinkedHashSet<>(List.of(1,2,3,4,5,6,7,8,9));
                
        
    }
}
