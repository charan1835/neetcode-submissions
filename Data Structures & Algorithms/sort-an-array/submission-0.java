class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        mergesort(nums,0,n-1);
        return nums;
    }
    private void mergesort(int arr[],int l,int r){
    if(l>=r)return ;
    int mid=l+(r-l)/2;
    mergesort(arr,l,mid);
    mergesort(arr,mid+1,r);
    merge(arr,l,mid,r);
    }
    private void merge(int arr[],int l,int m,int r){
        int []temp=new int[r-l+1];
        int i=l;
        int j=m+1;
        int k=0;
        while(i<=m&&j<=r){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=m)temp[k++]=arr[i++];
        while(j<=r)temp[k++]=arr[j++];
        for(int x=0;x<temp.length;x++){
            arr[l+x]=temp[x];
        }
    }
}