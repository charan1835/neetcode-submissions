class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0;
        int ryt=0;
        int avg=k*threshold;
        int count=0;
        int sum=0;
        while(ryt<arr.length){
            sum+=arr[ryt];
            if(ryt-left+1==k){
                if(sum>=avg){
                    count++;
                }
                sum-=arr[left];
                left++;
            }
            ryt++;
        }
        return count;
        
    }
}