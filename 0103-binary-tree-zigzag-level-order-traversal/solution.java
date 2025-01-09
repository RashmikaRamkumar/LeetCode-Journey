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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> res=new ArrayList<>();
        boolean flag=true;
        if(root==null)
            return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            ArrayList<Integer> l=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.remove();
                l.add(temp.val);

                if(temp.left !=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
            if(!flag)
                Collections.reverse(l);
            flag=!flag;
            res.add(l);

        }
        return res;
    }
}
