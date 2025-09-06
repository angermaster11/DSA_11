package BinaryTree.Lecture_3;

public class BalanceTree {
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
        public boolean isBalanced(TreeNode root) {
            BalPair self = isBalance(root);
            return self.isBal;
        }

        public BalPair isBalance(TreeNode root) {
            if(root == null) {
                return new BalPair();
            }
            BalPair left = isBalance(root.left);
            BalPair right = isBalance(root.right);
            BalPair self = new BalPair();
            self.height = Math.max(left.height, right.height) + 1;
            boolean state = Math.abs(right.height - left.height) <= 1;
            self.isBal = left.isBal && right.isBal && state;
            return self;
        }

        class BalPair {
            int height = -1;
            boolean isBal = true;
        }
    }

}
