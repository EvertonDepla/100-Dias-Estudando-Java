package edu.everton.dia59;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        if (contains(data)) {
            System.out.println("O nó com valor " + data + " já está presente na lista.");
            return;
        }
        
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void remove(int data) {
        if (head == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        if (head.data == data) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        Node current = head;
        Node prev = null;
        do {
            prev = current;
            current = current.next;
            if (current.data == data) {
                prev.next = current.next;
                if (current == tail) {
                    tail = prev;
                }
                return;
            }
        } while (current != head);
        
        System.out.println("O nó com valor " + data + " não foi encontrado.");
    }

    public boolean contains(int data) {
        if (head == null) {
            return false;
        }

        Node current = head;
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    public void display() {
        if (head != null) {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.add(4);

        cll.display(); 

        cll.remove(3);
        cll.display(); 

        cll.remove(5);

        System.out.println(cll.contains(2));
        System.out.println(cll.contains(3));

        cll.add(2);
    }
}

