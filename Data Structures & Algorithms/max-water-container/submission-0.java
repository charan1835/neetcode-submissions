class Solution {
    public int maxArea(int[] heights) {
      int n=heights.length;
      int left=0;
      int ryt=n-1;
      int water=0;
      while(left<ryt){
        int  max=Math.min(heights[left],heights[ryt]);
        int w=ryt-left;
         water=Math.max(w*max,water);
        if(heights[left]<heights[ryt]){
            left++;
        }else{
            ryt--;
        }
      } 
    return water;
    }
}
