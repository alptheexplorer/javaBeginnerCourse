package week3;

import java.util.ArrayList;
import java.util.Collections;

public class GCD extends Commons{
	
	int a,b,c,n;
	ArrayList<Integer> divisors = new ArrayList<Integer>();

	
	void getter() {
		System.out.println("enter value of a");
		a = scan.nextInt();
		System.out.println("enter value of b");
		b = scan.nextInt();
		
		if(a < b) {
			c = a;
		}
		else {
			c = b;
		}
	}
	
	void gcd() {
		for(int i =1; i<=c; i++) {
			if(a%i==0 && b%i==0) {
				divisors.add(i);
			}
		}
		this.n = divisors.size();
		Collections.sort(divisors);
		System.out.println("gcd is" + divisors.get(n-1));
	}
	@Override
	void handler() {
		this.getter();
		this.gcd();
	}
	
	public static void main(String Args[]) {
		GCD a = new GCD();
		a.handler();
	}
	

}
