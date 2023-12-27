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
    static int mx = 0;
    public int rec(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = rec(root.left);
        int r = rec(root.right);
        if(l+r>mx){
            mx = l+r;
        }
        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        mx = 0;
        rec(root);
        return mx;
    }
}