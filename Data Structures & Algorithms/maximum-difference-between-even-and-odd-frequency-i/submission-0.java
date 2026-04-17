class Solution {
    public int maxDifference(String s) {
        int freq[]=new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int f:freq){
            if(f>0){
                if(f%2==1){
                    max=Math.max(max,f);
                }else{
                    min=Math.min(min,f);
                }
            }
        }
        return max-min;
    }
}