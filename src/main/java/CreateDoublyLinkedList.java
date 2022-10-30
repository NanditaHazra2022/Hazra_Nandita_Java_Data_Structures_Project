// Main class
public class CreateDoublyLinkedList
{   // Start of main class block.

    // Node class
    static class Node
    {   // Start of class Node block.
        String data;
        Node prev;
        Node next;

        // Constructor
        public Node(String data) {
            this.data = data;
        }
    }

    //Initialize head and tail for the doubly linked list
    Node head = null;
    Node tail = null;

    //Method to add a node into a list.
    public void addNewNode(String data)
    {   // Start of method to add a node.

        //Creating object of Node class.
        Node newNode = new Node(data);

        //Checking whether the doubly linked list is empty or not
        if(head == null)
        {   // Start of if block.

            // Defining head and tail of node.
            head = newNode;
            tail = newNode;

            //It is first node so prev will point to null
            head.prev = null;

        }   // End of if block.
        else
        {   // Start of else block.

            /* The newly created node
            * will be the last node,
            * so now tail's next will point
            * to that newly created node. */
            tail.next = newNode;

            /* The newly created node's previous
            * will point to tail. */
            newNode.prev = tail;

            /* The newly created node
            * will become new tail
            * because it is last node
            * in the doubly linked list. */
            tail = newNode;

            /* The newly created node
            * will be the last node,
            * so tail's next will be null. */
            tail.next = null;

        }   // End of else block.

    }   // End of method to add a node.

    //Method for displaying data of doubly linked list.
    public void showData()
    {   // Start of display data block.

        /* Initializing a new node
        * that will point to head
        * of doubly linked list. */
        Node current = head;

        // Checking whether the doubly linked list is empty or not
        if(head == null) {
            //Print a statement and pass the control flow into the main() method
            System.out.println("List is empty");
            return;
        }

        //Printing the data of doubly linked list.
        System.out.println("Nodes of doubly linked list: ");
        //Iterate the doubly linked list using while
        while(current != null) {
            /* Printing tha data
            * on that particular node
            * and then incrementing the pointer
            * for indicating next node. */
            System.out.print(current.data + "\n");
            current = current.next;
        }

    }   // End of display data block.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Creating object.
        CreateDoublyLinkedList cdll = new CreateDoublyLinkedList();

        //Adding nodes into the doubly linked list.
        cdll.addNewNode("New Delhi");
        cdll.addNewNode("Kolkata");
        cdll.addNewNode("Chennai");
        cdll.addNewNode("Mumbai");

        //Calling method for displaying doubly linked list data.
        cdll.showData();

    }   // End of execution thread.

}   // End of main class.