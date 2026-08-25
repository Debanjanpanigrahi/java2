import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args)
    {
    	System.out.print("Hello World");      
    	List<Integer> list = new ArrayList<>(List.of(5,12,7,14));

        Stream<Integer> s = list.stream();
        s.filter(x -> x > 10)
        .map(x -> x+10)
        .forEach(System.out::println);
    }    
}