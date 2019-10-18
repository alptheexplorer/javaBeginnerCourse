package week5.src; 

class Affectation{
    int a = 1;
    int b = 2;
    String a1 = "hello";
    String b1 = "bye";
    String temp;

    void totwo( ){
        this.a = 2*a;
        this.b = 2*b; 
        System.out.println("a" + " "+ a);
        System.out.println("b" + " "+ b);
    }

    void toChange(){
        this.temp = this.b1;
        this.b1 = this.a1;
        this.a1 = this.temp;
        System.out.println("a" + " " + a1);
        System.out.println("b" + " " +  b1);    
    }

    public static void main(String[] args) {
        Affectation a1 = new Affectation();
        a1.totwo();
        a1.toChange();
    }


}