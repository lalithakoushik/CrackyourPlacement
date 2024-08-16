class Solution
{
    static int missingNumber(int arr[], int size)
    {
        int mx = Integer.MIN_VALUE;
        
            for (int i = 0; i < size; i++) {
            if (arr[i] <= 0) {
                arr[i] = 0;
            }
            mx = Math.max(mx, arr[i]);
        }
        
        mx = mx + 1;
        
                for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                int ind = (arr[i] % mx) - 1;
                if (ind < size && ind >= 0) {
                    arr[ind] += mx;
                }
            }
        }
        
                for (int i = 0; i < size; i++) {
            if (arr[i] < mx) {
                return i + 1;
            }
        }
        
        return size + 1;
    }
    
}