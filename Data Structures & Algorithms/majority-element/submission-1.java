class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int can=0;
        for(int n: nums){
            if(count==0){
                can=n;
            }
            if(n==can){
                count++;
            }else{
                count--;
            }
        }
        return can;
    }
}