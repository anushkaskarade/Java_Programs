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
import java.util.*;
import java.lang.*;

class Solution {
    public int minDepth(TreeNode root) {
        
        int depth=0;

        if(root==null)
        {
            return 0;
        }
        int left=minDepth(root.left);
        int right=minDepth(root.right);

        if(root.left==null)
        {
            return 1+right;
        }

        if(root.right==null)
        {
            return 1+left;
        }

        if(root.left==null && root.right==null)
        {
            return 1+right;
        }

        depth=Math.min(left,right)+1;

        return depth;
    }
}
