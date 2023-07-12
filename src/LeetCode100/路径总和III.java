package LeetCode100;


public class 路径总和III {
    static int res = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.right.right = new TreeNode(11);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(1);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        int targetSum = 8;
        dfs(root,targetSum);
        System.out.println(res);
    }

    private static void dfs(TreeNode root,int targetSum) {
        if(root == null){
            return;
        }
        dfs(root.left,targetSum);
        dfs(root.right,targetSum);
        check(root,0,targetSum);
    }

    private static void check(TreeNode root, int sum, int targetSum) {
        if(sum == targetSum){
            res++;
            return;
        }
        if(root == null){
            return;
        }
        sum += root.val;
        check(root.left,sum,targetSum);
        check(root.right,sum,targetSum);
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
}
