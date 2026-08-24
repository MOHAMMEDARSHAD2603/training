import java.util.*;
public class Stacks1
{
	public static void main(String[] args) {
	    Stack<String> stack = new Stack<>();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Stack Basic Operations");
	    while(true)
	    {
	        System.out.println("\n1. push");
	        System.out.println("2. pop");
	        System.out.println("3. peek");
	        System.out.println("4. search");
	        System.out.println("5. Display");
	        System.out.println("6. size");
	        System.out.println("7. Exit");
	        System.out.print("Enter choice: ");
	        
	        int choice = sc.nextInt();
	        sc.nextLine(); // consume \n
	        switch(choice)
	        {
	            case 1: 
	                System.out.print("Enter element to push: ");
	                String element = sc.nextLine();
                    stack.push(element);
	                System.out.println("Pushed. Stack: " + stack);
	                break;
	                
	           case 2:
	               if(stack.isEmpty())
	                   System.out.println("Stack is empty");
	               else{
	                   String pop = stack.pop();
	                   System.out.println("Popped: "+pop);
	                   System.out.println("Stack: "+stack);
	               }
	               break;
	           case 3:
	               if(stack.isEmpty())
	                   System.out.println("Stack is empty");
	               else{
	                   String peek = stack.peek();
	                   System.out.println("Top value is: "+peek);
	               }
	               break;
	           case 4:
	               if(stack.isEmpty())
	                   System.out.println("Stack is empty");
	               else{
	                   System.out.print("Enter element to search: ");
	                   String str = sc.nextLine();
	                   int pos = stack.search(str);
	                   if(pos == -1)
	                       System.out.println(str + " is not found in stack");
	                   else
	                       System.out.println("Value "+str + " found at position "+ pos + " from top");
	               }
	               break;
	           case 5:
	               System.out.println("Stack: " + stack);
	               if(!stack.isEmpty())
	               {
	                   System.out.println("Top: "+stack.peek());
	                   System.out.println("Size: "+stack.size());
	               }
	               break;
	           case 6:
                   System.out.println("Size of the Stack: " + stack.size());
                   System.out.println("Stack: " + stack);
	               break;
	               
	           case 7:
	               System.out.println("Final Stack: " + stack);
	               sc.close();
	               return;
	               
	           default :
	               System.out.println("Enter the value between 1 - 7");
	        }
	    }
	}
}