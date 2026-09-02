class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                st.add(nums[i]);
            }
        }
        return st.size();
        
    }
}