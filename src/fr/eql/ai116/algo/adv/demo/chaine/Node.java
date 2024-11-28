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

/*
head == null
newNode = Node(data = 10)
head = newNode = Node(data = 10)

head == Node(data = 10)
newNode = Node(data = 20)
currentNode = head = Node(data = 10)
currentNode.next = newNode = Node(data = 20)

head == Node(data = 10)
newNode = Node(data = 30)
currentNode = head = Node(data = 10)
        currentNode = currentNode.next = Node(data = 20)
currentNode.next = newNode = Node(data = 30)

head == Node(data = 10)
newNode = Node(data = 40)
currentNode = head = Node(data = 10)
        currentNode = currentNode.next = Node(data = 30)
currentNode.next = newNode = Node(data = 40)

head == Node(data = 10)
newNode = Node(data = 50)
currentNode = head = Node(data = 10)
        currentNode = currentNode.next = Node(data = 40)
currentNode.next = newNode = Node(data = 50)
 */