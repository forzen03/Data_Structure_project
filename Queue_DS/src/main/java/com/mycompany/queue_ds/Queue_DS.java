
package com.mycompany.queue_ds;

public class Queue_DS {

    public static void main(String[] args) {
        QueueArray qa = new QueueArray(5);
        System.out.println("Array based Queue:");
        qa.enqueue(10);
        qa.enqueue(20);
        qa.enqueue(30);
        qa.display();
        qa.searchByValue(20);
        System.out.println("Dequeued: " + qa.dequeue());
        System.out.println("after Dequeued:");
        qa.display();
        
        System.out.println("****************************************************");
        System.out.println("Linked List based Queue:");
        QueueLinkedList ql = new QueueLinkedList();

        ql.enqueue(5);
        ql.enqueue(15);
        ql.enqueue(25);
        ql.display();
        ql.searchByValue(5);
        System.out.println("Dequeued: " + ql.dequeue());
        ql.display();
    }
}
