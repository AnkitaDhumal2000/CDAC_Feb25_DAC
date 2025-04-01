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
  
  // Menu Driven

import java.util.Scanner;

class BrowserHistoryMenu2{
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
		 BrowserHistoryMenu2 browser = new BrowserHistoryMenu2();
		 Scanner scanner = new Scanner(System.in);
		 int choice;
		 do{
			 System.out.println("\nBrowser History Menu: ");
			 System.out.println("1. Visit page ");
			 System.out.println("2. Move Backward");
			 System.out.println("3. Move Forward ");
			 System.out.println("4. Display Current Page ");
			 System.out.println("5. Clear History ");
			 System.out.println("6. Exit ");
			 System.out.println("Enter Your choice ");

			 
		 choice = scanner.nextInt();
		 scanner.nextLine();
		 
		 switch(choice){
			 case 1 :
			    System.out.print("Enter URL: ");
				String url = scanner.nextLine();
				browser.visitPage(url);
				break;
			case 2:
			   browser.moveBackward();
			   break;
			case 3 :
			   browser.moveForward();
			   break;
			case 4:
			   browser.displayCurrentPage();
			   break;
			case 5 :
			browser.clearHistory();
			   break;
			case 6:
			  System.out.println(" Exiting...");
			  break;
			default:
			  System.out.println("Invalid choice, try again.");  
	   }
	} while (choice != 6);
	scanner.close();
  }

}

/* OutPut :

Browser History Menu:
1. Visit page
2. Move Backward
3. Move Forward
4. Display Current Page
5. Clear History
6. Exit
Enter Your choice
1
Enter URL: Facebook
Visted: Facebook

Browser History Menu:
1. Visit page
2. Move Backward
3. Move Forward
4. Display Current Page
5. Clear History
6. Exit
Enter Your choice
4
Current page: Facebook

Browser History Menu:
1. Visit page
2. Move Backward
3. Move Forward
4. Display Current Page
5. Clear History
6. Exit
Enter Your choice
2
No backward history.

Browser History Menu:
1. Visit page
2. Move Backward
3. Move Forward
4. Display Current Page
5. Clear History
6. Exit
Enter Your choice
3
No forward history.

Browser History Menu:
1. Visit page
2. Move Backward
3. Move Forward
4. Display Current Page
5. Clear History
6. Exit
Enter Your choice
1
Enter URL: Instagram
Visted: Instagram

Browser History Menu:
1. Visit page
2. Move Backward
3. Move Forward
4. Display Current Page
5. Clear History
6. Exit
Enter Your choice
2
Moved backward to: Facebook

Browser History Menu:
1. Visit page
2. Move Backward
3. Move Forward
4. Display Current Page
5. Clear History
6. Exit
Enter Your choice
3
Moved forward to: Instagram

Browser History Menu:
1. Visit page
2. Move Backward
3. Move Forward
4. Display Current Page
5. Clear History
6. Exit
Enter Your choice
3
No forward history.

Browser History Menu:
1. Visit page
2. Move Backward
3. Move Forward
4. Display Current Page
5. Clear History
6. Exit
Enter Your choice
4
Current page: Instagram

Browser History Menu:
1. Visit page
2. Move Backward
3. Move Forward
4. Display Current Page
5. Clear History
6. Exit
Enter Your choice
5
History cleared,

Browser History Menu:
1. Visit page
2. Move Backward
3. Move Forward
4. Display Current Page
5. Clear History
6. Exit
Enter Your choice
4
No history available.

Browser History Menu:
1. Visit page
2. Move Backward
3. Move Forward
4. Display Current Page
5. Clear History
6. Exit
Enter Your choice
6
 Exiting...

*/
			   