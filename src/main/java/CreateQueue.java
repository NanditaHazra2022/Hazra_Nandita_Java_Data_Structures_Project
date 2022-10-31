/* Java program to demonstrate
 * implementation of Queue interface.
 * Queue is a linear data structure
 * that follows a particular order
 * in which the operations are performed.
 * The order is First In First Out(FIFO). */

//Importing required classes.
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

//Main class
public class CreateQueue
{   // Start of main class block.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Creating String queue using LinkedList.
        Queue<String> studentQueue = new LinkedList<>();

        // Bulk operation to add student names at one go.
        Collections.addAll(studentQueue, "Nisha", "Jyoti", "Nandita" );

        // Printing elements of the queue.
        System.out.println("Elements of student queue-> "
                + studentQueue);

    }   // End of execution thread.

}   // End of main class block.

