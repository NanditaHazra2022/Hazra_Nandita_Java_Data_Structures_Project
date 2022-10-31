/* Java program to demonstrate
* circular doubly linked list.
* The circular doubly linked list
* can be traversed from head to tail
* or tail to head.
* Going from head to tail
* or tail to head is efficient
* and has time complexity of O(1). */

// Main class.
public class IterateCircularDoublyLinkList
{   // Start of main class block.

    // Node class
    static class Node{
        int data;
        Node next;  // Reference variable
        Node prev;  // Reference variable
    };

    static Node head;   // Reference variable

    // Method to add node in the circular doubly linked list
    static void addNode(int value)
    {   // Start of add node method block.

        // List is empty so create a single node
        if (head == null) {
            Node new_node = new Node();
            new_node.data = value;
            new_node.next = new_node.prev = new_node;
            head = new_node;
            return;
        }

        // find last node in the list if list is not empty
        Node last = (head).prev;    //previous of head is the last node

        // create a new node  
        Node new_node = new Node();
        new_node.data = value;

        // next of new_node will point to head since list is circular  
        new_node.next = head;

        // similarly previous of head will be new_node
        (head).prev = new_node;

        // change new_node=>prev to last  
        new_node.prev = last;

        // Make new node next of old last  
        last.next = new_node;

    }   // End of add node method block.

    // Method to iterate and print nodes
    static void printNodes()
    {   // Start of print node(s) method block.

        Node temp = head;   // Reference variable

        //Iterating in forward direction starting from head
        System.out.println(
                "Forward iteration of circular doubly linked list-> "
        );
        while (temp.next != head)
        {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("%d ", temp.data);

        // Iterating in backward direction starting from last node
        System.out.println(
                '\n' +
                "Backward iteration of circular doubly linked list-> "
        );
        Node last = head.prev;
        temp = last;
        while (temp.prev != last)
        {
            System.out.printf("%d ", temp.data);
            temp = temp.prev;
        }
        System.out.printf("%d ", temp.data);

    }   // End of print node(s) block

    public static void main(String[] args)
    {
        //the empty list 
        Node l_list = null;

        // add nodes to the list  
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);

        //print the list

        printNodes();
    }
}  