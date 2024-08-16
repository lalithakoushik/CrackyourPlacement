class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum[]=new int[cardPoints.length+1];
        leftSum[0]=0;
        for(int i=1;i<leftSum.length;i++)
        {
            leftSum[i]=leftSum[i-1]+cardPoints[i-1];
        }
        int right[]=new int[cardPoints.length+1];
        right[right.length-1]=0;
        for(int i=right.length-2;i>=0;i--)
        {
            right[i]=right[i+1]+cardPoints[i];
        }
        int i=k;
        int j=right.length-1;
        int ans=Integer.MIN_VALUE;
        while(i>=0)
        {
            if(leftSum[i]+right[j]>=ans)
            {
                ans=leftSum[i]+right[j];
            }
            i--;
            j--;
        }
        return ans;
    }
}