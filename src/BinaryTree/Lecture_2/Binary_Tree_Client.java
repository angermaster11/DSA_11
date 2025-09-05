package BinaryTree.Lecture_2;

public class Binary_Tree_Client {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.find(5));
        System.out.println(bt.height());
        bt.InOrder();
        System.out.println("---------");
        bt.LevelOrder();
        System.out.println("sdfgh");
        System.out.println(bt.LevelOrderTraversal());
    }
}
