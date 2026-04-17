class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int nwlen=n*2;
        int arr[]=new int[nwlen];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[i];
        }
        return arr;
    }
}