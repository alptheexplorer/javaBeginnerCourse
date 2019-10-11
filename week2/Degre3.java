package javaExercises.week2;

import java.util.Scanner;

public class Degre3 {
	
	public int a,b,c;
	public double x, result; 
	public void infoGetter() {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Entrez a:");
		a = scanner.nextInt();
		System.out.print("Entrez b:");
		b = scanner.nextInt();
		System.out.print("Entrez c:");
		c = scanner.nextInt();
		System.out.print("Entrez x:");
		x = scanner.nextDouble();
		result = ((a+b)/2)*x*x*x + (a+b)*(a+b)*x*x + a + b +c; 
	}
	
	public static void main(String args[]) {
		Degre3 A = new Degre3(); 
		A.infoGetter();
		
		System.out.print("value is" + A.result);
	}
}
