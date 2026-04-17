class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i:nums1){
            list.add(i);
        }
        for(int i:nums2){
            list.add(i);
        }
        Collections.sort(list);
        int s=list.size();
        if(s%2!=0){
            return list.get(s/2);
        }else{
            return (list.get(s/2-1)+list.get(s/2))/2.0;
        }
    }
}
