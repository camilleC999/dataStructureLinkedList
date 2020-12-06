	/**
	* This is the Queue class. This creates the Queue
	* object using a constructor. The methods within 
	* the class are used to remove and insert links into
	* the Queue linked list. 
	*
	* @author Camille Copeland
	* @version 3/15/2020
	*/
public class Queue {
	private DLinkList theList;
	static String format = "%1$-30s %2$-30s %3$-30s %4$-30s %5$-30s %6$-30s\n";
	
	public Queue() {
		theList = new DLinkList();
	}
	
	public boolean isEmpty() {
		return(theList.isEmpty());
	}
	
	public void insertEnd(Country a) {
		theList.insertLast(a);	
	}
	
	public void insertFront(Country a) {
		theList.insertFirst(a);
	}

	public DoubleLink removeEnd() {
		return theList.deleteLast();
	}
	
	public DoubleLink removeFront() {
		return theList.deleteFirst();
	}
	
	public boolean intervalDelete(long min, long max) {
		DoubleLink current = theList.first; 
		int flag = 0;
		while(current.cData.getperCap() < min || current.cData.getperCap() > max) {
			current = current.next;
			if(current==null)
				return false;	
		}
		if(current==theList.first) {
			theList.first = current.next; 
		}
		else {
			current.prev.next = current.next;
		}
		if(current==theList.last) {
			theList.last= current.prev;
		}
		else
			current.next.prev= current.prev; 
		return true;
		
	}
	
	public void printQueue() {
		System.out.format(format, "\nName", "Code", "Capitol", "Population", "GDP", "Happiness Rank");
		System.out.println("------------------------------------------------------------"
				+ "----------------------------------------------------------------------------------------------------------------------");
		theList.displayList();
	}
}
