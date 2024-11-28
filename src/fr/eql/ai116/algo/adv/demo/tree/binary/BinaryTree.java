package fr.eql.ai116.algo.adv.demo.tree.binary;

public class BinaryTree {

    Node root; // Racine de l'arbre.

    // Constructeur pour initialiser un arbre vide.
    public BinaryTree() {
        root = null; // Définit la racine comme null (arbre vide au début).
    }

    // Méthode pour insérer une valeur dans l'arbre.
    void insert(int data) {
        root = insertRec(root, data); // Appelle la méthode récursive pour insérer à partir de la racine.
    }

    // Méthode récursive pour insérer un nœud dans l'arbre.
    Node insertRec(Node node, int data) {
        if (node == null) {
            // Si le nœud est vide, crée un nouveau nœud avec la valeur donnée.
            return new Node(data);
        }

        if (data < node.data) {
            // Si la valeur est inférieure, insère dans le sous-arbre gauche.
            node.left = insertRec(node.left, data);
        } else if (data > node.data) {
            // Si la valeur est supérieure, insère dans le sous-arbre droit.
            node.right = insertRec(node.right, data);
        }

        // Retourne le nœud actuel après insertion.
        return node;
    }

    // Méthode pour parcourir l'arbre en préfixe (PreOrder).
    void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " "); // Affiche la valeur du nœud courant.
            preOrderTraversal(node.left);    // Parcourt récursivement l'enfant gauche.
            preOrderTraversal(node.right);   // Parcourt récursivement l'enfant droit.
        }
    }

    // Méthode pour démarrer le parcours préfixe à partir de la racine.
    void display() {
        System.out.println("\r\nParcours préfixe de l'arbre :"); // Message d'information.
        preOrderTraversal(root); // Lance le parcours en commençant par la racine.
    }

    // Méthode pour effectuer un parcours InOrder.
    void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);  // Parcourt récursivement l'enfant gauche.
            System.out.print(node.data + " "); // Affiche la valeur du nœud courant.
            inOrderTraversal(node.right); // Parcourt récursivement l'enfant droit.
        }
    }

    // Méthode pour démarrer le parcours InOrder à partir de la racine
    void displayInOrder() {
        System.out.println("\r\nParcours InOrder de l'arbre :"); // Message d'information
        inOrderTraversal(root); // Lance le parcours InOrder en commençant par la racine
    }
}
