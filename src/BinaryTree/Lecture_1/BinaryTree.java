package BinaryTree.Lecture_1;

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

    private void Display(Node nn){
        if(nn == null){
            return;
        }
        String str = "<--"+nn.val+"-->";
        if(nn.left!=null){
            str = nn.left.val+str;
        }else {
            str = "."+str;
        }
        if(nn.right!=null){
            str = str + nn.right.val;
        }else {
            str = str+".";
        }
        System.out.println(str);
        Display(nn.left);
        Display(nn.right);
    }
    public void Display(){
        Display(root);
    }

    public boolean find(int item){
        return find(root,item);
    }
    private boolean find(Node nn, int item){
        if(nn == null){
            return false;
        }
        if(nn.val == item){
            return true;
        }
        boolean left = find(nn.left,item);
        boolean right = find(nn.right,item);
        return left || right;
    }

    public int max(){
        return max(root);
    }
    private int max(Node nn){
        if(nn == null){
            return Integer.MIN_VALUE;
        }
        int lmax = max(nn.left);
        int rmax = max(nn.right);
        return Math.max(nn.val,Math.max(lmax,rmax));
    }

    public int height(){
        return height(root);
    }
    private int height(Node nn){
        if(nn == null){
            return -1;
        }
        int lh = height(nn.left);
        int rh = height(nn.right);
        return Math.max(lh,rh) + 1;
    }
}
