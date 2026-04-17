class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m=nums2.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int target=nums1[i];
            int j=0;
        while(j<m && nums2[j]!=target){
                j++;
            }
            int greater=-1;
            for(int k=j+1;k<m;k++){
                if(nums2[k]>target){
                    greater=nums2[k];
                    break;
                }
            }
            arr[i]=greater;
        }
        return arr;
    }
}