package leetcode;

/**
 * @author wht
 * @date 2023/2/6 11:19
 */
public class 计算布尔二叉树的值 {

    public boolean evaluateTree(TreeNode root) {
        if(root.val == 0 || root.val == 1){
            return root.val == 1;
        }
        boolean l = evaluateTree(root.left);
        boolean r = evaluateTree(root.right);
        return root.val == 2 ? l || r : l && r;
    }


    public class TreeNode {
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
