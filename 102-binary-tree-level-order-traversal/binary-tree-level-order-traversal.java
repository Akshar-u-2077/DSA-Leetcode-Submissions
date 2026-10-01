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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=1;i<=n;i++){
                TreeNode Temp=q.poll();
                if(Temp!=null)
                {
                    list.add(Temp.val);
                    q.add(Temp.left);
                    q.add(Temp.right);
                }
            }
            if(!list.isEmpty())
            {
               ans.add(list); 
            }
            
        }
        return ans;
    }
}