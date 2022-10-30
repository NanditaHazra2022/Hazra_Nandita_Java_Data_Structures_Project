/* Java program to demonstrate
* boundary traversal of binary tree.
* The boundary includes the path
* from the root to the left-most node,
* leaf nodes and the path from
* the right-most node to the root. */

// Main class.
class BoundaryTraversalOfBinaryTree
{   // Start of main class block.

    // Node class.
    static class Node {
        public int data;
        public Node left, right;    // Reference variable.
    }

    // Method to print leaf nodes of a binary tree.
    void printLeaves(Node node)
    {   // Start of print leaf nodes method block.

        if (node == null) {
            return;
        }

        printLeaves(node.left);

        if (node.left == null
                && node.right == null) {
            System.out.print(node.data + " ");
        }

        printLeaves(node.right);

    }   // End of print leaf nodes method block.

    // Method to print all left boundary nodes, except a leaf node.
    void printBoundaryLeft(Node node)
    {   // Start of left boundary path block.

        if (node == null) {
            return;
        }

        if (node.left != null) {
            System.out.print(node.data + " ");
            printBoundaryLeft(node.left);
        }
        else if (node.right != null) {
            System.out.print(node.data + " ");
            printBoundaryLeft(node.right);
        }

    }   // End of left boundary path block.

    // Method to print all right boundary nodes, except a leaf node
    void printBoundaryRight(Node node)
    {   // Start of right boundary path block.

        if (node == null) {
            return;
        }

        if (node.right != null) {
            printBoundaryRight(node.right);
            System.out.print(node.data + " ");
        }
        else if (node.left != null) {
            printBoundaryRight(node.left);
            System.out.print(node.data + " ");
        }

    }   // End of right boundary path block.

    // Method to do boundary traversal of a given binary tree
    void printBoundary(Node node)
    {   // Start of boundary traversal method.

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");

        // Printing the left boundary.
        printBoundaryLeft(node.left);

        // Printing all leaf nodes.
        printLeaves(node.left);
        printLeaves(node.right);

        // Printing the right boundary.
        printBoundaryRight(node.right);

    }   // End of boundary traversal method.

    // Method to create a new tree node.
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    Node root; // Reference variable

    // Starting point of execution.
    public static void main(String args[])
    {   // Start of execution thread.

        // Creating binary tree.
        BoundaryTraversalOfBinaryTree tree = new BoundaryTraversalOfBinaryTree();
        tree.root = newNode(1000);    // Root node, therefore at boundary
        tree.root.left = newNode(400);  // Internal node at boundary
        tree.root.left.left = newNode(100);   // Leaf node, therefore at boundary
        tree.root.left.right = newNode(600);;  // Internal node not at boundary
        tree.root.left.right.left = newNode(500);   // Leaf node, therefore at boundary
        tree.root.left.right.right = newNode(900);   // Leaf node, therefore at boundary
        tree.root.right = newNode(1700);;  // Internal node at boundary
        tree.root.right.left = newNode(1500);;  // Internal node not at boundary
        tree.root.right.left.left = newNode(1100);   // Leaf node, therefore at boundary
        tree.root.right.right = newNode(2200);   // Leaf node, therefore at boundary

        System.out.println(
                "Boundary traversal of binary tree-> "
        );
        tree.printBoundary(tree.root);

    }   // End of execution thread.

}   // End of main class block.