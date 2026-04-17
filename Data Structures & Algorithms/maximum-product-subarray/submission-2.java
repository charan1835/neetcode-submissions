class Solution {
    public int maxProduct(int[] nums) {
        int maxpro=nums[0];
        int minpro=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int temppro=maxpro;
            int temmin=minpro;
            maxpro=Math.max(nums[i],Math.max(nums[i]*temppro,nums[i]*temmin));
            minpro=Math.min(nums[i],Math.min(nums[i]*temppro,nums[i]*temmin));
            ans=Math.max(ans,maxpro);
        }
        return ans;
    }
}
