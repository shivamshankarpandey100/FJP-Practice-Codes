import java.util.*;
public class Main{
    public static void main(String[] args){
        Queue<Integer> queue=new ArrayDeque<>();

       queue.add(10);
       queue.add(20);
       queue.add(30);
       queue.add(40);
       System.out.println(queue.peek());
       queue.remove();
       System.out.println(queue.peek());
       queue.remove();
       System.out.println(queue.peek());
       queue.remove();
       System.out.println(queue.peek());
       queue.remove();
    }
}