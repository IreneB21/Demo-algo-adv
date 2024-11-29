package fr.eql.ai116.algo.adv.demo.dichotomousSearch;

public class DichotomousSearch {

    // Méthode pour vérifier si un élément existe dans un tableau.
    public static boolean doesExist(int x, int[] array, int start, int end) {
        int middle;
        while (start <= end) {
            middle = (start + end) / 2; // Calculer le milieu.

            // Comparer l'élément du milieu avec l'élément recherché.
            if (array[middle] == x) {
                return true; // Element trouvé.
            } else if (array[middle] < x) {
                start = middle + 1; // Chercher dans la partie droite.
            } else {
                end = middle - 1; // Chercher dans la partie gauche.
            }
        }
        // Retourner faux si l'élément n'est pas trouvé.
        return false;
    }

    // Méthode récursive pour vérifier si un élément existe dans un tableau trié.
    public static boolean doesExistRecursive(int x, int[] array, int start, int end) {
        // Condition de base : si l'intervalle est vide.
        if (start > end) return false;

        // Calculer le milieu.
        int middle = (start + end) / 2;

        // Comparer l'élément du milieu avec l'élément recherché.
        if (array[middle] == x) {
            return true; // Élément trouvé.
        } else if (array[middle] < x) {
            // Recherche dans la partie droite.
            return doesExistRecursive(x, array, middle + 1, end);
        } else {
            // Recherche dans la partie gauche.
            return doesExistRecursive(x, array, start, middle - 1);
        }
    }
}
