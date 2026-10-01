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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            Queue<Integer> cur=new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode temp=q.poll();
                if(temp!=null)
                {
                    cur.add(temp.val);
                    q.add(temp.right);
                    q.add(temp.left);
                }
            }
            if(!cur.isEmpty())
            {
                ans.add(cur.poll());
            }
        }
        return ans;
        
    }
}