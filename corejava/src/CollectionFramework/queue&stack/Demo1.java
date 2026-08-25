import java.util.ArrayDeque;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args)
    {
        Queue<Integer> queue = new ArrayDeque<>();
        //add
        queue.add(1);
        queue.offer(2);
        queue.offer(4);
        System.out.println(queue.peek());//return null
        System.out.println(queue.element());//return exception
        queue.remove();//throws exception
        queue.poll();//return null
        System.out.println(queue.peek());
        
    }    
}
