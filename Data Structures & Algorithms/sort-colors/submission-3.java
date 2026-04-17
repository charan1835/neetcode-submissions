class Solution {
    public void sortColors(int[] nums) {
        int left=0;int mid=0;int ryt=nums.length-1;
        while(mid<=ryt)
        {
            if(nums[mid]==0){
                swap(nums,left,mid);
                left++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,ryt,mid);
                ryt--;
            }
        }
    }
     private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}