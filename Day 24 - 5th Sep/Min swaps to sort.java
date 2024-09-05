class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int n = nums.length;
        int count = 0;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];  
            arr[i][1] = i;        
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][1] == i) {
                continue;
            }
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][1];
                count++;
            }
            count--;
        }

        return count;

    }
}