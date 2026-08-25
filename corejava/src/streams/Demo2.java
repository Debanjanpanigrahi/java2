
import java.util.ArrayList;
import java.util.List;

public class Demo2 {

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(List.of(4,6,11,78,3,7));
        list.stream()
            .filter(x -> x > 10)
            .map(x -> x + 2)
            .forEach(System.out::println);

        // List<List<Integer>> list2 = List.of(List.of(1,2),List.of(3,4));
        // list2.stream()
        //     .map(element -> element.stream()
        //     .map(x -> x*2))
        //     .toList()
        //     .forEach(System.out::print); 
        
        List<List<Integer>> list2 = List.of(
    List.of(1, 2),
    List.of(3, 4)
);

list2.stream()
     .map(element ->
         element.stream()
                .map(x -> x * 2)
                .toList()
     )
     .toList()
     .forEach(System.out::println);
    }
    
}
