import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;
public class lesson3 {
    public static void main(String[] args)
    {
        /*returns a value for each element */
        Function<Integer,Integer> square = x-> x * x;
        System.out.println(square.apply(5));

        /*does not return a value for each element */
        Consumer<Integer> print = x ->System.out.println(x);
        print.accept(5);

        /*oposite of consumer */
        Supplier<Integer> randValue = () -> ThreadLocalRandom.current().nextInt(0, 9);;
        System.out.println(randValue.get());

        Predicate<Integer> isEven = (number) -> number % 2 == 0 ? true : false;
        System.out.println(isEven.test(7));

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 67, 8, 9, 0));

        list.forEach(num -> System.out.println(num));
        list.forEach(System.out::println);

        Function<Integer,Integer> equation = x ->((x*2)+3);
        equation.apply(5);

        Function <Integer,Integer> add2 = x -> x + 2;
        Function <Integer,Integer> multiply3 = x -> x * 3;
        int a = add2.apply(2);
        int b = multiply3.apply(a);
        System.out.println(b);
        System.out.println(add2.andThen(multiply3).apply(2));

        Predicate<Integer> isGreater = x -> x > 100;
        Predicate<Integer> isEvenNum = number -> number % 2 == 0;
        System.out.println(isGreater.and(isEvenNum).test(56));

    }    
}
