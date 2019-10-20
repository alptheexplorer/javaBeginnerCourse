/* system creates sequence of length 4
   user makes guess
    # for correct and right placed number
    0 for correct but wrong placed number 
   notice that for 1213 if we propose 4512
   we do not return 00 but 0 because 4512 has only one 1
   finally note that return does not consider order of guess
   */

// generating random number 
package week5.src.MasterMindFiles;

import java.util.ArrayList;
import java.util.Scanner;
class MasterMind{
   
    ArrayList<Integer> randNum = new ArrayList<Integer>();
    ArrayList<Integer> userGuess = new ArrayList<Integer>();
    ArrayList<Integer> removed1 = new ArrayList<Integer>(); 
    ArrayList<Integer> removed2 = new ArrayList<Integer>(); 
    int max = 9;
    int responseLength;
    ArrayList<String> response = new ArrayList<String>(); 
    Scanner scan = new Scanner(System.in);

      
    int hasard(int n) {
        return (1 + (int)(Math.random() * this.max));
    }

    
    void random(){
        for(int j =0; j<4; j++){
            randNum.add(j,this.hasard(max));
        }
    }

    void userEntry(){
            System.out.println("enter guess");
        for(int j=0; j<4;j++){
            userGuess.add(j,scan.nextInt());
        }
    }

    void checker(){
        for(int i =0; i < 4; i++){
            if(randNum.get(i) == userGuess.get(i)){
                response.add(i,"#");
            }
        } 
        for(int i = 0; i < 4; i++){
            if(randNum.get(i) != userGuess.get(i)){
                removed1.add(i,randNum.get(i));
                removed2.add(i,userGuess.get(i));
            }
            else{
                removed1.add(i,0);
                removed2.add(i,0);
            }
        }
       
        responseLength = response.size();
        for(int i =0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(randNum.get(i) == userGuess.get(i) && randNum.get(i) != 0 && userGuess.get(i) != 0){
                    response.add(responseLength + i, "0");
                }
            }
        }
    }


    public static void main(String[] args){
        MasterMind m1 = new MasterMind();
        m1.random();
        for(int i =0; i<4; i++){
            System.out.println(m1.randNum.get(i));
        }
        m1.userEntry();
        m1.checker();
        for(int j= 0; j<4; j++){
            System.out.print(m1.response.get(j));
        }
    }
}