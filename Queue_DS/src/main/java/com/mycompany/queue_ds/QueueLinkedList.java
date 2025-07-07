
package com.mycompany.queue_ds;


public class QueueLinkedList {

    Node rear = null;
    Node front = null;
    int size = 0;
    //inesrtion:
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            rear = front =  newNode;
            newNode.next = null;
        } else {
            newNode.next = rear.next;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    //deletion:
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("is empty.");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (size == 1) {
            rear = null;
        }
        size--;
        return value;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    //print Queue :
    public void display() {
        if (isEmpty()) {
            System.out.println("is empty.");
            return;
        }
        System.out.print("Queue: ");
        Node current = front;
        while(current != null)
        {
            System.out.print(current.data + " ");
            System.out.print(" | ");
            current = current.next;
        }
        System.out.println();
    }
    //search : 
    public void searchByValue(int data)
    {
        Node curr = front;
        while(curr != null)
        {
            if(curr.data == data)
            {
                System.out.println("the value found");
                return;
            }
            curr = curr.next;
        }
        System.out.println("the value not found");
    }
}
