package fr.eql.ai116.algo.adv.demo.alphabet;

public class Alphabet {

    private static void printAlphabet(char letter) {
        System.out.print(" " + letter + " ");
        if (letter < 'z') {
            System.out.print(" " + ++letter + " ");
            if (letter < 'z') {
                System.out.print(" " + ++letter + " ");
                if (letter < 'z') {
                    System.out.print(" " + ++letter + " ");
                    if (letter < 'z') {
                        System.out.print(" " + ++letter + " ");
                        if (letter < 'z') {
                            System.out.print(" " + ++letter + " ");
                            if (letter < 'z') {
                                System.out.print(" " + ++letter + " ");
                            }
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        printAlphabet('a');
    }
}
