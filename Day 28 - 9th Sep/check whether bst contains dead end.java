class Solution
{
    public static boolean isDeadEnd(Node root)
    {
        return checkDeadEnd(root,1,Integer.MAX_VALUE);
    }
    private static boolean checkDeadEnd(Node node,int min,int max)
    {
        if(node==null)
        {
            return false;
        }
        if(node.left==null && node.right==null)
        {
            if(min==max)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return checkDeadEnd(node.left, min, node.data - 1) || checkDeadEnd(node.right, node.data + 1, max);
    }
}