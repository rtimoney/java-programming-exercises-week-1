/**
 * 
 */
package first;

/**
 * @author Ronan J Timoney
 * This class will calculate the area of a circle
 *
 */
public class AreaCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// declare the required variables for calculations
		double radius, circumference, area;
		
		radius = 9.0;
		
		// calculate the area of a circle of a given radius
		area = 3.142*(radius*radius); 
		
		// with printf the concantination operator is a comma rather than a full stop
		System.out.printf("Area is: %f \n",area); System.out.println("\n");
		
		// speciying %.2f means our area variable will be returned to two decimal places 
		System.out.printf("Area is: %.2f",area);
			
		
	} // end of main method 


} // end of class
