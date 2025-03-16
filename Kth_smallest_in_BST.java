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
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        
        List<Integer> small=new ArrayList<>();
        traversal(root,small);
        return small.get(k-1);
        
    }

    private void traversal(TreeNode root,List<Integer> small)
        {
            if(root==null)
            {
                return;
            }
           traversal(root.left,small);
           small.add(root.val);
           traversal(root.right,small);
        }
}
