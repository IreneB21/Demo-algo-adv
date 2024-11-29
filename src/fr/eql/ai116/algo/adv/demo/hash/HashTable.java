package fr.eql.ai116.algo.adv.demo.hash;

public class HashTable {

    private Node[] table;

    public HashTable(int length) {
        table = new Node[length];
    }

    public void insertElement(String element) {
        int position = Math.abs(element.hashCode()) % table.length;

        if (table[position] != null) {
            Node tail = findTail(table[position]);
            tail.setNextNode(new Node(element));
        } else {
            table[position] = new Node(element);
        }
    }

    private Node findTail(Node node) {
        if (node.getNextNode() == null) return node;
        return node.getNextNode();
    }

    public void displayTable() {
        int index = 0;

        for (Node node: table) {
            if (node != null) {
                System.out.print("[" + index + "] ");
                displayNode(node);
            }
            index++;
        }
    }

    private void displayNode(Node node) {
        System.out.print(node.getWord());

        if (node.getNextNode() != null) {
            System.out.print(" -> ");
            displayNode(node.getNextNode());
        } else {
            System.out.println();
        }
    }
}
