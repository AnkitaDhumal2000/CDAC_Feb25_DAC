class DLL{
      Node head;

      static class class Node{
	       int data;
	       Node prev;
	       Node next;
	
	      Node(int d){
	            data = d;
	            prev = null;
	            next = null;
				
				Node(int d) {
					data = d;
					prev = null;
					next = null;
	      }
	}
	
	void insert (int new_data){
	         Node new_node = new Node(new_data);
	         new_node.next = head;
	         new_node.prev = null;
	         if(head != null)
	              head.prev = new_node;
		 
	         head = new_node;
	
	}
	
	
	void display(Node n){
	    Node p= null;
		
		System.out.println("Forward Traversal:");
		while(n ! = null)
		{
		    System.out.println(n.data="-->");
			p=n;
			n=n.next;
		}
		System.out.println();
		System.out.println("Backward traversal:");
		while(p != null)
		{
		     System.out.println(p.data+"-->");
			 p=p.prev;//backward
		}
		
	}
	
	void insertAfter(Node prev,int new_data){
		
		if(prev == null)
		{
			 Return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev.next;
		prev_node.prev = prev;
		new_node.next.prev = new_node;
		
	}
	
	     void append(int new_data){
			 
			 New New_node = new Node(new_data);
			 Node n = head;
			 new_node.next = null;
			 
			 //Empty Dll Next;
			 if(head == null){
				 new_node.prev = null;
				 head = new_node;
				 return;
			 }
			 while(n.next != null){
				 n=n.next;
			 }
			 n.next = new_node;
			 new_node.prev = n;
			 
		 }

    public static void main(String[] args) {
           Dll d1 = new DLL();
		   d1.head=null;
		   //d1.display(d1.head.next);
		   System.out.println();
		   d1.insert(30);
		   d1.insert(20);
		   d1.insert(10);
		//d1.display(d1.head.next);
		System.out.println();
		d1.insert(5);
		//d1.display(d1.head);
		System.out.println();
		d1.insertAfter(d1.head.next, 17);
		//d1.display(d1.head);
		
		d1.append(50);
		d1.display(d1.head);

   }
}   

/* 

class DLL {
    Node head; // Head of the doubly linked list

    // Node class for the doubly linked list
    static class Node {
        int data;
        Node prev;  // Pointer to the previous node
        Node next;  // Pointer to the next node

        // Constructor to create a new node
        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    // Function to insert a node at the beginning of the DLL
    void insert(int new_data) {
        Node new_node = new Node(new_data); // Create a new node
        new_node.next = head; // Make the new node point to the current head
        new_node.prev = null; // Since it's the first node, prev is null

        if (head != null) {
            head.prev = new_node; // Update the previous pointer of the existing head
        }

        head = new_node; // Update the head to be the new node
    }

    // Function to display the doubly linked list
    void display(Node n) {
        Node last = null;

        System.out.println("Forward Traversal:");
        while (n != null) {
            System.out.print(n.data + " <-> "); // Print the data
            last = n;
            n = n.next;
        }
        System.out.println("NULL");

        System.out.println("\nBackward Traversal:");
        while (last != null) {
            System.out.print(last.data + " <-> ");
            last = last.prev;
        }
        System.out.println("NULL");
    }

    // Function to insert after a given node
    void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be NULL");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        new_node.prev = prev_node;
        
        if (prev_node.next != null) {
            prev_node.next.prev = new_node;
        }

        prev_node.next = new_node;
    }

    // Function to append a new node at the end
    void append(int new_data) {
        Node new_node = new Node(new_data);
        Node last = head;

        new_node.next = null; // The last node will have next as NULL

        // If the DLL is empty, make the new node the head
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        // Traverse till the last node
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node; // Change the next of the last node
        new_node.prev = last; // Update the prev of the new node
    }

    public static void main(String[] args) {
        DLL d1 = new DLL();

        // Insert elements
        d1.insert(30);
        d1.insert(20);
        d1.insert(10);
        d1.insert(5);

        // Insert 17 after the second node
        d1.insertAfter(d1.head.next, 17);

        // Append 50 at the end
        d1.append(50);

        // Display the doubly linked list
        d1.display(d1.head);
    }
}


*/