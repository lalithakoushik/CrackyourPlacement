class Solution {
    public int maxPathSum(TreeNode root) {
        int[] max=new int[1];
        max[0]=Integer.MIN_VALUE;
        height(root,max);
        return max[0];
    }
    public int height(TreeNode root,int[] max)
    {
        if(root==null)
        {
            return 0;
        }
        int left=Math.max(0,height(root.left,max));
        int right=Math.max(0,height(root.right,max));
        max[0]=Math.max(max[0],left+right+root.val);
        return root.val+Math.max(left,right);
    }
}