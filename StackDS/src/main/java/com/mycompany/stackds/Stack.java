package com.mycompany.stackds;

public class Stack {

    private int top;
    private int[] arr;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }
    //insertion :
    public void push(int data) {
        if (!isFull()) {
            top++;
            arr[top] = data;
        }
    }
    //deletion :
    public int pop() {
        int x = top;
        if (!isEmpty()) {
            top--;
        }
        return arr[x];
    }

    public int peek() {
        if(!isEmpty())
            return arr[top];
        else
            return 0;
    }
    //print Stack :
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        int current = top;
        while (current != -1) {
            System.out.println("");
            System.out.println(arr[current]);
            System.out.print("---");
            current--;
        }
        System.out.println();
    }
    //search by value : 
    public void searchByValue(int data)
    {
        int curr = top;
        while(curr != -1)
        {
            if(arr[curr]==data)
            {
                System.out.println("the data found at the index ("+curr+").");
                return;
            }
            curr--;
        }
        System.out.println("the data is not found at the Stack");
    }
}
