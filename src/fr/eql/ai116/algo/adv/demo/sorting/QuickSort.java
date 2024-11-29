package fr.eql.ai116.algo.adv.demo.sorting;

public class QuickSort {

    // Procédure principale pour le tri rapide
    public static void quickSort(int[] T, int deb, int fin) {
        if (deb < fin) {
            int pivot = partition(T, deb, fin, T[deb]);
            quickSort(T, deb, pivot - 1);
            quickSort(T, pivot + 1, fin);
        }
    }

    // Procédure pour partitionner le tableau
    public static int partition(int[] T, int deb, int fin, int pivot) {
        int pivotValue = pivot;
        int c = deb;

        for (int i = deb + 1; i <= fin; i++) {
            if (T[i] < pivotValue) {
                c = c + 1;
                // Permuter T[i] et T[c]
                int temp = T[i];
                T[i] = T[c];
                T[c] = temp;
            }
        }

        // Permuter T[c] et T[deb]
        int temp = T[c];
        T[c] = T[deb];
        T[deb] = temp;

        return c; // Retourne la position du pivot
    }

    // Fonction principale pour tester le tri rapide
    public static void main(String[] args) {
        int[] tableau = { 34, 7, 23, 32, 5, 62 };
        System.out.println("Tableau avant le tri:");
        for (int val : tableau) {
            System.out.print(val + " ");
        }

        quickSort(tableau, 0, tableau.length - 1);

        System.out.println("\nTableau après le tri:");
        for (int val : tableau) {
            System.out.print(val + " ");
        }
    }
}
