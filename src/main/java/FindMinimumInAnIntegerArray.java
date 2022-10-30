/* Java program to find minimum
* in an integer Array.
* The array will be sorted
* using Arrays.sort method
* and the element
* at first index
* of the sorted array
* is the minimum.*/

// Importing required classes.
import java.util.Arrays;
import java.util.Scanner;

// Main class.
public class FindMinimumInAnIntegerArray
{   // Start of main class.

    // Starting point of execution.
    public static void main (String [] args)
    {   // Start of execution thread.

        // try-catch block for exception handling
        try {

            // Declaring object of Scanner class.
            Scanner input
                    = new Scanner(System.in);

            // Taking input of length of array.
            System.out.println(
                            "Input length of integer array-> "
                    );
            int lengthOfArray
                    = input.nextInt();

            /* Creating integer array
            * using for loop
            * and object of Scanner class
            * to take input
            * of elements
            * of integer array.*/
            int[] arr
                    = new int[lengthOfArray];
            // Taking inputs of integer array elements.
            for (int i = 0;
                 i < lengthOfArray;
                 i++)
            {   // Start of for loop.

                System.out.println(
                                "Input integer array element "
                                        + i
                                        + "-> "
                        );
                arr [i]
                        = input.nextInt();

            }   // End of for loop.

            /* Printing newly created array
            * using for each loop. */
            System.out.println(
                            '\n'
                            + "Newly created integer array-> "
                    );
            for (Object o: arr) {   // Start of for-each loop.
                System.out.print(
                                o + " "   // Elements will be printed space apart.
                        );
            }   // End of for-each loop.

            /* Calling method
            * to find minimum value
            * in the integer array. */
            findMinimum (arr);

        }
        catch (Exception e) {
            System.err.println (
                            "Caught InputMisMatchException: "
                                    + e.getMessage()
                    );
        }   // End of try-catch block.

    }   // End of execution thread.

    // Method to find minimum in integer array
    public static void findMinimum (int[] arr1)
    {   // Start of method block.

        // Sorting array.
        Arrays.sort(arr1);

        /* Printing the minimum value:
        * element at zeroth index
        * of sorted array. */
        System.out.println(
                    '\n'
                        + "Minimum value element of the integer array = "
                        + arr1 [0]
                );

        }   // End of method block.

}   // End of main class.
