package BinaryTree.Lecture_2;

import java.util.Scanner;

public class BinaryTree {
    class Node {
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc = new Scanner(System.in);
    public BinaryTree(){
        root = CreateTree();
    }

    private Node CreateTree(){
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean();
        if(hlc){
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();
        if(hrc){
            nn.right = CreateTree();
        }
        return nn;
    }

    public void Display(){
        Display(root);
    }
    private void Display(Node nn){
        if(nn==null){
            return;
        }
        String s = "<--"+nn.val+"-->";
        if(nn.left!=null){
            s = nn.val+s;
        }else {
            s = "."+s;
        }
        if(nn.right!=null){
            s = s+nn.val;
        }else {
            s = s+".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);

    }

//    find an item yes or no
    public boolean find(int item){
        return find(root,item);
    }
    private boolean find(Node nn, int item){
        if(nn==null){
            return false;
        }
        if(nn.val == item){
            return true;
        }
        boolean left = find(nn.left,item);
        boolean right = find(nn.right,item);
        return left || right;
    }

    // max
    public int max(){
        return max(root);
    }
    private int max (Node nn){
        if(nn ==null){
            return Integer.MIN_VALUE;
        }
        int left = max(nn.left);
        int right = max(nn.right);
        return Math.max(nn.val,Math.max(left,right));
    }

    // height of tree
    public int height(){
        return height(root);
    }
    private int height(Node nn){
        if(nn==null){
            return 0;
        }
        int lh = height(nn.left);
        int rh = height(nn.right);
        return Math.max(lh,rh) + 1;
    }
    // Traversal
    public void PreOrder(){
        PreOrder(root);
    }
    private void PreOrder(Node nn){
        if(nn==null){
            return;
        }
        System.out.println(nn.val);
        PreOrder(nn.left);
        PreOrder(nn.right);
    }
    public void InOrder(){
        InOrder(root);
    }
    private void InOrder(Node nn){
        if(nn==null){
            return;
        }

        InOrder(nn.left);
        System.out.println(nn.val);
        InOrder(nn.right);
    }
    public void PostOrder(){
        PostOrder(root);
    }
    private void PostOrder(Node nn){
        if(nn==null){
            return;
        }

        PostOrder(nn.left);
        PostOrder(nn.right);
        System.out.println(nn.val);
    }

    // level order traversal ---
    // very important
}
