package fr.eql.ai116.algo.adv.demo.hash;

public class Node {

    private String word;
    private Node nextNode;

    public Node(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
