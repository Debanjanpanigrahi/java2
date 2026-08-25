import java.util.function.Consumer;

public class lesson5 {
    public static void main(String[] args)
    {
        Consumer<String> printName =  System.out::println;
        Consumer<String> printUppercase = (name) ->  System.out.println(name.toUpperCase());
        Consumer<String> pipeline = printName.andThen(printUppercase);
        pipeline.accept("Accept");
    }
}

