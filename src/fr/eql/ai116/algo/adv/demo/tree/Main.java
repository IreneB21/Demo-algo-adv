package fr.eql.ai116.algo.adv.demo.tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); // On crée une instance d'un arbre.
        tree.addRoot(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(7);

        tree.display();
        System.out.println();
        tree.displayMiddle();
    }
}
