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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> answer=new ArrayList<String>();

        if(root!=null)
        {
          SearchBinaryTree(root,"",answer);
          return answer;
        }

    return answer;
    }

    public void SearchBinaryTree(TreeNode root,String path,List<String> answer)
    {
        if(root.left==null && root.right==null)
        {
            answer.add(path+root.val);
        }
        if(root.left!=null)
        {
            SearchBinaryTree(root.left,path+root.val+"->",answer);
        }
        if(root.right!=null)
        {
            SearchBinaryTree(root.right,path+root.val+"->",answer);
        }
    }
}
