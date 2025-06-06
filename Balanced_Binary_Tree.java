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
    public boolean isBalanced(TreeNode root) {
        
        return CalHeight(root)!=-1;  
    }

    private int CalHeight(TreeNode root)
    {
        int height=0;
        if(root==null)
        {
            return 0;
        }

        int left=CalHeight(root.left);
        if(left==-1)
        {
            return -1;
        }
        int right=CalHeight(root.right);
        if(right==-1)
        {
            return -1;
        }

        if(Math.abs(left-right) > 1)
        {
            return -1;
        }

        return 1+Math.max(left,right);
        

    }
}
