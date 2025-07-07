
package com.mycompany.dsdoublylinkedlist;

public class Node {
    int data;
    Node next;
    Node prev;
    Node Tail;
    Node Head;
    static int size=0;
    
    public Node(){
    this.data=0;
    this.next=null;
    this.prev=null;
    }
    
    public Node(int data){
    this.data=data;
    }
    
    public boolean isEmpty(){
        if(Head==null||size==0)
            return true;
        else
            return false;
                   
    }
    //insertion : 
    public void addFirst(int data){
        Node newNode=new Node();
        newNode.data=data;
        if(isEmpty()){
            Head=Tail=newNode;
            newNode.next=null;
            newNode.prev=null;
        }
        else{
            newNode.next=Head;
            Head.prev=newNode;
            newNode.prev=null;
            Head=newNode;
        }
        size++;
    }
    
    public void addLast(int data){
        Node n = new Node();
        n.data=data;
        if(isEmpty()){
            Head=Tail=n;
            n.next=null;
            n.prev=null;
        }
        else{
            Tail.next=n;
            n.prev=Tail;
            n.next=null;
            Tail=n;
        }
        size++;
    }
    
    public void addAtAny(int pos,int data){
        Node n = new Node();
        n.data=data;
        if(pos<=0||pos>size)
            return;
        else if(isEmpty()){
            Head=Tail=n;
            n.next=null;
            n.prev=null;
        }
        else if (pos==1){
            addFirst(data);
        }
        else if (pos==size){
            addLast(data);
        }
        else{
            Node curr=Head;
            //Search:
            for (int i = 1; i < pos; i++) {
                curr=curr.next;
            }
            n.prev=curr;
            n.next=curr.next;
            curr.next.prev=n;
            curr.next=n;
            size++;
        }
    }
    //Deletion : 
    public void deleteFirst(){
        if(isEmpty())
            return;
        else if(size==1){
            Tail=Head=null;
            size--;
        }
        else{
            Head=Head.next;
            Head.prev=null;
            size--;
        }
    }
    
    public void deleteLast(){
        if(isEmpty())
            return;
        else if(size==1){
            Tail=Head=null;
            size--;
        }
        else{
            Tail=Tail.prev;
            Tail.next=null;
            size--;
        }
    }
    
    public void deleteByValue(int value){
        if(isEmpty())
            return;
        else if(Head.data==value){
            Tail=Head=null;
            size--;
        }
        Node curr=Head.next;
        while(curr!=null&&curr.data!=value){
            curr=curr.next;
        }
        if(curr==null)
            System.out.println("Value Not Found!!");
        else if(curr==Tail){
            deleteLast();
        }
        else{
            curr.next.prev=curr.prev;
            curr.prev.next=curr.next;
            size--;
        }
    }
    //print Linked List :
    public void printList() {
        Node current = Head;
        int x = size;
        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.print("LinkedList: ");
        while (x != 0) {
            System.out.print(current.data + " -> ");
            current = current.next;
            x--;
        }
         System.out.println("");
    }
      public void revPrintList() {
        int x = size;
        Node current = Tail;
        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.print("revers LinkedList: ");
        while (x != 0) {
            System.out.print(current.data + " -> ");
            current = current.prev;
            x--;
        }
        System.out.println("");
    }
    //Search for data :
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


