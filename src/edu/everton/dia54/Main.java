package edu.everton.dia54;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Lista após adições:");
        list.display();

        list.remove(2);

        System.out.println("Lista após remoção:");
        list.display();

        System.out.println("Lista final:");
        list.display();
    }
}