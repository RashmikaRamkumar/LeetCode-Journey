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
        List<List<Integer>> l=new ArrayList<>();
        Deque<TreeNode> q=new ArrayDeque<>();
        
        if(root==null)
            return l;
        
        q.offer(root);

        while(!q.isEmpty())
        {
            List<Integer> k=new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.poll();
                k.add(temp.val);
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right); 
            }
            l.add(k);
        }
        return l;
    }
}
