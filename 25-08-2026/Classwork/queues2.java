import java.util.*;
public class queues2
{
    public static List<String> generateBinarayNumber(int n)
    {
        List<String> result = new ArrayList<>();
	    Queue<String> queue = new LinkedList<>();
	    queue.offer("1");
	    for(int i=0;i<n;i++)
	    {
	        String binary=queue.poll();
	        result.add(binary);// 10
	        
	        queue.offer(binary+"0");// 10
	        queue.offer(binary+"1");// 11
	    }
	    
	    return result;
    }
    
    
	public static void main(String[] args) 
	{
	    
	    System.out.println(generateBinarayNumber(5));
	    
	    
	     
	    
	}
}