package edu.everton.dia54;

public class LinkedList<T> implements List<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    @Override
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Adicionado: " + data);
    }

    @Override
    public boolean remove(T data) {
        if (head == null) {
            System.out.println("Lista vazia.");
            return false;
        }

        if (head.data.equals(data)) {
            head = head.next;
            System.out.println("Removido: " + data);
            return true;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Elemento não encontrado.");
            return false;
        }

        current.next = current.next.next;
        System.out.println("Removido: " + data);
        return true;
    }

    @Override
    public void display() {
        if (head == null) {
            System.out.println("Lista vazia.");
            return;
        }

        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}