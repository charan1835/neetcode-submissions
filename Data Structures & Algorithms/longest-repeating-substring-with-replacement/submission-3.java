class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq=new int[26];
        int n=s.length();
        int left=0;
        int max=0;
        int len=0;
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'A']++;
            max=Math.max(max,freq[s.charAt(i)-'A']);
            if((i-left+1)-max>k){
              freq[s.charAt(left)-'A']--;
              left++;  
            }
        len=Math.max(len,i-left+1);
        }
        return len;
    }
}
