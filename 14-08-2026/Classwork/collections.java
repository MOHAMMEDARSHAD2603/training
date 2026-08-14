import java.util.*;
public class collections
{
	public static void main(String[] args) {
	    
		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		System.out.println("Before list : "+ num);
		
		Collections.rotate(num,2);
		System.out.println("Right Rotated list : "+ num);
		Collections.rotate(num,-4);
		
		System.out.println("Left Rotated list : "+ num);
		
	}
}