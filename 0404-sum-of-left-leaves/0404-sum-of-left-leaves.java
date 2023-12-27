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
    static int sum = 0;
    public void sumleaves(TreeNode root,char dir){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null && dir=='l'){
            sum+=root.val;
        }
        sumleaves(root.left,'l');
        sumleaves(root.right,'r');
    }
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        sumleaves(root,'r');
        return sum;
    }
}