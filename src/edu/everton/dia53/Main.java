package edu.everton.dia53;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Lista após adições:");
        list.display();

        list.remove(3);
        list.remove(1);

        System.out.println("Lista após remoções:");
        list.display();

        // Tentando remover um elemento não existente
        list.remove(10);

        System.out.println("Lista final:");
        list.display();
    }
}