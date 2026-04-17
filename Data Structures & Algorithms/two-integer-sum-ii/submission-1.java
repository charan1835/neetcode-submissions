class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int ryt=numbers.length-1;
        while(left<ryt){
            if(numbers[left]+numbers[ryt]==target){
                return new int[]{left+1,ryt+1};
            }else if(numbers[left]+numbers[ryt]>target){
                ryt--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}
