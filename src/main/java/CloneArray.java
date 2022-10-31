/* Java program to demonstrate
* cloning of array.
* This program will use
* Java in-built method: clone(). */

// Main class.
public class CloneArray
{   // Start of main class block.

    // Starting point of execution.
    public static void main (String[] args)
    {   // Start of execution thread.

        // Creating single dimensional array.
        int[] arr = {1,
                2,
                3,
                4,
                5};

        // Printing the created array.
        System.out.println(
                "Array: "
        );
        // for each loop for printing array
        for (int i: arr) {
            System.out.print(i + " ");  // Elements will be printed space apart.
        }

        /* Cloning an array using
        * Java in-built method: clone() */
        int[] cloneArray = arr.clone();

        // Printing the cloned array.
        System.out.println(
                '\n'
                + "Cloned array: "
        );
        // for each loop for printing cloned array
        for(int i: cloneArray) {
            System.out.print(i + " ");  // Elements will be printed space apart.
        }

    }   // End of execution thread.

}   // End of main class block.


