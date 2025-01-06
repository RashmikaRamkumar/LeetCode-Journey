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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> res=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();

        while(true)
        {
            while(root!=null)
            {
                res.push(root);
                root=root.left;
            }
            if(res.isEmpty())
                break;
            root=res.pop();

            arr.add(root.val);
            root=root.right;
        }
        return arr;
        
    }
}
