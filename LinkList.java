/**
* This class creates a linked list that forms the back bone 
* of the Stack class. It has methods for inserting and deleting links.
* 
*
* @author Camille Copeland
* @version 3/15/2020
*/
public class LinkList {
	private CountryLink first;
	private CountryLink last;
	public LinkList() {
		first=null;
		last=null;
	}
	
	public boolean isEmpty() {
		return(first==null);
	}
	
	public void insertFirst(Country a) {
		CountryLink newLink = new CountryLink(a);
		
		if(isEmpty()) {
			last = newLink;
		}
		
		newLink.next = first; 
		first = newLink;
	}
	
	public void insertLast(Country a) {
		CountryLink newLink = new CountryLink(a);
		
		if(isEmpty()) {
			first = newLink;
		}
		else
			last.next = newLink;
		
		last = newLink;
	}
	
	public CountryLink deleteFirst() {
		CountryLink temp = first;
		if(first.next == null)
			last = null;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		CountryLink current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
}
