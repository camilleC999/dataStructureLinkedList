/**
* This creates a node object that stores the data
* and the addresses to the next node. 
* This is the link used in the Stack class.
*
* @author Camille Copeland
* @version 3/15/2020
*/
public class CountryLink {
	public Country cData;
	public CountryLink next;
	
	public CountryLink(Country a) {
		cData = a;
	}
	
	public void displayLink() {
		cData.printInfo();
	}

}
