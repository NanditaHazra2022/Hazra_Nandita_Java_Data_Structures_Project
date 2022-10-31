/* Java program to demonstrate
* operation on binary search tree.
* This program will find
* the diameter of binary search tree.
* The diameter of a binary search tree
* is the number of nodes
* on the longest path
* between two leaves in the tree. */

// Main class.
public class FindDiameterOfBinarySearchTree
{   // Start of main class block.

    // Class to build the binary tree.
    static class Node
    {
        int data;
        Node left, right;   // Reference variable.

    }

    static class A
    {
        int ans = Integer.MIN_VALUE;
    }

    // Method to find height of the binary tree.
    static int height(Node root, A a)
    {
        if (root == null)
            return 0;

        int left_height = height(root.left, a);

        int right_height = height(root.right, a);

        // update the answer, because diameter of a
        // tree is nothing but maximum value of
        // (left_height + right_height + 1) for each node
        a.ans = Math.max(a.ans, 1 + left_height +
                right_height);

        return 1 + Math.max(left_height, right_height);
    }

    /* Computes the diameter of binary
    tree with given root. */
    static int diameter(Node root)
    {
        if (root == null)
            return 0;

        // This will store the final answer
        A a = new A();
        height(root, a);
        return a.ans;
    }

    // Constructor of Node class.
    static Node objNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;

        return (node);
    }

    // Starting point of execution
    public static void main(String[] args)
    {   // Start of execution thread.

        // Building binary tree.
        Node root = objNode(100);
        root.left = objNode(70);
        root.right = objNode(180);
        root.left.left = objNode(40);
        root.left.right = objNode(80);
        root.left.right.right = objNode(90);
        root.right.left = objNode(140);
        root.right.right = objNode(200);
        root.right.right.right = objNode(240);

        // Printing diameter of binary tree on console.
        System.out.println(
                "Diameter of binary tree = "
                        + diameter(root)
        );

    }   // End of execution thread.

}   // End of main class block.
