package week8;

public class Direction {
	
	public static void main(String[] args) {
		Sec s1 = new Sec(2005, "Louise", "Mathematique", 50000);
		s1.display();
	}

}

class epflMember{
	private int year;
	private String name;
	
	public int getYear() {
		return this.year; 
	}
	
	public String getName() {
		return this.name;
	}
	
	// override this method
	public void display() {}
	
	epflMember(int year, String name){
		this.year = year;
		this.name = name; 
	}
	
}


class Sec extends epflMember{
	private String section;
	private double salary;
	
	public double getSalary() {
		return this.salary;
	}
	
	public String getSection() {
		return this.section;
	}
	
	
	Sec(int year, String name, String section, double salary){
		super(year,name);
		this.section = section;
		this.salary = salary; 
	}
	
	public void display(){
		System.out.println("Name: " + super.getName());
		System.out.println("Year:" + super.getYear());
		System.out.println("Lab:" + this.getSection());
		System.out.println("Salary:" + this.getSalary());
	}
	
	
}










