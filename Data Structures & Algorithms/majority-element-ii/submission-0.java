class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
       
        for(int i=0;i<n;i++){
            int can=nums[i];
             int count=0;
            for(int j=i;j<n;j++){
                if(can==nums[j]&&!list.contains(can)){
                    count++;
                }
            }
            if(count>n/3){
                list.add(nums[i]);
            }
        }
        return list;
    }
}