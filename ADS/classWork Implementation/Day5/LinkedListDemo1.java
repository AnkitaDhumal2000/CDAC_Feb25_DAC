class LinkedListDemo1{

 Node start; // tart
 static class Node{
      int data; //data
      Node next;//next link
 
      Node(int d){
          data = d;
	      next = null;
	
	}
	
  }

public static void main(String[] args) {
     LinkedListDemo1 l1 = new LinkedListDemo1();
	 
	 l1.start = new Node(5); //pointing start tp l1
	 Node second = new Node(10);
	 Node third = new Node(20);
	 Node four = new Node(30);
	 
	 l1.start.next = second; 
	 second.next = third;
	 third.next = four;
   
   
   }
   
}