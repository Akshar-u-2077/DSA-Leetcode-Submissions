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
    public boolean check(long low,long high,TreeNode root)
    {  
        if(root==null)
        {
            return true;
        }
        if(root.val<high && root.val>low)
        {
            return check(low,root.val,root.left)&&check(root.val,high,root.right);
        }
        return false;
    }

    public boolean isValidBST(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        long low=Long.MIN_VALUE;
        long high=Long.MAX_VALUE;
        return check(low,high,root);
    }
}