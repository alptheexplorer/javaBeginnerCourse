package week5.src;

import java.util.Scanner;

class Rect{
// program that finds perimeter or area of triangle 

double height, width, per, area;
char answer;
Scanner scan1 = new Scanner(System.in);

void getter(){
    System.out.println("enter height");
    height = scan1.nextDouble(); 
    System.out.println("enter width");
    width = scan1.nextDouble();
}

double perimeter(){
    per = 2*(height + width);
    return(per);
}

double area(){
    area = height*width;
    return(area);
}

void invoke(){
    System.out.println("area or perimeter");
    answer = scan1.next().charAt(0);
    if(answer == 'a'){
        System.out.println(this.area);
    }
    
    switch(answer){
        case 'a':
            System.out.println(this.area());
        break;
        case 'p':
        System.out.println(this.perimeter());
        break;
        default:
        System.out.println("please answer correctly");
        this.invoke();
        break;
    }
   
}

public static void main(String[] args) {
    Rect r1 = new Rect();
    r1.getter();
    r1.invoke();
}}



