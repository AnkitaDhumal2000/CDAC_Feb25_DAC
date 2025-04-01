/* Project 2: Browser History using Doubly Linked List
Objective:
Implement a browser history system using a Doubly Linked List, where each node represents a web page. Users can move forward and backward in the browsing history, add new pages, and clear history.
Operations:
*Visit Page : Add a new page at the end of the history.
*Move Forward : Go to the next page.
*Move Backward : Go to the previous page.
*Clear History :Remove all pages from the history.
*Display Current Page : Show the current page.
Suggested Methods:
*visitPage(String url)
*moveForward()
*moveBackWard()
*clearHistory()
*displayCurrentPage()
Sample Input/Output:
1.Visit a page : 
*Input : URL : www.exmple.com
output :
Visites : www.example.com
2.Move Backward : 
output :
Move to previous page : www.previous.com */
 

import java.util.Scanner;

class BrowserHistory {
    Node current;
	
	static class Node{
	    String url;
		Node next, prev;
		
		Node(String url) {
			this.url = url;
			this.next = null;
			this.prev = null;
			
		}
	
	}
	
	void visitPage(String url) {
		Node newNode = new Node(url);
		if(current == null) {
			current = newNode;
		} else {
			current.next = newNode;
			newNode.prev = current;
			current = newNode;
		}
		System.out.println("Visted: " + url);
		
	}
	
	void moveForward() {
		if(current != null && current.next != null) {
			current = current.next;
			System.out.println("Moved forward to: " + current.url);
		} else {
			System.out.println("No forward history. ");
		}
		
	}
	
	void moveBackward(){
		if(current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Moved backward to: " + current.url);
		} else {
			System.out.println("No backward history. ");
		}
		
	}
		
	
	void displayCurrentPage() {
		if (current != null) {
			System.out.println("Current page: " + current.url);
		} else {
			 System.out.println("No history available.");
		}
	}
	
	void clearHistory(){
		current = null;
		System.out.println("History cleared,");
	}
	
	public static void main(String[] args){
		 BrowserHistory browser = new BrowserHistory();
		 browser.visitPage("www.example.com");
		 browser.visitPage("www.google.com");
		 browser.displayCurrentPage();
		 browser.moveBackward();
		 browser.displayCurrentPage();
		 browser.moveForward();
		 browser.displayCurrentPage();
		 browser.clearHistory();
		 browser.displayCurrentPage();
	}
	
}
	
/* Output : 

Visted: www.example.com
Visted: www.google.com
Current page: www.google.com
Moved backward to: www.example.com
Current page: www.example.com
Moved forward to: www.google.com
Current page: www.google.com
History cleared,
No history available.

*/	
