package fr.eql.ai116.algo.adv.demo.chaine;

public class Node {

    int data;
    Node next;

    // Toujours créer un constructeur sans argument par défaut si on en crée un surchargé.
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
