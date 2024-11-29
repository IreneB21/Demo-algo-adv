package fr.eql.ai116.algo.adv.demo.recherchedichotomique;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7, 11, 13}; // Tableau trié
        int x = 7; // Élément à rechercher

        // Appel de la fonction avec les indices de début et de fin
        boolean result = DichotomicSearch.doesExist(x, array, 0, array.length - 1);

        // Afficher le résultat
        if (result) {
            System.out.println("L'élément " + x + " existe dans le tableau.");
        } else {
            System.out.println("L'élément " + x + " n'existe pas dans le tableau.");
        }

        int y = 18; // Élément à rechercher

        // Appel de la fonction avec les indices de début et de fin
        boolean result2 = DichotomicSearch.doesExistRecursive(y, array, 0, array.length - 1);

        // Afficher le résultat
        if (result2) {
            System.out.println("L'élément " + y + " existe dans le tableau.");
        } else {
            System.out.println("L'élément " + y + " n'existe pas dans le tableau.");
        }
    }
}
