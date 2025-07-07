package com.mycompany.tree_ds;

public class Tree_DS {

    public static void main(String[] args) {
        BSTree tree = new BSTree();
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 7);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 4);
        System.out.println("In Order Traversal (left - root - right):");
        tree.traverseInOrder(tree.root);
        System.out.println("");
        System.out.println("Post Order Traversal (left - right - root):");
        tree.traversePostOrder(tree.root);
        System.out.println("");
        System.out.println("Pre Order Traversal (root - left - right):");
        tree.traversePreOrder(tree.root);
        System.out.println("");
        tree.search(tree.root, 1);
    }
}
