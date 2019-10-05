package week3;

import java.util.Arrays;

public class Bilan extends Commons {
	
	int n,max,min,average;
	int months[];
	
	
	void loop() {
		System.out.println("enter n");
		n = scan.nextInt();
		months = new int[n];
		for(int i=1;i<n;i++) {
			System.out.println("enter value of month" + i);
			months[i-1] = scan.nextInt();
		}
		Arrays.sort(months);
		for(int i = 0;i<n;i++) {
			average+= months[i];
		}
		average = average/n;
	}
	
	void print() {
		System.out.println("min income is" + months[1]);
		System.out.println("max income is" + months[n-1]);
		System.out.println("average monthly income is" + average);
	}
	@Override
	void handler() {
		// TODO Auto-generated method stub
		this.loop();
		this.print();
	}
	
	public static void main(String Args[]) {
		Bilan a = new Bilan();
			a.handler();
	}
	
	

}
