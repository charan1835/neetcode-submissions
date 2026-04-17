class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m)return false;
        int []freq1=new int[26];
        int []freq2=new int[26];
        for(char ch:s1.toCharArray()){
            freq1[ch-'a']++;
        }
        for(int i=0;i<m;i++){
            freq2[s2.charAt(i)-'a']++;
            if(i>=n){
                freq2[s2.charAt(i-n)-'a']--;
            }
            if(ArrayEqual(freq1,freq2)){
                return true;
            }
        }
        return false;
        
    }
    private boolean ArrayEqual(int []a,int []b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
            
        }
        return true;
    }
}
