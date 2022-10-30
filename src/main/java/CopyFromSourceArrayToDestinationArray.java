/* Java program to demonstrate
* usage of Java in-built function: arraycopy.
* This function will start copying
* from initial position (as specified) of the source array
* to the point as specified by the length.
* It will paste the copied elements
* in the destination array
* from the initial position (as specified). */

// Main class.
public class CopyFromSourceArrayToDestinationArray
{   // Start of main class block.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Creating a source array.
        char[] srcArr = { 'G', 'a', 'r', 'b', 'a', 'g', 'e',
                'K', 'n', 'o', 'w', 'l', 'e', 'd', 'g', 'e',
                'W', 'a', 'r'} ;

        // Printing the source array.
        System.out.println(
                "Source array-> "
        );
        System.out.println(String.valueOf(srcArr));

        // Creating a destination array.
        char[] destArr = new char[9];

        /* Copying from source array
         * to destination array
         * using System.arraycopy() method.
         */
        System.arraycopy(srcArr, 7,
                destArr, 0, 9);

        // Printing the destination array.
        System.out.println(
                "Destination array after copy operation from source array-> "
        );
        System.out.println(String.valueOf(destArr));

    }   // End of execution thread.

}   // End of main class block.