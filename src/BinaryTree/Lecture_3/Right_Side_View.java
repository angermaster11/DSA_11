package BinaryTree.Lecture_3;
import java.util.*;
public class Right_Side_View {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if(root == null){
                return list;
            }
            List<List<Integer>> data = levelOrder(root);
            for(List<Integer> a : data){
                list.add(a.get(a.size() - 1));
            }
            return list;
        }

        public List<List<Integer>> levelOrder(TreeNode root){
            List<List<Integer>> results = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> list = new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode nn = q.poll();
                    list.add(nn.val);
                    if(nn.left!=null){
                        q.add(nn.left);
                    }
                    if(nn.right!=null){
                        q.add(nn.right);
                    }
                }
                results.add(list);
            }
            return results;
        }
    }

}
