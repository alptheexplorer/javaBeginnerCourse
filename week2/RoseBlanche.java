package javaExercises.week2;

import java.util.Scanner;

public class RoseBlanche {
	int received; 
	int Sat = 2;
	int Flash = 4;
	int metro = 3; 
	int mains, rest;
	int SatS, MetroS, FlashS; 
	
	public void dataHandler() {
		Scanner s1 = new Scanner(System.in); 
		System.out.println("how much did u receive?");
		received = s1.nextInt(); 
		mains = received* 3/4; 
		rest = received - mains; 
		SatS = rest/3;
		int netSat = Math.floorDiv(SatS, Sat);
		MetroS = rest/3;
		int netMetro = Math.floorDiv(MetroS, metro);
		FlashS = rest/3; 
		int netFlash = Math.floorDiv(FlashS, Flash); 
		int leftOver = rest - (netSat + netMetro + netFlash); 
		System.out.println("net amount: " + received + "\n mains:" + mains + "\n satellite bar:" + netSat + "\n Metro" + netMetro + "\n Flash: " + netFlash + "\n flowers" + leftOver + "fr."  );
	}
	
	public static void main(String Args[]) {
		RoseBlanche r1 = new RoseBlanche();
		r1.dataHandler();
	}
	
	

}
