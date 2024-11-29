package fr.eql.ai116.algo.adv.demo.sorting;

public class BubbleSort {

    // Méthode pour trier un tableau en utilisant le tri à bulles.
    public static int[] sort(int[] array) {
        // On récupère la taille du tableau.
        int n = array.length;

        // Boucle extérieure pour chaque passage dans le tableau.
        for (int i = 0; i < n - 1; i++) {
            // Boucle intérieure pour comparer les éléments adjacents.
            for (int j = 0; j < n - i - 1; j++) {
                // On vérifie si l'élément actuel est plus grand que le suivant.
                if (array[j] > array[j + 1]) {
                    // Si oui, on échange les deux éléments.
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // Retourne le tableau trié
        return array;
    }
}
