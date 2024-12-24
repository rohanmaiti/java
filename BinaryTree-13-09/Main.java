import java.util.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        // input in BST
        Node root = inputBST(null,20);
        // root = inputBST(root, 30);
         inputBST(root, 40);
         inputBST(root, 5);
         inputBST(root, 10);
         inputBST(root, 7);
         inputBST(root, 1);
         printLevelOrder(root);
    }

    public static Node inputBST(Node root,int key){
     if(root == null)
     return new Node(key);
     else if(key > root.data){
        inputBST(root.right , key);
     }
     else{
        inputBST(root.left,key);
     }
     return root;
    }

    public static void printLevelOrder(Node root){
    Queue<Node> q = new LinkedList<>();
    q.offer(root);
    q.offer(null);

    while( !q.isEmpty() )
    {
        Node front = q.poll();
        if(front == null)
        {
            if(q.isEmpty())
            break;
            else
            {
            System.out.println();
            q.offer(null);
            }
        }
        else{
            System.out.print(front.data + " ");
            if(front.left != null)
            q.offer(front.left);
            if(front.right != null)
            q.offer(front.right);
        }
    }
    }
    public static int findMax(Node root){
        while(root.right!=null)
        root = root.right;
        return root.data;
    }
    public static Node deleteNode(Node root,int ele)
    {
        if(root == null) return null;
        if(root.data == ele)
        {
            //0 child node 
            if(root.left == null && root.right == null)
            {
               
                return null;
            }
            //1 child node
            // if leftchild 
            if(root.left != null && root.right == null)
            {
                Node temp = root.left;
                return temp;
            }
            //if rightchild
            if(root.left == null && root.right != null)
            {
                Node temp = root.right;
                return temp;
            }

            //2 child node 
            if(root.left != null && root.right != null)
            {
                 int max = findMax(root.left);
                 root.data = max;
                 root.left = deleteNode(root.left,max);
                 return root;
            }

        }
        else if(ele < root.data)
        {
            root.left = deleteNode(root.left,ele);
            return root;
        }
        else if(ele > root.data)
        {
            root.right = deleteNode(root.right,ele);
            return root;
        }
        return null;
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}