
package com.mycompany.tree_ds;

public class BSTree {
    Node root;
    
    public BSTree()
    {
        root = null;
    }
    
    //insertion:
    public Node insert(Node root,int data)
    {
        //if parent Node is null
        if(root == null)
        {
            Node n = new Node(data);
            root = n;
            root.left=null;
            root.right=null;
            return (n);
        }
        if(data < root.data)
        {
            root.left = insert(root.left,data);
        }
        if(data > root.data)
        {
            root.right = insert(root.right, data);
        }
        return root;
    }
    //deletion :
    public int smallestData(Node n)
    {
        int min = n.data;
        while(n.left != null)
        {
            n = n.left;
            min = n.data;
        }
        return min;
    }
    public Node delete(Node root,int data)
    {
        if(data < root.data)
        {
            root.left = delete(root.left,data);
        }
        else if(data > root.data)
        {
            root.right = delete(root.right, data);
        }
        else
        {
            //one children
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            //two children
            root.data = smallestData(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    //left root right
    public void traverseInOrder(Node root) {
        if (root != null) {
            traverseInOrder(root.left);
            System.out.print(root.data + " ");
            traverseInOrder(root.right);
        }
    }
    //left right root
    public void traversePostOrder(Node root) {
        if (root != null) {
            traversePostOrder(root.left);
            traversePostOrder(root.right);
            System.out.print(root.data + " ");

        }
    }
    //root left right
    public void traversePreOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            traversePreOrder(root.left);
            traversePreOrder(root.right);
        }
    }
    //Search if the data is exist or not :
    public void search(Node root, int data) {
        Node curr = root;
        while (curr != null && curr.data != data) {
        if (data < curr.data) {
            curr = curr.left;
        } else {
            curr = curr.right;
        }
    }
    if(curr != null)
            System.out.println("the data is found");
    else
            System.out.println("the data is Not found");
    }
}
