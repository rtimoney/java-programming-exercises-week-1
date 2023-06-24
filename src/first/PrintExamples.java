/**
 * 
 */ 
package first;

/**
 * @author Ronan J Timoney
 *
 */
public class PrintExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring the required variables and assigning values
		int anInt =9;
		double aDouble =3.14;
		String aString = "My String value";
		
		// printing some information to then console 
		System.out.println("Using println");
		System.out.println("A int value : "+anInt);
		System.out.println("A double value : "+aDouble);
		System.out.println("A string value : "+aString+"\n");
		
		// with printf, note each type of var has a different formatter e.g. %d, %f etc 
		System.out.printf("Using printf \n");
		System.out.printf("A int value : %d \n",anInt);
		System.out.printf("A double value : %f \n",aDouble);
		System.out.printf("A string value : %s \n",aString);
		System.out.printf("All values int %d and the %f and then string %s", anInt, aDouble, aString);
		

	} // end of main method

} // end of class
