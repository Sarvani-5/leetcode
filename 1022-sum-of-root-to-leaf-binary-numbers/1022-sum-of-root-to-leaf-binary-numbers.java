/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
      public static int sumRootToLeaf(TreeNode root, int prevSum) {
        if(root == null) {
            return 0;
        }
        prevSum = root.val + 2 * prevSum;
        if(root.left == null && root.right == null) {
            
            return prevSum;
        }
        return sumRootToLeaf(root.left, prevSum) 
                + sumRootToLeaf(root.right, prevSum); 
    }

    public int sumRootToLeaf(TreeNode root) {
         return sumRootToLeaf(root, 0);

    }
}