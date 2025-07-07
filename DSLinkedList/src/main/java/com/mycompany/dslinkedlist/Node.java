package com.mycompany.dslinkedlist;

public class Node {

    int data;
    Node next;
    Node Head;
    Node Tail;
    static int size = 0;

    public Node() {
        this.data = 0;
        this.next = null;
        this.Head = null;
        this.Tail = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public boolean isEmpty() {
        if (Head == null && size == 0) {
            return true;
        } else {
            return false;
        }
    }
    //insertion :
    public void insertAtFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (!isEmpty()) {
            newNode.next = Head;
            Head = newNode;

        } else {
            Head = Tail = newNode;
            newNode.next = null;
        }
        size++;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (!isEmpty()) {
            Tail.next = newNode;
            Tail = newNode;
            newNode.next = null;
        } else {
            Head = Tail = newNode;
            newNode.next = null;
        }
        size++;
    }

    public void insertAtAnyPosition(int pos, int data) {
        Node newNode = new Node();
        newNode.data = data;
        Node curr;
        if (pos > size || pos < 0) {
            System.out.println("position out of range");
            return;
        } else if (pos == 0 || isEmpty()) {
            insertAtFirst(data);
        } else if (pos == size) {
            insertAtLast(data);
        } else {
            curr = Head;
            for (int i = 1; i < pos; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
        size++;
    }
    //Deletion :
    public void deleteFirst() {
        if (isEmpty()) {
            return;
        } else if (size == 1) {
            Head = Tail = null;
            size--;
        } else {
            Head = Head.next;
            size--;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            return;
        } else if (size == 1) {
            Head = Tail = null;
            size--;
        } else {
            Node curr = Head.next;
            Node prev = Head;
            while (curr != Tail) {
                prev = curr;
                curr = curr.next;
            }
            Tail = prev;
            prev.next = null;
            size--;
        }
    }
    
    public void deleteByValue(int value) {
        if (isEmpty()) {
            return;
        } else if (Head.data == value) {
            deleteFirst();
            if (size == 0) {
                Tail = null;
            }
        } else if (Tail.data == value) {
            deleteLast();
        } else {
            Node curr = Head.next;
            Node prev = Head;
            while (curr.data != value && curr != null) {
                prev = curr;
                curr = curr.next;
            }
            if (curr == null) {
                System.out.println("Value does not exist");
                return;
            } else {
                prev.next = curr.next;
                if (Tail == curr) {
                    Tail = prev;
                }
                size--;
            }
        }
    }
    //print Linked List :
    public void printList() {
        Node current = Head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    //Search for Data : 
    public void searchForData(int data)
    {
        Node curr = Head;
        int pos = 0;
        while(curr != null)
        {
            if(curr.data == data)
            {
                System.out.println("the data is found in the Linked List at Position ("+pos+").");
                return;
            }
            curr = curr.next;
            pos++;
        }
        System.out.println("the data is not found in the Linked List.");
    }
}
