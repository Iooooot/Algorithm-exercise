package LeetCode100;

/**
 * @author wht
 * @date 2023/6/22 9:14
 */
public class 打家劫舍III {
    static int max = -1;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(1);
        int[] res = dfs(root);
        System.out.println(Math.max(res[0], res[1]));
    }

    private static int[] dfs(TreeNode root) {
        if(root == null){
            return new int[]{0, 0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int rob = left[1] + right[1] + root.val;
        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[]{rob, notRob};
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
