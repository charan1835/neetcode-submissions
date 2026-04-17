class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int ryt=n-1;
        int lm=0;
        int rm=0;
        int w=0;
        while(left<ryt){
            if(height[left]<height[ryt]){
                lm=Math.max(lm,height[left]);
                w+=lm-height[left];
                left++;
            }else{
                rm=Math.max(rm,height[ryt]);
                w+=rm-height[ryt];
                ryt--;
            }
        }
        return w;
    }
}
