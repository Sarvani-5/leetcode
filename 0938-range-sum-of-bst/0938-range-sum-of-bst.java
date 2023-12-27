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
    static int total = 0;
    public void rec(TreeNode root,int low,int high){
        if(root==null){
            return;
        }
        if(root.val>=low && root.val<=high){
            total+=root.val;
            rec(root.left,low,high);
            rec(root.right,low,high);
        }
        if(root.val<low){
            rec(root.right,low,high);
        }
        else if(root.val>high){
            rec(root.left,low,high);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        total =0;
        rec(root,low,high);
        return total;
    }
}