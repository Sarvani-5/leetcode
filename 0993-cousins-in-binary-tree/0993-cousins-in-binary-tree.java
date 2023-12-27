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
    static TreeNode parent1=null,parent2=null;
    static int level1=0, level2=0;
    static void rec(TreeNode root, int node1, int node2, int level)
    {
         if(root==null)
         {
              return;
         }
         
         if(root.left!=null)
         {
               if(root.left.val==node1)
               {
                    parent1=root;
                    level1= level+1;
               }
               else if(root.left.val==node2)
               {
                    parent2= root;
                    level2= level+1;
               }
         }
         if(root.right!=null)
         {
              if(root.right.val==node1)
              {
                   parent1=root;
                   level1=level+1;
              }
              else if(root.right.val==node2)
              {
                   parent2= root;
                   level2= level+1;
              }
         }
         
         rec(root.left,node1, node2,level+1);
         
         rec(root.right, node1, node2, level+1);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
       if(root==null)
         {
              return false;
         }
         
         parent1=null;
         parent2=null;
         int level=0;
         
         level1=0;
         level2=0;
         
         rec(root, x, y,level);
         
         if(parent1!=parent2 && level1==level2)
         {
              return true;
         }
         else
         {
              return false;
         }

    }
}