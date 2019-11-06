import java.util.*;
class Node
{
int data;
Node left;
Node right;
Node(int data)
{
    this.data=data;
    left=null;
    right=null;
}
}
class PreOrder
{
    Node root;
    PreOrder()
    {
        root=null;
    }


    static void PreOrder(Node n)
    {
if(n==null)
    return;
else
    System.out.println(n.data);
    PreOrder(n.left);
    PreOrder(n.right);
    }

    void display(){
        PreOrder(root);
    }

    public static void main(String args[])
    {
        //Scanner sc=new Scanner(System.in);
        PreOrder tree = new PreOrder();
         tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
tree.display();
    }

}

