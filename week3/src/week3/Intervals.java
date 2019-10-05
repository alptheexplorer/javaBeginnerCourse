package week3;

public class Intervals extends Commons{
	float a;

	/* a belongs to I if in range I = [2,3[ U ]0,1] U [-10,-2] */ 
	public void getter() {
		System.out.println("enter value of a");
		a = scan.nextFloat();
	}
	
	
	void checker() {
		if( (a<3&&a>=2)||(a<=1&&a>0)||(a<=-2&&a>=-10)) {
			System.out.println(a+ " " + "is in range I");
		}
		else {
			System.out.println(a+ " " + "is not in range I");
		}
	}
	
	void handler(){
		this.getter();
		this.checker();
	}
	
	
	public static void main(String Args[]) {
		Intervals a = new Intervals();
		a.handler();
	}
	
	
}
