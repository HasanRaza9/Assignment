import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("Mango");
        stack.push("Apple");
        stack.push("Orange");
        stack.push("PineApple");
        stack.push("Guava");
        stack.push("Lahore");
        stack.push("Dehli");
        stack.push("Karachi");
        stack.push("Gujranwala");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push('A');
        stack.push('G');

        System.out.println("The stack is "+stack);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("After removing five elements "+stack);
        System.out.println("Peek element "+stack.peek());
        stack.pop();
        stack.pop();
        System.out.println("After removing two elements "+stack);

        System.out.println("Stack poll is "+stack.pop());
        System.out.println("Stack poll is "+stack.pop());
        System.out.println("The stack top "+stack.peek());

        System.out.println("Stack is "+stack);
        System.out.println("Index of Apple "+stack.search("Apple"));
        System.out.println("Index of dehli "+stack.search("Dehli"));

    }
}
