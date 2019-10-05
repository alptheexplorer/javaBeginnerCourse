package week3;

public class Ifloops {
	
	int a = 3;
	int b = 3;
	void While() {
		while(a<=10) {
			System.out.println("a:" + a);
			++a; 
		}
	}
	
	void DoWhile() {
		do {
			System.out.println("b:" + b);
			++b;
		}while(b<=10);
	}
	
	public static void main (String Args[]) { 
		Ifloops a = new Ifloops();
		a.While();
		a.DoWhile();
		

	}
}
