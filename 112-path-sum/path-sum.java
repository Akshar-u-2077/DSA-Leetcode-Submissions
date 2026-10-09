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
    int sum=0;
    public boolean dfs(TreeNode root,int sum,int targetSum)
    {
        if(root==null)
        {
            return false;
        }
        sum+=root.val;
        if(root.left==null && root.right==null)
        {
            if(sum==targetSum)
            {
                return true;
            }
            return false;
        }
        boolean left=dfs(root.left,sum,targetSum);
        boolean right=dfs(root.right,sum,targetSum);
        return left||right;
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root==null && targetSum==0)
        {   
            return false; 
        }
        return dfs(root,sum,targetSum);
        
    }
}