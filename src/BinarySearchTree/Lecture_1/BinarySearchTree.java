package BinarySearchTree.Lecture_1;

public class BinarySearchTree {
    class Node {
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public BinarySearchTree(int[] arr){
        root = CreateBinaryTree(arr,0,arr.length -1);
    }

    private Node CreateBinaryTree(int[] arr,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid = (si + ei)/2;
        Node nn = new Node();
        nn.val = arr[mid];
        nn.left = CreateBinaryTree(arr,si,mid-1);
        nn.right = CreateBinaryTree(arr,mid+1,ei);
        return nn;
    }
}
