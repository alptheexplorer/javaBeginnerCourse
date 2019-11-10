package week7.src;

import java.util.Scanner;

public class Geometrie {
	
	static double a,b,c,d,e,f;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		// vertex setting
			for(int i = 0; i<=2;i++) {
				switch(i) {
				case 0:
					System.out.println("enter x: ");
					a = scan.nextDouble();
					System.out.println("enter y: ");
					b = scan.nextDouble();
					double[] a1 = {a,b};
					t1.vertex.addV1(a1);
					break;
				case 1:
					System.out.println("enter x: ");
					c = scan.nextDouble();
					System.out.println("enter y: ");
					d = scan.nextDouble();
					double[] a2 = {c,d};
					t1.vertex.addV1(a2);
					break;
				case 2: 
					System.out.println("enter x: ");
					e = scan.nextDouble();
					System.out.println("enter y: ");
					f = scan.nextDouble();
					double[] a3 = {e,f};
					t1.vertex.addV1(a3);
					break;
					}
				}
				t1.setLength();
				System.out.println(t1.perimeter());
				}
}

class Triangle{
	public Vertex vertex = new Vertex(); 
	private double perimeter = 0;
	private double l1, l2, l3;
	
	
	public void setLength() {
		this.l1 = (vertex.getVertex1()[0]-vertex.getVertex2()[0])*(vertex.getVertex1()[0]-vertex.getVertex2()[0]) + (vertex.getVertex1()[1]-vertex.getVertex2()[1])*(vertex.getVertex1()[1]-vertex.getVertex2()[1]); 
		this.l2 = (vertex.getVertex2()[0]-vertex.getVertex3()[0])*(vertex.getVertex2()[0]-vertex.getVertex3()[0]) + (vertex.getVertex2()[1]-vertex.getVertex3()[1])*(vertex.getVertex2()[1]-vertex.getVertex3()[1]); 
		this.l3 = (vertex.getVertex1()[0]-vertex.getVertex3()[0])*(vertex.getVertex1()[0]-vertex.getVertex3()[0]) + (vertex.getVertex1()[1]-vertex.getVertex3()[1])*(vertex.getVertex1()[1]-vertex.getVertex3()[1]); 
		this.l1 = Math.sqrt(l1);
		this.l2 = Math.sqrt(l2);
		this.l3 = Math.sqrt(l3);
	}
	

	public double perimeter() {
		return (perimeter += this.l1 + this.l2 + this.l3); 
	}
}


class Vertex{
	private double [] v1 = new double[2];
	private double [] v2 = new double[2];
	private double [] v3 = new double[2];
	
	/* public void addVertex(double[] v1, double[] v2, double[] v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	} */
	
	public void addV1(double[] v1) {
		this.v1[0] = v1[0];
		this.v1[1] = v1[1]; 
	}
	
	public void addV2(double[] v2) {
		this.v2[0] = v2[0];
		this.v2[1] = v2[1]; 
	}
	
	public void addV3(double[] v3) {
		this.v3[0] = v3[0];
		this.v3[1] = v3[1]; 
	}
	
	
	public double[] getVertex1(){
		return this.v1;
	}
	
	public double[] getVertex2(){
		return this.v2;
	}
	
	public double[] getVertex3(){
		return this.v3;
	}
	
}