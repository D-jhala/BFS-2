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
       List<Integer> result = new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();
       if(root==null) return result;
       q.add(root);
       while(!q.isEmpty()){
           Integer temp = null;
           int size = q.size();
           for(int i=0;i<size;i++){
               TreeNode node = q.poll();
               temp=node.val;
               if(node.left!=null)
                   q.add(node.left);
               if(node.right!=null)
                   q.add(node.right);
           }
           result.add(temp);
       }
       return result;
   }
}