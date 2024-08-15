class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> st=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(st.contains(nums[i])) 
                ans.add(nums[i]);
                st.add(nums[i]);
        }
        return ans;
    }
}