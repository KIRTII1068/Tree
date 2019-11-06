import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class InOrder
{
Node root;
InOrder()
{
    root=null;
}
static void insert(Node n)
{
    if(n==null)
    return;
    else
    insert(n.left);
    System.out.println(n.data+" ");
    insert(n.right);
}
void display()
{
    insert(root);
}
public static void main(String args[])
{
    InOrder tree = new InOrder();
         tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
       tree.display();
    }
}