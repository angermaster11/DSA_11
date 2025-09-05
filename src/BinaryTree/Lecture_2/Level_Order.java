package BinaryTree.Lecture_2;
import java.util.*;

public class Level_Order {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return results;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode nn = q.poll();
                temp.add(nn.val);
                if(nn.left!=null){
                    q.add(nn.left);
                }
                if(nn.right!=null){
                    q.add(nn.right);
                }
            }
            results.add(temp);
        }
        return results;
    }
}
