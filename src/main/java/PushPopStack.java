/* Java program to demonstrate
 * stack implementation.
 * Following operations will
 * be performed:
 * 1. Push elements to create Stack.
 * 2. Pop elements from the stack. */

// Importing required class.
import java.util.Stack;

// Main class
public class PushPopStack
{   // Start of main class block.

    // Pushing element on the top of the stack.
    static void stackPush(Stack<Integer> stack)
    {   // Start of pushing elements block.

        // for loop to push 9 elements to the stack.
        for(int i = 1;
            i < 10;
            i++)
        {
            stack.push(i);  // In-built Java method
        }

    }   // End of pushing elements block.

    // Popping element from the top of the stack.
    static void stackPop(Stack<Integer> stack)
    {   // Start of popping elements block.

        // for loop to pop 4 elements from stack.
        for(int i = 1;
            i < 5;
            i++)
        {
            stack.pop();    // In-built Java method.
        }
    }

    // Starting point of execution.
    public static void main (String[] args)
    {   // Start of execution thread.

        // Declaring stack.
        Stack<Integer> stack = new Stack<>();

        // Adding elements to stack.
        stackPush(stack);
        System.out.println(
                "The stack after push operation: "
                        + stack
        );

        // Removing elements from stack.
        stackPop(stack);
        System.out.println(
                "The stack after pop operation of LIFO: "
                        + stack
        );

    }

}