package week4;

import java.util.Arrays;



public class MostFrequent {
	
	// goal of this code is to find most frequent number
	  public static void main(String[] args) {
	        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
	        int taille = tab1.length;
	        int length = 0; 
	        
	        
	        // obtaining array size
	        for(int i = 0; i<taille;i++) {
	        	for(int j = 0; j < taille; j++) {
	        		if(tab1[i] == tab1[j]) {
	        			++length;
	        		}
	        	}
	        }
	        
	        
	        int[][] store = new int[length][2];
	        int[] freq = new int[length];
	        int large;
	        int largestFreq;
	        
	        
	        for(int i = 0; i<taille;i++) {
	        	for(int j = 0; j < taille; j++) {
	        		if(tab1[i] == tab1[j]) {
	        			store[i][0] = tab1[i];
	        			store[i][1] += 1;
	        		}
	        	}
	        }
	        
	        for(int i = 0; i<length;i++) {
	        	freq[i] = store[i][1];
	        	
	        }
	        
	       
	        Arrays.sort(freq);
	        largestFreq = freq[length-1];
	        
	        System.out.println("most frequent number is:" + largestFreq);
	        
	  }     
	        
}       
	        
	        
	  

	  
	   
