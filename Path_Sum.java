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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root==null)
        {
            return false;
        }
        if(root.left==null && root.right==null)
        {
            return target==root.val;
        }

        boolean left=hasPathSum(root.left,target-root.val);
        boolean right=hasPathSum(root.right,target-root.val);

        return left || right;
    }


 
}
