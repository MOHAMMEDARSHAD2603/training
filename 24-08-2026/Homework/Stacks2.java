import java.util.*;
public class Stacks2 {
    public static void main(String[] args) {
        String a[] = new String[3];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            System.out.println("Enter the element to push into stack:");
            a[i] = sc.nextLine();
        }

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<3;i++) {
            String str = a[i];
            // push this string's chars
            for(int j=0;j<str.length();j++) {
                stack.push(str.charAt(j));
            }
            System.out.println("\nOriginal: " + str);
            System.out.println("Stack for this: " + stack);

            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            System.out.println("Reversed: " + sb.toString());
        }
        sc.close();
    }
}