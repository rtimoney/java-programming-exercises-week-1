/**
 * 
 */
package first;

/**
 * @author Ronan J Timoney
 *
 */
public class YearsOfAge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// declare vars
		int yearOfBirth, yearWhenITurn21, yearWhenITurn40, yearWhenIRetireAt60;
		
		// set the initial year of birth 
		yearOfBirth = 1993;
		
		//calculate the ages 
		yearWhenITurn21 = yearOfBirth+21;
		yearWhenITurn40 = yearOfBirth+40;
		yearWhenIRetireAt60 = yearOfBirth+60;
		
		//output years to screen
		System.out.println("Birth Year   : "+yearOfBirth);
		System.out.println("Turn 21      : "+yearWhenITurn21);
		System.out.println("Turn 40      : "+yearWhenITurn40);
		System.out.println("Retire at 60 : "+yearWhenIRetireAt60);
	
		// need to put the yearOfBirth and the +100 nside brackets, otherswise we will get 1993100
		System.out.println("Turn 100     : "+(yearOfBirth+100));
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
