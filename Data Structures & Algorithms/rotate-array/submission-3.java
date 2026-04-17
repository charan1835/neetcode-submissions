class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int m=k%n;
        int temp[]=new int[n];
        int o=0;
        for(int j=n-m;j<n;j++){
            temp[o++]=nums[j];
        }
        for(int j=0;j<n-m;j++){
            temp[o++]=nums[j];
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}