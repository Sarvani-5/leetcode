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
    public static int sum = 0;
    public static void calculateSum(TreeNode root, int low, int high){
if (root == null) {
            return;
        }

        if (root.val >= low && root.val <= high) {
            sum += root.val;
            calculateSum(root.left, low, high);
            calculateSum(root.right, low, high);
        } else if (root.val < low) {
            calculateSum(root.right, low, high);
        } else {
            calculateSum(root.left, low, high);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        calculateSum(root,low,high);
        return sum;
    }
}