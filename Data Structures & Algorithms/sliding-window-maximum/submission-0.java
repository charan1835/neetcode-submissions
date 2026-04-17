class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>set=new ArrayList<>();
        int n=nums.length;
        int left=0;
        if (k > n) return new int[0];
        for(int i=0;i<n;i++){
            list.add(nums[i]);
            if(list.size()==k){
                int max=Integer.MIN_VALUE;
                for(int num: list){
                max=Math.max(max,num);
                }
                set.add(max);
                list.remove(0);
            }
        }
        int arr[]=new int[set.size()];
        for(int i=0;i<set.size();i++){
            arr[i]=set.get(i);
        }
        return arr;
    }

}
