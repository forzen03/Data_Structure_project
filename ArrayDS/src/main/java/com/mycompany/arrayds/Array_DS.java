
package com.mycompany.arrayds;

public class Array_DS {
    private int[] arr;
    private int size;

    public Array_DS(int capacity) {
        arr = new int[capacity];
        size = 0;
    }
//insertion:
public void insert(int data)
{
    if (size == arr.length) {
            System.out.println("Array is full.");
            return;
        }
        arr[size] = data;
        size++;
}
//deletion:
    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }
    //update:
    public void update(int index, int newValue) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index. Cannot update.");
            return;
        }
        arr[index] = newValue;
    }
    //print:
    public void print() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //search:
    public void search(int data) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == data) {
                System.out.println("found");
                return;
            }
        }
        System.out.println("not found");
    }
}