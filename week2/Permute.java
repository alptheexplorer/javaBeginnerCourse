package javaExercises.week2;

import java.util.Scanner;

public class Permute {
	
	int x,y; 
	public void infoGetter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter x: ");
		x = scanner.nextInt();
		System.out.println("enter y: ");
		y = scanner.nextInt();
	}
	
	public void permuter() {
		int temp = x;
		this.x = y;
		this.y = temp; 
		System.out.print("x:" + x + "y: "+ y);
	}
	
	public static void main(String Args[]) {
		Permute p1 = new Permute();
		p1.infoGetter();
		p1.permuter();
	}
}
