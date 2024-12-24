 import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        left = right = null;
        this.data = data;
    }
}
public class Main{
    static Scanner sc = new Scanner(System.in);
    static int idx = -1;
    public static void main(String []args){

    // buildTree using user input     
    // Node root = BuildTree();
    int arr[] = {1,2,3,-1,-1,4,-1,-1,5,6,-1,-1,-1};
    Node root = buildTreeByArray(arr);
    printLevelOrder(root);
    System.out.println();
    System.out.println("heightOfTree is : "+heightOfTree(root));
    System.out.println("No of Nodes in Tree is : "+countNodes(root));
    System.out.println("Sum of All nodes is : "+sumOfNodes(root));

    // Diameter of a Tree
    System.out.println("Diameter of the Tree is "+ diameterOfTree(root).diameter);
    System.out.println("Balance Tree or Not : "+checkBalance(root).status);
    System.out.println("The given Trees are Same : "+ isSameTree(root,root));
    }
    // Build Tree using array
    public static Node buildTreeByArray(int arr[]){
        idx++;
        if(arr[idx] == -1)
        return null;
        
        Node newNode = new Node(arr[idx]);
        newNode.left = buildTreeByArray(arr);
        newNode.right = buildTreeByArray(arr);

        return newNode;
        
    }
    public static Node BuildTree(){
        System.out.println("wating..: ");
        int data = sc.nextInt();
        if(data == -1)
        return null;

        Node root = new Node(data);
        System.out.print("Enter left of "+data+" : ");
        root.left = BuildTree();
        System.out.print("Enter right of "+data+" : ");
        root.right = BuildTree();

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

    static void printPreorder(Node root){
        if(root == null)
        return ;
        System.out.print(root.data+" ");
        printPreorder(root.left);
        printPreorder(root.right);
    }
    static void printInorder(Node root){
        if(root == null)
        return ;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }

    static void printPostorder(Node root){
        if(root == null)
        return ;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data+" ");
    }

    static int heightOfTree(Node root){
        if(root == null)
        return -1;
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight,rightHeight)+1;
    }
    static int countNodes(Node root){
        if(root == null)
        return 0;
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return (leftCount + rightCount + 1);
    }
    static int sumOfNodes(Node root){
        if(root == null)
        return 0;
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

        public static Pair diameterOfTree(Node root){
            Pair p = new Pair();
            if(root == null)
            {
                p.height = 0;
                p.diameter = 0;
                return p;
            }
            Pair leftPair = diameterOfTree(root.left);
            Pair rightPair = diameterOfTree(root.right);           
            p.height = Math.max(leftPair.height,rightPair.height) + 1;
            p.diameter = Math.max(Math.max( leftPair.diameter,rightPair.diameter),leftPair.height + rightPair.height+1); 
            return p;          
        }

        // ** count leave nodes
         int countLeaves(Node node) 
        {
         // Your code 
         if(node == null)
         return 0;
         else if(node.left == null && node.right == null)
         return 1;
         
         int leftCount = countLeaves(node.left);
         int rightCount = countLeaves(node.right);
         return leftCount + rightCount;
        }
        public static Pair2 checkBalance(Node root){
        Pair2 p = new Pair2();
        if(root == null)
        {
            p.height = 0;
            return p;
        }
        Pair2 left = checkBalance(root.left);
        if(!left.status)
        {
            p.status = false;
            return p;
        } 
        Pair2 right = checkBalance(root.right);
        if(!right.status)
        {
            p.status = false;
            return p;
        } 
        if(Math.abs(left.height - right.height) > 1){
           p.status = false;
           return p;
        }
        else{
            p.height = Math.max(left.height , right.height) + 1;
            return p;
        }
    }

      public static boolean isSameTree(Node p, Node q) {
        if(p == null && q == null)
        return true;
        else if ( p == null && q!= null)
        return false;
        else if(p != null && q == null)
        return false;
        boolean left;
        boolean right;
        if(q.data == p.data){
        left = isSameTree(p.left,q.left);
        right = isSameTree(p.right,q.right);
        if(left && right)
        return true;
        else return false;
        }
        return false;
    }

     public static Pair3 checkSumTree(Node root){
        Pair3 p = new Pair3();
        if(root == null)
        {
            p.value = 0;
            return p;
        }
        else if(root.left == null && root.right == null)
        {
            p.value = root.data;
            return p;
        }
        
        Pair3 left = checkSumTree(root.left);
        if(left.status == false)
        return left;
        Pair3 right = checkSumTree(root.right);
        if(right.status == false)
        return right;
        
        if(left.value + right.value == root.data)
        {
            p.value = root.data + left.value + right.value;
            return p;
        }
        else {
            p.value = root.data;
            p.status = false;
            return p;
        }
        
    }
}
class Pair{
    int height;
    int diameter = 0;
}

class Pair2{
    boolean status = true;
    int height;
}
class Pair3{
    int value;
    boolean status = true;
}
