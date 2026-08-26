class Solution {
    public String firstPalindrome(String[] words) {
        String s="";
        for(String word:words){
            if(ispalind(word)){
                return word;
            }
        }
        return s;
    }
    public boolean ispalind(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}