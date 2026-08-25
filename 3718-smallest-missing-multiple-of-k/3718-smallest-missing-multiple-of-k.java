class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> ls=new HashSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]%k==0)
            ls.add(nums[i]);
        }
        int mul=k;
       while(ls.contains(mul)){
        mul+=k;
       }
        return mul;
    }
}