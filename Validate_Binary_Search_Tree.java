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

 import java.lang.*;
class Solution {

    public boolean isValidBST(TreeNode root) {

        return Validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }

    private boolean Validate(TreeNode root,long min,long max)
    {
        
        if(root==null)
        {
            return true;
        }
        if(root.val<=min || root.val>=max)
        {
            return false;
          
        }
       return Validate(root.left,min,root.val) && Validate(root.right,root.val,max); 
    }
}
