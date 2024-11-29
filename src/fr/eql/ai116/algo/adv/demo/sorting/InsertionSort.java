package fr.eql.ai116.algo.adv.demo.sorting;

public class InsertionSort {

    /**
     * Méthode pour effectuer un tri par insertion sur un tableau.
     * @param array Le tableau à trier
     */
    public void insertionSort(int[] array) {
        // Parcourt le tableau à partir du deuxième élément.
        for (int i = 1; i < array.length; i++) {
            // Stocke la valeur actuelle pour comparaison et insertion.
            int key = array[i];
            // Initialise un index pour parcourir les éléments précédents.
            int j = i - 1;

            // Déplace les éléments plus grands que la clé vers la droite.
            while (j >= 0 && array[j] > key) {
                // Copie l'élément à la position suivante.
                array[j + 1] = array[j];
                // Décrémente l'index pour vérifier l'élément précédent.
                j--;
            }
            // Insère la clé à sa position triée.
            array[j + 1] = key;
        }
    }
}
