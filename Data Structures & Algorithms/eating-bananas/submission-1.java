class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int left=1;
        int ryt=0;
        for(int i:piles){
            ryt=Math.max(i,ryt);
        }
        while(left<ryt){
            int mid=left+(ryt-left)/2;
            int hrs=0;
            for(int m:piles){
                hrs+=(m+mid-1)/mid;
            }
            if(hrs<=h){
                ryt=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
