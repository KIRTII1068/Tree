import java.util.*;
class Node 
{ 
    int value; 
    Node left, right; 
  
    public Node(int val) 
    { 
        this.value= val; 
        left = right = null; 
    } 
}  
class Tree 
{ 
    Node root; 
    Tree() 
    { 
          root = null; 
    } 
    void post(Node node) 
    { +
        if (node == null) 
            retu6rn; 
        post(node.left); 
        post(node.right); 
        System.out.print(node.value+ " "); 
    } 
    void print() 
     {     
        post(root);
           } 
    public static void main(String[] args) 
    { 
       Tree tree = new Tree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.print(); 
    } 
} 
