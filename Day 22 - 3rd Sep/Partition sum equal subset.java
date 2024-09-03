class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return 0;
        }

        int target = sum / 2;
        boolean dp[] = new boolean[target + 1];
        dp[0] = true;  
        for (int i = 0; i < N; i++) {
            for (int j = target; j >= arr[i]; j--) {
                dp[j] = dp[j] || dp[j - arr[i]];
            }
        }
        return dp[target] ? 1 : 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(equalPartition(N,arr)==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}