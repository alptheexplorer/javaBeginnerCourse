package week5.src;


class friendNumber {

    public static void main(String[] args) {
        int[] nombres = {1210, 45, 27, 220, 54, 284, 9890, 120, 1184};
        System.out.println("Les paires de nombres amicaux sont : ");
        afficherAmicaux(nombres);
    }

    /**
     * Vérifie si les deux nombres donnés (nb1 et nb2) sont amicaux.
     */
    public static boolean amical(int nb1, int nb2) {
        int somme = sommeDiviseur(nb1);
        return (nb1 + nb2 == somme
                    && sommeDiviseur(nb2) == somme);
    }

    /**
     * Calcule la somme des diviseurs du nombre passé en paramètre (nb1).
     */
    public static int sommeDiviseur(int nb1) {
        int somme = 0;
        for (int i = 1; i <= nb1; ++i){
            if ((nb1 % i) == 0){
                somme += i;
            }
        }
        return somme;
    }

    /**
     * Affiche tous les nombres amicaux contenus dans un tableau d'entiers.
     */
    public static void afficherAmicaux(int[] nombres){
        for (int i = 0; i < nombres.length; ++i){
            for (int j = i+1; j < nombres.length; ++j)
                if (amical(nombres[i],nombres[j])){
                    System.out.println(nombres[i] + " " + nombres[j]);
                }
        }
    }
}