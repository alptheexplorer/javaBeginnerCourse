package javaExercises.week2;

public class Moyenne {
	
	
	
	  public void method1() {
	        double noteProgrammation = 6.0;
	        double noteAlgebre = 5.0;
	        System.out.println("Ma moyenne est " + (noteProgrammation++ + noteAlgebre) / 2.0 );
	    }
	  
	  public void method2() {
		  double noteProgrammation = 6.0;
	        double noteAlgebre = 5.0;
	        System.out.println("Ma moyenne est " + (++noteProgrammation + noteAlgebre) / 2.0 );
	  }
	  
	  public static void main(String Args[]) {
		  Moyenne m1 = new Moyenne(); 
		  m1.method1();
		  m1.method2();
		  
		  
	  }

}
