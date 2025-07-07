
package com.mycompany.stackds;

public class StackLinkedList {
    Node top;
    static int size;
    
    public StackLinkedList()
    {
        top = null;
        size = 0;
    }
    //insertion:
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    //deletion:
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return 0;
        }
        int value = top.data;
        top = top.next;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return 0;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
    //print:
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        Node current = top;
        while (current != null) {
            System.out.println("");
            System.out.println(current.data);
            System.out.print("---");
            current = current.next;
        }
        System.out.println();
    }
    //search by value : 
    public void searchByValue(int data)
    {
        Node curr = top;
        int pos = size-1;
        while(curr != null)
        {
            if(curr.data==data)
            {
                System.out.println("the data found at the position ("+pos+").");
                return;
            }
            curr = curr.next;
            pos--;
        }
        System.out.println("the data is not found at the Stack");
    }
}
