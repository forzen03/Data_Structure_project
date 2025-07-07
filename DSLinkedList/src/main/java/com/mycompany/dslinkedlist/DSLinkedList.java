
package com.mycompany.dslinkedlist;

public class DSLinkedList {

    public static void main(String[] args) {
        Node list = new Node();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.printList();
        
        list.searchForData(10);
        
        list.deleteByValue(20);
        list.printList();
        list.insertAtFirst(40);
        list.printList();
    }
}
