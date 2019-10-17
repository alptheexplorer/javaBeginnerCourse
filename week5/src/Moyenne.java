package week5.src;
import java.util.Scanner;
class Moyenne{
    Scanner scan1 = new Scanner(System.in);
    double temp;
    double holder;

    void average(int n){
        for(int i = 0; i<n; i++){
            System.out.println("enter score" + "");
            temp = scan1.nextDouble();
            holder += temp; 
        }
        holder = holder/2;
        System.out.println(holder);
    }

    public static void main(String[] args) {
        Moyenne m1 = new Moyenne();
        m1.average(5); 
    }
}