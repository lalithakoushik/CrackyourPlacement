class BSTIterator {
    private Stack<TreeNode> stack= new Stack<TreeNode>();

    public BSTIterator(TreeNode root) { 
        pushAllLeft(root);
    }
    
    public int next() { 
        TreeNode node= stack.pop();
        pushAllLeft(node.right);    
        return node.val;
    }
    
    public boolean hasNext() {  
        return !stack.isEmpty();
    }

    public void pushAllLeft(TreeNode node){ 
        while(node!= null){
            stack.push(node);
            node= node.left;
        }
    }
}

