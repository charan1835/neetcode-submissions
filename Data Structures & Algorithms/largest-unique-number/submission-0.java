class Solution {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int n : nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        int max=-1;
        for(int key : freq.keySet()){
            if(freq.get(key)==1){
                max=Math.max(max,key);
            }
        }
        return max;
    }
}
