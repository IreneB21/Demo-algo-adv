package fr.eql.ai116.algo.adv.demo.sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /// Tri par bulles ///
        int[] array = {32, 4, 86, 8, 77, 45, 12, 36, 9};
        System.out.println(Arrays.toString(BubbleSort.sort(array)));

        /// Tri par insertion ///
        int[] array2 = {12, 11, 13, 5, 6};
        InsertionSort sorter = new InsertionSort();
        sorter.insertionSort(array2);
        System.out.print("Tableau trié : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
