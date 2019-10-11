package javaExercises.week2;

import java.util.Calendar;
import java.util.Scanner;

public class dateDeNaissance {
	
	public static void main(String Args[]) {
		Scanner input = new Scanner(System.in); 
		int year = Calendar.getInstance().get(Calendar.YEAR); 
		
		System.out.println("enter your age");
		int age = input.nextInt(); 
		int birthday = year - age; 
		System.out.println("you were born in" + birthday); 
	}
	
}
