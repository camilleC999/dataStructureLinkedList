/**
* This class creates a double linked list that forms the back bone 
* of the Queue class. It has methods for inserting and deleting links.
* 
*
* @author Camille Copeland
* @version 3/15/2020
*/
public class DLinkList {
	public DoubleLink first;
	public DoubleLink last;
	public DLinkList() {
		first=null;
		last=null;
	}
	
	public boolean isEmpty() {
		return(first==null);
	}
	
	public void insertFirst(Country a) {
		DoubleLink newLink = new DoubleLink(a);
		
		if(isEmpty()) {
			last = newLink;
		}
		else
			first.prev = newLink;
		newLink.next = first; 
		first = newLink;
	}
	
	public void insertLast(Country a) {
		DoubleLink newLink = new DoubleLink(a);
		
		if(isEmpty()) {
			first = newLink;
		}
		else {
			last.next = newLink;
			newLink.prev=last;
		}
		last = newLink;
	}
	
	public DoubleLink deleteFirst() {
		DoubleLink temp = first;
		if(first.next == null)
			last = null;
		else
			first.next.prev = null;
		first = first.next;
		return temp;
	}
	
	public DoubleLink deleteLast() {
		DoubleLink temp = last;
		if(first.next == null)
			first = null;
		else
			last.prev.next = null;
		
		last = last.prev;
		return temp;
	}
	
	public void displayList() {
		DoubleLink current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
}
