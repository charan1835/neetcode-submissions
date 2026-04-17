class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        int left=0;
        int ryt=n-1;
        while(ryt-left+1>k){
            if(Math.abs(arr[left]-x)>Math.abs(arr[ryt]-x)){
                left++;
            }else{
                ryt--;
            }
        }
        for(int i=left;i<=ryt;i++){
            list.add(arr[i]);
        }
        return list;

    }
}