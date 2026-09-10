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
    private int result;
    private Pair<Integer, Integer> Solve(TreeNode root){
        if(root == null){
            return new Pair<>(0, 0);
        }
        Pair<Integer, Integer> left = Solve(root.left);
        Pair<Integer, Integer> right = Solve(root.right);

        int leftSum = left.getKey();
        int leftCount = left.getValue();

        int rightSum = right.getKey();
        int rightCount = right.getValue();

        int totalSum = leftSum + rightSum + root.val;
        int totalCount = leftCount + rightCount + 1;

        int avg = totalSum / totalCount;

        if(avg == root.val){
            result++;
        }
        return new Pair<>(totalSum, totalCount);
    }
    public int averageOfSubtree(TreeNode root) {
        result = 0;

        Solve(root);

        return result;
    }
}