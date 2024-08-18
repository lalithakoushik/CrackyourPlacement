class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) return 0; 
        if (n == 1) return 1; 
        
        int l2 = 0, l3 = 0, l5 = 0; 
        int[] k = new int[n];
        k[0] = 1;
        
        for (int i = 1; i < n; i++) {
            k[i] = Math.min(k[l2] * 2, Math.min(k[l3] * 3, k[l5] * 5));
            
            if (k[i] == k[l2] * 2) l2++;
            if (k[i] == k[l3] * 3) l3++;
            if (k[i] == k[l5] * 5) l5++;
        }
        
        return k[n - 1];
    }
}