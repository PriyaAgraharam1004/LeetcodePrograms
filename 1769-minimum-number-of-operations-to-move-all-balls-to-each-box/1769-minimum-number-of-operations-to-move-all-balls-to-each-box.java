class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                char c=boxes.charAt(j);
                if(c=='1'){
                    cnt+=Math.abs(i-j);
                }
            }
            a[i]=cnt;
        }
        return a;
    }
}