import java.util.*;
 public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the element to push into stack:");
        for (int i = 0; i < 5; i++) {
            String element = sc.nextLine();
            stack.push(element);
        }
        System.out.println("\nElements in stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Elements after pop: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
        sc.close();
    }
}