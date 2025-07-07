
package com.mycompany.dsdoublylinkedlist;

public class DSDoublyLinkedList {

    public static void main(String[] args) {
        Node l = new Node();
        l.addFirst(40);
        l.addFirst(30);
        l.addFirst(20);
        l.printList();
        l.searchForData(30);
        l.revPrintList();
        
        l.deleteLast();
        l.addFirst(10);
        System.out.println("After Delete the last Node and insert at first:");
        l.printList();
        l.revPrintList();
    }
}
