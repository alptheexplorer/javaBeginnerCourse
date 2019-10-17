package week4;

import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = s;
        // la chaine codee
        String chaineCodee = "";
        
        for(int i = 0; i < s.length();i++) {
        	aCoder.charAt(i) = (int) s.charAt(i) + 4;
        }
        
        for(int i = 0; i < s.length();i++) {
        	aCoder.charAt(i) = (char) s.charAt(i);
        }
        
        

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}
