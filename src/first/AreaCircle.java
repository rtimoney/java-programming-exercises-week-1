/**
 * 
 */
package first;

/**
 * @author Ronan J Timoney
 * This class will calculate the area of a square
 *
 */
public class AreaCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// declare the variables 
		double radius, circumference, area;
		
		radius = 9.0;
		
		// calculate the area of a given radius
		area = 3.142*(radius*radius); 
		
		// with printf the concantination operator is a comma rather than a full stop

		System.out.printf("Area is: %f \n",area); System.out.println("\n");
		
		// the added .2 means to two decimal places 
		System.out.printf("Area is: %.2f",area);
			
		
	} // end of main method 


} // end of class
