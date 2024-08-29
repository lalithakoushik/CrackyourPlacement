class Solution
{
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        if(root==null)
        {
            return 0;
        }
        int count=0;
        if(root.data>=l && root.data<=h)
        {
            return 1 + getCount(root.left,l,h) + getCount(root.right,l,h);
        }
        else if(root.data<l)
        {
            return getCount(root.right,l,h);
        }
        return getCount(root.left,l,h);
    }
}
