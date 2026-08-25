import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args)
    {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Aditya");
        map.put(102,"sourav");
        System.out.println(map.keySet());
        System.out.println(map.values());
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        System.out.println(entries);
        map.replace(101, "Arindam");
    }    
}
