package fr.eql.ai116.algo.adv.demo.alphabet;

public class RecursiveAlphabet {

    private static void printAlphabet(char letter) {
        System.out.print(" " + letter + " ");
        if (letter < 'z') printAlphabet(++letter);
    }

    public static void main(String[] args) {
        printAlphabet('d');
    }
}
