class GfG {
    int maxLen(int arr[], int n) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLength = i + 1;
            }

            if (sumMap.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - sumMap.get(sum));
            } else {
                sumMap.put(sum, i);
            }
        }

        return maxLength;
    }
}
