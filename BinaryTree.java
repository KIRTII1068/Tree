import java.util.*;

public class BinaryTree
{
    class Node
    {
        int data;
        Node right,left;
        Node(int data)
        {
            this.data = data;
            right = null;
            left = null;
        }

    }
    Node root ;
    BinaryTree()
    {
        root = null;
    }
    void insert (int data)
    {
        //System.out.println("*");
        root = insertdata(root,data);
    }
    Node insertdata( Node root,int data )
    { 
        if(root == null)
        {
            //System.out.println("*");
            root = new Node(data);
            return root;
        }
        if(data < root.data)
        {
           root.left = insertdata(root.left,data);
            //System.out.println("*");
        }
        else
        { 
            root.right = insertdata(root.right, data);
            //System.out.println("*");
        }
        return root;
    }
    void print(Node root)
    {
        if(root == null)
        {
            //System.out.println("*");
            return;
        }
            //System.out.println("*");
            print(root.left);
            System.out.println(root.data);
            print(root.right);
    }
    
    void display()
    {
        print(root);
    }
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(2);
        tree.insert(30);
        tree.insert(40);
        tree.insert(5);
        tree.display(); 
    }
}