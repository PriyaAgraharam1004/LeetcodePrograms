class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }
        int lucky=-1;
        for(int x:hmap.keySet()){
            if(x==hmap.get(x)){
                lucky= x;
            }
        }
        return lucky;
    }
}