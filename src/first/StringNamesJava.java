/**
 *   
 */
package first;

/**
 * @author Ronan J Timoney
 *
 */
public class StringNamesJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare vars
		String yourName;
	
		// initialize 
		yourName = "Ronan \t Timoney";

		System.out.println(yourName);
		System.out.println("The input string is:\t"+yourName);
		System.out.println("The number of characters in the string is : "+yourName.length());

		System.out.println("The first character in the string is : "+yourName.charAt(0));
		System.out.println("The first character in the string is : "+yourName.charAt(1)+yourName.charAt(2));
		System.out.println("The first character in the string is : "+yourName.toUpperCase());
	
	} // end of main method 
} // end of class
