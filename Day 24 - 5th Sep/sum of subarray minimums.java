class Solution {
    public int sumSubarrayMins(int[] arr) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            min=arr[i];
            for(int j=i;j<arr.length;j++)
            {
                min=Math.min(min,arr[j]);
                sum+=min;
            }
        }
        return sum;
    }
}