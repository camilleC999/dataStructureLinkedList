/**
* This creates a node object that stores the data
* and the addresses to the next and previous node. 
* This is the link used in the Queue class.
*
* @author Camille Copeland
* @version 3/15/2020
*/
public class DoubleLink {
	public Country cData;
	public DoubleLink next;
	public DoubleLink prev;
	
	/**
	* This method is the constructor that initializes the cData in the link.
	*
	* @param The parameter is a country object containing all of the data
	* from a country.
	* @return no return.
	*/
	public DoubleLink(Country a) {
		cData = a;
	}
	
	/**
	* This prints the country data within the link
	*/
	public void displayLink() {
		cData.printInfo();
	}
}
