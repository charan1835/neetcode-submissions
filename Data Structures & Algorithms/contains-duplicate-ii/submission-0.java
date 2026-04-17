class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j] && i!=j){
                    int diff=Math.abs(i-j);
                    if(diff<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}