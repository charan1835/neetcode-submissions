class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int need[]=new int[128];
        for(char a:t.toCharArray()){
            need[a]++;
        }
        int left=0;
        int ryt=0;
        int req=t.length();
        int start=0;
        int minilen=Integer.MAX_VALUE;
        while(ryt<n){
            char c=s.charAt(ryt);
            if(need[c]>0){
                req--;
            }
            need[c]--;
            ryt++;
            while(req==0){
                if(ryt-left<minilen){
                    minilen=ryt-left;
                    start=left;
                }
            char leftchar=s.charAt(left);
            need[leftchar]++;
            if(need[leftchar]>0){
                req++;
            }
             left++;
            } 
        }
        return minilen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minilen);
    }
}
