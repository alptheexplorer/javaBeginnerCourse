package week8;

// goal is to create a mailbox able to accept lettres, packages, and ads

public class Mailbox {
	
	public static void main(String[] args) {
		Letter l1 = new Letter(250, "express", "some adress", "A3");
		System.out.println("price of post is:" + l1.Price());
		
	}

}

class Letter extends Item implements ItemMethods{
	
	private double tarifA3 = 3.5;
	private double tarifA4 = 2.5;
	private String paperType; 
	
	Letter(double w, String d, String a, String t){
		super(w, d, a);
		this.paperType = t;
	}
	
	// clients will use the Price method 
	public void normalPrice(){
		if(this.paperType.contentEquals("A3")) {
			this.price = this.tarifA3 + this.weight;
		}
		if(this.paperType.contentEquals("A4")) {
			this.price = this.tarifA4 + this.weight; 
		}
	}
	
	public void expressPrice() {
		this.price *= 2;  
	}
	
	public double Price() {
		this.normalPrice();
		if(this.deliveryMethod.contentEquals("express")) {
			this.expressPrice();
		}
		return this.price; 
	}
	
	//validity check 
	public boolean Valid() {
		if(this.adress.contentEquals("")){
			return false;
		}
		else {
			return true; 
		}
	}
	
}

class Ad extends Item{
	Ad(double w, String d, String a){
		super(w, d, a);
	}
	
	public Double normalPrice(){
		this.price = this.weight*5;
		return this.price;
	}
	
}

class Package extends Item{
	private double volume;
	Package(double w, String d, String a,Double v){
		super(w,d,a);
		this.volume = v;
	}
	
	public Double normalPrice() {
		this.price = 0.25 * this.volume + this.weight; 
		return this.price; 
	}
}


class Item{
	public double weight;
	public String deliveryMethod;
	public String adress;
	public double price;
	
	Item(double w, String d, String a){
		this.weight = w;
		this.deliveryMethod = d;
		this.adress = a;
	}

}

interface ItemMethods{
	public double Price();
	public boolean Valid();
}