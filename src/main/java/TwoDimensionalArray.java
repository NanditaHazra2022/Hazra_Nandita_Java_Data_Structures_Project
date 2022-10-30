/* Java program to demonstrate
* two-dimensional array. */

// Main class.
public class TwoDimensionalArray
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of main thread.

        // Creating two-dimensional array.
        int[][] arr = {
                { 1, 2 },
                { 3, 4 }
        };

        /* Printing two-dimensional array
        * using nested for loop.
        * Note: Time complexity
        * for nested for loop
        * is O(n*n). */
        for (int i = 0;
             i < 2;
             i++)
        {   // Start of for loop 1.
            for (int j = 0;
                 j < 2;
                 j++)
            {   // Start of for loop 2.
                System.out.println
                        (
                                "arr[" + i + "][" + j + "] = "
                                + arr[i][j]
                        );
            }   // End of for loop 1.
        }   // End of for loop 2.

    }   // End of execution thread.

}   // End of main class.
