package javaExercises.week2;

import java.util.Scanner;

/** calculate IMC using weight and height 
 * formula = weight/height^2 
 * 
 * @author Alp-Admin
 *
 */

public class IMC {
	public static void main(String Args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter weight"); 
		double weight = scanner.nextDouble(); 
		System.out.println("Enter height");
		double height = scanner.nextDouble(); 
		
		double IMC = weight / (height*height);
		
		System.out.println("For a weight of" + weight + "height of" + height + "your IMC is" + IMC);
	}

}
