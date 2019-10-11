package week3;

import java.util.Scanner;

public class Numbers2 {
	
    int a;
    public void getter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer");
        a = scan.nextInt();
    }

    public void algorithm(){
      if(a>0 && a%2==0){
          System.out.println( a + "is positive and even");
      }
      if(a<0 && a%2!=0){
        System.out.println( a + "is  and negative and odd");
      }
       if(a>0 && a%2!=0){
            System.out.println( a + "is positive and odd");
        }
      if(a<0 && a%2==0){
            System.out.println( a + "is negative and even");
        }
        if(a==0){
            System.out.println( a + "is zero");
        }
    }

    
    public static void main(String Args[]){
        Numbers2 b = new Numbers2();
        b.getter();
        b.algorithm();
    }

}
