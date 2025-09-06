package BinaryTree.Lecture_3;

public class Diamter_Optimized {
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
            DiaPair dp = diameter(root);
            return dp.diameter;
        }

        public DiaPair diameter(TreeNode root) {
            if(root == null) {
                return new DiaPair();
            }
            DiaPair ldp = diameter(root.left);
            DiaPair rdp = diameter(root.right);
            DiaPair sdp = new DiaPair();
            sdp.height = Math.max(ldp.height, rdp.height) + 1;
            int sd = ldp.height + rdp.height + 2;
            sdp.diameter = Math.max(sd, Math.max(ldp.diameter, rdp.diameter));
            return sdp;
        }

        class DiaPair {
            int height = -1;
            int diameter = 0;
        }
    }

}
