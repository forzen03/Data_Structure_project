
package com.mycompany.stackds;

public class StackDS {

    public static void main(String[] args) {
        //Linked-List-based Stack:
        StackLinkedList sll = new StackLinkedList();
        System.out.println("Stack Linked List:");
        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);
        sll.printStack();
        sll.searchByValue(10);
        System.out.println("pop :" +sll.pop());
        sll.printStack();
        System.out.println("peek (top element) ="+sll.peek());
        
        System.out.println("***********************************************************************");
        //Array-based Stack
        Stack s = new Stack(4);
        System.out.println("Stack Array:");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.printStack();
        s.searchByValue(30);
        System.out.println("pop :" +s.pop());
        s.printStack();
        System.out.println("peek (top element) ="+s.peek());
    }
}
