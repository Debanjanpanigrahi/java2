import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        List<Integer> result = list.stream()
            .map(x -> x+2)
            .toList();

       // result.add(34);
        System.out.println(result);    
        List<Integer> result2 = list.stream()
            .map(x -> x+2)
            .collect(Collectors.toList());   
        result2.add(34);
        System.out.println(result2);
    }    
}
