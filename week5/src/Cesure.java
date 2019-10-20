/* Here are the rules for the Cesure program:
Un mot ne peut être coupé qu'entre une voyelle et une consonne,
Une lettre ne peut être seule sur une ligne. Il faut veiller à cette situation au début et à la fin d'un mot
Il doit y avoir au moins une consonne sur chaque ligne
Votre programme respectera également les règles suivantes:
On utilisera l'alphabet latin avec les 26 lettres de a à z
les voyelles sont a, e, i, o, u, y
on supposera que le mot est toujours sans accents ni ponctuation et en lettres minuscules.
*/



package week5.src;

import java.util.ArrayList;
import java.util.Scanner;

class Cesure {

    char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
    String word;
    int wordCount;

    ArrayList<String> userEntry = new ArrayList<String>();

    Scanner scan = new Scanner(System.in);

   

    void getter(){
        System.out.println("enter number of words you will enter");
        wordCount = scan.nextInt();
        /*for(int i = 0; i < wordCount; ++i){
            System.out.println("enter word " + " " + i);
            System.out.println(" ");
            userEntry.add(i,scan.nextLine());
        }*/

        scan.nextLine();
        for (int i = 0; i < wordCount; i++) {
            System.out.print("Donnez le mot " + (i + 1) + " : ");
            userEntry.add(i, scan.nextLine());
        }
    }


    void call(int n){
        this.word = userEntry.get(n);
    }

    void chop(){
        int ini = 0;
        for(int i = 1; i < word.length(); i++){
            char c1 = word.charAt(i-1);
            char c2 = word.charAt(i); 
            if(vowels(c1) && !vowels(c2)){
                String s1 = word.substring(ini, i);
                String s2 = word.substring(i, word.length());
                    if(s1.length() > 1 && s2.length() > 1){
                        if(!this.vowelCheck(s1) || this.vowelCheck(s2)){
                            System.out.println(s1 + "-");
                            ini = i;
                        }
                    }
            }

        }
        String s1 = word.substring(ini, word.length());
        System.out.println(s1);
    }



    boolean vowels(char c){
         return ((c == 'a') ||
                    (c == 'e') ||
                    (c == 'i') ||
                    (c == 'o') ||
                    (c == 'u') ||
                    (c == 'y'));
    }

    boolean vowelCheck(String s){
        for(int i = 0; i < s.length(); i++){
            if(!this.vowels(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
    







    public static void main(String[] args) {
        Cesure c1 = new Cesure();
        c1.getter();


        for(int i = 0; i<c1.userEntry.size(); i++){
            c1.call(i);
            c1.chop();
        }
    }

  
    
}