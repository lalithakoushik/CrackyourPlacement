class Solution {
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
         height(root);
         return d-1;
    }
     int height(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);
        int diameter=left+right+1;
        d=Math.max(d,diameter);
        return Math.max(left,right)+1;
    }
}