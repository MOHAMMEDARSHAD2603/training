import java.util.*;
public class queues
{
    
	public static void main(String[] args) 
	{
	     Queue queue = new ArrayDeque();
	    queue.add(10);
	    queue.offer(20);
	    queue.offer(30);
	    queue.offer(40);
	    
	    System.out.println(queue);
	    System.out.println(queue.poll());
	    System.out.println(queue);
	}
}