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
    public int maxDepth(TreeNode root) {
        
        int depth=0;
        if(root==null)
        {
            return depth;
        }

        int left=maxDepth(root.left);
        int right=maxDepth(root.right);

        depth= Math.max(left,right)+1;
        return depth;

    }
}
