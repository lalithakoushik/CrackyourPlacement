class Solution
{
    static String max;
    public static String findMaximumNum(String str, int k)
    {
        max = str; // Initialize max as the original string
        findMaxUtil(str.toCharArray(), k, 0);
        return max;
    }
    private static void findMaxUtil(char[] str, int k, int index) {
        if (k == 0) {
            return; 
        }
        for (int i = index; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[j] > str[i]) {
                    swap(str, i, j);
                    String current = new String(str);
                    if (current.compareTo(max) > 0) {
                        max = current; // Update the max string
                    }
                    findMaxUtil(str, k - 1, i + 1);
                    swap(str, i, j);
                }
            }
        }
    }
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
        