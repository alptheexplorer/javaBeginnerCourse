package week3;

import java.util.Scanner;


public class Degre2 {
	float a,b,c,result1,result2,delta;
	
	
	
	public void getData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a");
		a = scan.nextFloat();
		System.out.println("enter b");
		b = scan.nextFloat();
		System.out.println("enter c");
		c = scan.nextFloat();
		}
	public void errorHandler() {
		while(a==0) {
			System.out.println("enter valid value for a"); 
			this.getData();
		}
	}
	
	public void calculate() {
		delta = b*b - 4*a*c; 
		if(delta < 0) {
			System.out.println("polynomial has no real solutions"); 
		}
		else {
			result1 = (float)(-b + Math.sqrt(delta))/2*a;
			result2 = (float)(-b - Math.sqrt(delta))/2*a;
			System.out.println(result1);
			System.out.println(result2);
		}
	}
	
	public void handler() {
		this.getData();
		this.errorHandler();
		this.calculate();
	}
	
	public static void main (String Args[]) {
		Degre2 a = new Degre2();
		a.handler();
		
				
	
	}
	
	
	
	
	
	

}
