package BinaryTree.Lecture_3;

public class diamter {
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
        public int diameterOfBinaryTree(TreeNode root) {
            return diameter(root);
        }

        public int diameter(TreeNode root) {
            if(root == null) {
                return 0;
            }
            int ld = diameter(root.left);
            int rd = diameter(root.right);
            int sd = height(root.left) + height(root.right) + 2;
            return Math.max(sd, Math.max(ld, rd));
        }

        public int height(TreeNode root) {
            if(root == null) {
                return -1;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }
    }

}
