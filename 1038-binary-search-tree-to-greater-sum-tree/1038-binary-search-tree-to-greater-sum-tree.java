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
class Solution 
{
    static int sum=0;
    
    static void GST(TreeNode root)
    {
           if(root==null)
           {
                return ;
           }
        
          GST(root.right);
        
          root.val= root.val+ sum;
        
          sum =  root.val;
        
          GST(root.left);
        
    }
    public TreeNode bstToGst(TreeNode root) {
        
        sum=0;
        
           GST(root);
        
        return root;
    }
}

