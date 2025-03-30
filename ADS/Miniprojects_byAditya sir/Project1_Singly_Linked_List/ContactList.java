/* Project 1:
Project 1: Contact List using Singly Linked List 
Objective:
Build a contact list using a Singly Linked List, where each node represents a contact with a name and phone number.
Operations:
Add Contact: Add a contact at the beginning or end of the list.
Remove Contact: Remove a contact by name.
Search Contact: Search for a contact by name.
Display Contacts: Display all contacts in the list.
Suggested Methods:
* addContact(String name, String phone)
* removeContact(String name)
*searchContact(String name)
*displayContacts()
 
Sample Input/Output:
1.Add a Contact:
*Input:
Name: Aditya Kansana
Phone: 9425760166
*Output:
Contact added : Aditya Kansana, 9425760166

2.Dispaly Contacts:
Output:
Contact List:
Aditya Kansana, 9425760166 */

class ContactList{
 
    Node start;
	
	static class Node{
	
	   String name,phoneNumber;
	   Node next;
	   
	   Node(String name, String phoneNumber) {
		   this.name = name;
		   this.phoneNumber = phoneNumber;
		   this.next = null;
		   
	   }
	
	}

    void addContact(String name, String phoneNumber){
         Node newNode= new Node(name, phoneNumber);
		 if(start == null) {
			 start = newNode;
		 }
		 else{
			 Node temp = start;
			 while(temp.next != null){
				 temp = temp.next;
			 }
			 temp.next = newNode;
			 
		 }
		   System.out.println("Contact added: " + name + ", " + phoneNumber);
	}
	
    void removeContact(String name) {
		if(start ==null) {
			System.out.println("List is empty");
			return;
		}
		
		if(start.name.equals(name)) {
			start = start.next;
			System.out.println("Contact removed: " + name);
			return;
		}
		Node temp = start;
		while(temp.next !=null){
			if(temp.next.name.equals(name)){
				temp.next=temp.next.next;
				System.out.println("Contact removed: " + name);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Contact not found");
		
	}
		
		
	
    boolean searchContact(String name) {
	     Node temp = start;
		 while(temp != null) {
			 if(temp.name.equals(name)) {
				 System.out.println("Contact found: " + temp.name + ", " + temp.phoneNumber);
				 return true;
			 }
			 temp = temp.next;
		 }
		System.out.println("Contact not found");
		return false;
		
	}
				 
	void displayContacts() {
		if(start == null){
			System.out.println("contact List is empty");
			return;
		}
		
		System.out.println("Conatct List:");
		Node temp = start;
		while(temp != null) {
			System.out.println(temp.name+ ", " +temp.phoneNumber);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
	    ContactList contactList = new ContactList();
		
        contactList.addContact("Aditya Kansana", "9425760166");

        contactList.displayContacts();

        System.out.println("\nSearching for Aditya Kansana:");
        contactList.searchContact("Aditya Kansana");

        System.out.println("\nRemoving Aditya Kansana:");
        contactList.removeContact("Aditya Kansana");

        contactList.displayContacts();
		
	}
	
}


/* OutPut :

Contact added: Aditya Kansana, 9425760166
Conatct List:
Aditya Kansana, 9425760166

Searching for Aditya Kansana:
Contact found: Aditya Kansana, 9425760166

Removing Aditya Kansana:
Contact removed: Aditya Kansana
contact List is empty

*/

		
				 
 
