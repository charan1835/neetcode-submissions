class Solution {
    public int longestConsecutive(int[] nums) {
       if (nums.length == 0) return 0;
       Set<Integer> set = new HashSet<>();
       for (int num : nums) set.add(num);
       int longest = 0;
       for(int i=0;i<nums.length;i++){
        if (!set.contains(nums[i] - 1)) {
            int currentNum = nums[i];
            int count = 1;
            while (set.contains(currentNum + 1)) {
                currentNum += 1;
                count++;
            }
            longest = Math.max(longest, count);
        }
       } 
       return longest;
    }
}