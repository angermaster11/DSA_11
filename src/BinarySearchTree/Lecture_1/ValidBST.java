package BinarySearchTree.Lecture_1;

public class ValidBST {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean isValidBST(TreeNode root) {
            return isValid(root).isValid;
        }

        public BSTPair isValid(TreeNode root) {
            if (root == null) {
                return new BSTPair();
            }
            BSTPair ldp = isValid(root.left);
            BSTPair rdp = isValid(root.right);
            BSTPair sdp = new BSTPair();
            sdp.max = Math.max(root.val, Math.max(ldp.max, rdp.max));
            sdp.min = Math.min(root.val, Math.min(ldp.min, rdp.min));
            sdp.isValid = ldp.isValid && rdp.isValid && ldp.max < root.val && rdp.min > root.val;
            return sdp;
        }

        class BSTPair {
            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;
            boolean isValid = true;
        }
    }

}
