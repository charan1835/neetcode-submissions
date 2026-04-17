class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        // Step 1: store all numbers
        for (int num : nums) {
            set.add(num);
        }

        // Step 2: check from 0 to n
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;  
    }
}