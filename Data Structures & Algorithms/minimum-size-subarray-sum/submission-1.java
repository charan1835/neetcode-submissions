class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int  sum=0;
         int n=nums.length;
         int minilen = Integer.MAX_VALUE; 
         int left=0;

         for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                minilen=Math.min(minilen,i-left+1);
                sum-=nums[left];
                left++;
            }
         }
         return minilen == Integer.MAX_VALUE? 0:minilen;
    }
}