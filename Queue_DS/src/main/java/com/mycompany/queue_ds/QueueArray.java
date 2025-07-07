
package com.mycompany.queue_ds;


public class QueueArray {

    int[] queue;
    int front, rear, size, capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    //insertion:
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("is full.");
            return;
        }
        if(isEmpty())
        {
            rear = (rear + 1) % capacity;
            front = (front + 1) % capacity;
            queue[rear] = element;
            size++;
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    }
    //deletion:
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("is empty.");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % capacity;

        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
            System.out.print(" | ");
        }
        System.out.println();
    }
    //search : 
    public void searchByValue(int data)
    {
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            if(queue[index]==data)
            {
                System.out.println("value is found");
                return;
            }
        }
        System.out.println("the value not found");
    }
}
