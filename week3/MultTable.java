package week3;

public class MultTable {
	int result; 
	void table() {
		for(int i = 2; i <=10; i++) {
			for(int j = 1; j <=10; j++) {
				result = i*j;
				System.out.println(j + "*" + i + "=" + result);
			}
		}
	}
	
	public static void main(String Args[]) {
		MultTable a = new MultTable();
		a.table();
	}
}
