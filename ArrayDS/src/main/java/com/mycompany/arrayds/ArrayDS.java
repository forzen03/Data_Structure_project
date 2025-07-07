

package com.mycompany.arrayds;


public class ArrayDS {

    public static void main(String[] args) {
        Array_DS array = new Array_DS(10);
        array.insert(5);
        array.insert(10);
        array.insert(15);

        array.print();
        array.update(1, 20);
        array.print(); 
        array.search(15);
        array.delete(0);
        array.print();
        array.delete(5);
    }
}
