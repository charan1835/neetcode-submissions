class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int cursum=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
            cursum=Math.max(nums[i],cursum+nums[i]);
            max=Math.max(cursum,max);
        }
        return max;
    }
}
