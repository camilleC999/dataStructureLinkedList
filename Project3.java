/**
* COP 3530: Project 3 – Linked lists
* This class takes the input from the file and assigns each
* country to the stack if it conforms to the constraints. 
* The 
* *
* @author Camille Copeland
* @version 3/15/2020
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project3 {
	static Country country;
	static long x;
	
	/**
	* This method implements all of the detailed maneuvers
	* to the queue and stack. It also reads the file given
	* to us in Countries3.csv. It assigns each of those countries
	* the pge(poor good excellent) stack if that's within the 
	* ranges described. 
	*/
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		Stack pge = new Stack();
		
		Scanner in = new Scanner(System.in);//scanner to take input
		System.out.println("Please enter file name: ");
		String b = in.nextLine();// user input
		
		
		File file = new File(b);// takes the file 
		Scanner read = new Scanner(file);// allows for the file to be read 
		read.useDelimiter("\n|,");//allows parsing of each line
		read.nextLine();// skips the header
			
		for(int i = 0; i < 155; i++) {// for initializes each individual object in the array and assigns values to its attributes
			String ab = read.next();
			String ac = read.next();
			String ad = read.next();
			String ae = read.next();
			String af = read.next();
			String ag = read.next();
			country = new  Country(ab, ac, ad, ae, af, ag);
			country.setCountry(ab);
			country.setCountryCode(ac);
			country.setCapitol(ad);
			country.setPopulation(ae);
			country.setGDP(af);
			country.setHappy(ag);
			country.setperCap(ae, af);
			x = country.getperCap();
			
			if( x < 1000)
				pge.push(country);
			if (x >= 5000 && x < 20000)
				pge.push(country);		
			if(x >= 50000)
				pge.push(country);
			read.nextLine();	
		}
		
		Queue egp = new Queue(); //this creates the queue object
		
		pge.printStack();//this prints the stack object First print
		
		int flag = 1;// this flag is used to determine whether a country is inserted at the front or back of the queue
		
		while(!pge.isEmpty()) {// this while loop pops countries from the stack into the queue
			if(flag%2 == 1) {
			egp.insertFront(pge.pop().cData);
			}
			else {
				egp.insertEnd(pge.pop().cData);
			}
			flag++;
		}

		egp.printQueue();// prints the queue Second Print
		
		egp.intervalDelete(50000, 70000);//deletes certain countries in the queue
		
		egp.printQueue();//prints queue minus the countries deleted above Third Print
		
		flag = 1;// used for the same reason stated above 
		
		while(!egp.isEmpty()) {// this removes items from the queue
			if(flag%2 == 1) {
				pge.push(egp.removeFront().cData);
			}
			else {
				pge.push(egp.removeEnd().cData);
			}
			flag++; 
		}
		
		pge.printStack();//Fourth Print
		


	}

}
