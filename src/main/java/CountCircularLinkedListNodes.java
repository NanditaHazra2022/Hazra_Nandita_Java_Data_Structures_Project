/* Java program to demonstrate
* circular linked list.
* The circular linked list
* is a linked list,
* where the first node
* and the last node
* are connected
* to each other
* which forms a circle. */

// Main class.
public class CountCircularLinkedListNodes
{   // Start of main class block.

    // Node class.
    static public class Node
    {   // Start of Node class block.
        int data;
        Node next;  // Reference variable

        // Constructor.
        public Node(int data) {
            this.data = data;
        }

    }   // End of Node class block.

    public int count;

    //Declaring head and tail pointer as null.
    public Node head = null;
    public Node tail = null;

    //This function will add the new node at the end of the list.
    public void add(int data){
        //Create new node
        Node newNode = new Node(data);
        //Checks if the list is empty.
        if(head == null) {
            //If list is empty, both head and tail would point to new node.
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            //tail will point to new node.
            tail.next = newNode;
            //New node will become new tail.
            tail = newNode;
            //Since, it is circular linked list tail will point to head.
            tail.next = head;
        }
    }

    //This function will count the nodes of circular linked list
    public void countNodes() {
        Node current = head;
        do{
            //Increment the count variable by 1 for each node
            count++;
            current = current.next;
        }while(current != head);
        System.out.println(
                "Count of nodes present in circular linked list: "
                        + count
        );
    }

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Creating object of circular linked list.
        CountCircularLinkedListNodes ccll
                = new CountCircularLinkedListNodes();

        // Adding elements to circular linked list.
        ccll.add(1);
        ccll.add(2);
        ccll.add(3);
        ccll.add(4);
        ccll.add(5);
        ccll.add(6);

        //Counting the number of nodes present in the list.
        ccll.countNodes();

    }   // End of execution thread.

}   // End of main class block.