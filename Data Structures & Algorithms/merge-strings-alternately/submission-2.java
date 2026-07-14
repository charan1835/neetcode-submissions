class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str =new StringBuilder();
        int left=0;
        int ryt=0;
        int n=word1.length();
        int m=word2.length();
        while(left<n||ryt<m){
            if(left<n){
            str.append(word1.charAt(left));
            left++;
            }
            if(ryt<m){
            str.append(word2.charAt(ryt));
            ryt++;
            }
        }
        return str.toString();
    }
}