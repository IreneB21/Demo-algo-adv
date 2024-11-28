package fr.eql.ai116.algo.adv.demo.tree.binary;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); // Crée une instance de l'arbre binaire.

        // Insertion de valeurs dans l'arbre.
        tree.insert(10); // Insère 10 comme racine.
        tree.insert(5);  // Insère 5 dans le sous-arbre gauche.
        tree.insert(15); // Insère 15 dans le sous-arbre droit.
        tree.insert(3);  // Insère 3 dans le sous-arbre gauche de 5.
        tree.insert(7);  // Insère 7 dans le sous-arbre droit de 5.
        tree.insert(20); // Insère 20 dans le sous-arbre droit de 15.

        // Affiche les valeurs de l'arbre en utilisant le parcours préfixe
        tree.display();

        tree.displayInOrder();
    }

}

