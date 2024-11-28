package fr.eql.ai116.algo.adv.demo.chaine;

public class Main {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add(10);
        l.add(20);
        l.add(40);
        l.add(50);
        l.addFirst(80);
        l.addAtPosition(38, 3);
        l.display();
    }
}
