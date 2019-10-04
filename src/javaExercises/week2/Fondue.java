package javaExercises.week2;

import java.util.Scanner;

public class Fondue {
	 final int BASE = 4;
	 public int conviee; 
	 double[] values = {800.0, 2.0, 2.0, 400.0}; 
	 
	 public void question() {
		 Scanner scanner = new Scanner(System.in); 
		 System.out.println("Entrez le nombre de personne conviee a la fondue: "); 
		 conviee = scanner.nextInt();
	 }
	 
	 public void adjust() {
		 for(int i = 0; i < values.length; i++ ) {
			 values[i] = (values[i] * conviee)/ BASE; 
			 System.out.print(values[i]);
		 }
		 
	 }
	 
	 public void log() {
		 System.out.print("Vous avez besoin a\n" + values[0] + "de fromage\n" + values[1] + "d'eau \n" + values[2] + "ail \n"  + values[3] + "pain" ); 
	 }
	 
	 
	 public static void main(String Args[]) {
		
		 
		 Fondue fondue1 = new Fondue(); 
		 fondue1.question();
		 fondue1.adjust();
		 fondue1.log(); 
	 }
	
	

}
