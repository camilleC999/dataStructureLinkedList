/**
	* This is the Stack class. This creates the Stack
	* object using a constructor. The methods within 
	* the class are used to remove and insert links into
	* the Stack linked list. 
	*
	* @author Camille Copeland
	* @version 3/15/2020
	*/
public class Stack {
	static String format = "%1$-30s %2$-30s %3$-30s %4$-30s %5$-30s %6$-30s\n";

	private LinkList theList;
	
	public Stack() {
		theList = new LinkList();
	}
	
	public void push(Country a) {
		theList.insertFirst(a);
	}
	
	public CountryLink pop() {
		return theList.deleteFirst();
	}
	
	public boolean isEmpty() {
		return(theList.isEmpty());
	}
	
	public boolean isFull() {
		return false;
	}
	
	public void printStack() {
		System.out.format(format, "\nName", "Code", "Capitol", "Population", "GDP", "Happiness Rank");
		System.out.println("------------------------------------------------------------"
				+ "----------------------------------------------------------------------------------------------------------------------");
		theList.displayList();
	}
}
