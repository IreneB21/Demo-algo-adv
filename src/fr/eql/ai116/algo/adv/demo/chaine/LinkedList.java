package fr.eql.ai116.algo.adv.demo.chaine;

public class LinkedList {

    // Premier nœud de la liste
    private Node head;

    public LinkedList() {
        // Liste vide initialement.
        this.head = null;
    }

    public void add(int data) {
        // On crée un nœud.
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head; // On part du premier nœud.
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void display() {
        // On part du premier élément.
        Node current = head;

        /*
        On teste si la liste est vide ou non.
        Si elle est vide, on affiche : "la liste est vide".
        Sinon, on fait une boucle et on affiche : data + " -> " + data.
        On affiche 'null' quand on sort de la boucle.
         */
        if (current == null) {
            System.out.println("La liste est vide.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
