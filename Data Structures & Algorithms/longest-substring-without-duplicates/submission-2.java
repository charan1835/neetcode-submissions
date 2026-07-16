class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int left=0;
        int len=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            len=Math.max(len,i-left+1);
        }
        return len;
    }
}
