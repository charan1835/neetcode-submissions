class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>list=new HashSet<>();
        int left=0;
        int len=0;
        int n=s.length();
        for(int i=0;i<n;i++){
        char c=s.charAt(i);
        while(list.contains(c)){
            list.remove(s.charAt(left));
            left++;
        }
        list.add(s.charAt(i));
        len=Math.max(len,i-left+1);
        }
        return len;
    }
}
