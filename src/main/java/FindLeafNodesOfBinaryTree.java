/* Java program to demonstrate
* operation on binary tree.
* This program will find
* leaf nodes of binary tree. */

// Main class.
public class FindLeafNodesOfBinaryTree
{   // Start of main class block.

    // Node class.
    static class Node
    {
        public int data;
        public Node left, right;    // Reference variable.

    };

    /* Method to print leaf
    * nodes from left to right. */
    static void printLeafNodes(Node root)
    {   // Start of method block.

        // If node is null, return
        if (root == null)
            return;

        // If node is leaf node, print its data
        if (root.left == null &&
                root.right == null)
        {
            System.out.print(root.data + " ");
            return;
        }

        /* If left child exists
        * then check for leaf node
        * recursively. */
        if (root.left != null) {
            printLeafNodes(root.left);
        }

        /* If right child exists
         * then check for leaf node
         * recursively. */
        if (root.right != null) {
            printLeafNodes(root.right);
        }

    }   // End of method block.

    // Method to create a new tree node.
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Creating binary tree.
        Node root = newNode(100);   // Root node.
        root.left = newNode(40);    // Internal node.
        root.right = newNode(120);  // Internal node.
        root.left.left = newNode(25);   // Leaf node.
        root.right.left = newNode(110);  // Internal node.
        root.right.right = newNode(160);  // Internal node.
        root.right.left.left = newNode(105);   // Leaf node.
        root.right.left.right = newNode(115);   // Leaf node.
        root.right.right.left = newNode(145);   // Leaf node.
        root.right.right.right = newNode(195);   // Leaf node.

        // Printing leaf nodes of the binary tree.
        System.out.println(
                "Leaf node(s) of binary tree: "
        );
        printLeafNodes(root);

    }   // End of execution thread.

}   // End of main block.
