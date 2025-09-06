package BinaryTree.Lecture_3;
import java.util.*;
public class RightSide {
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
        int max_depth = 0;

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            rightSide(root, 1, list);
            return list;
        }

        public void rightSide(TreeNode root, int curr_level, List<Integer> list) {
            if(root == null) {
                return;
            }
            if(max_depth < curr_level) {
                list.add(root.val);
                max_depth = curr_level;
            }
            rightSide(root.right, curr_level + 1, list);
            rightSide(root.left, curr_level + 1, list);
        }
    }

}
