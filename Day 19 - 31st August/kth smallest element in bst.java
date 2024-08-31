class Solution {
    public int kthSmallest(TreeNode root, int k) {
        preorder(root, k);
        return ans;
    }
    int i=0;
    int ans=0;
    public void preorder(TreeNode node, int k){
        if(node==null){
            return;
        }
        preorder(node.left, k);
        i++;
        if(i==k){
            ans=node.val;
            return;
        }
        preorder(node.right, k);
    }
}