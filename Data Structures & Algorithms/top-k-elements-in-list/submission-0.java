class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer>freq=new HashMap<>();
       for(int n : nums){
        freq.put(n, freq.getOrDefault(n, 0)+1);
       }
       List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());

Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

List<Integer> result = new ArrayList<>();

for (int i = 0; i < k; i++) {
    result.add(list.get(i).getKey());
}
return result.stream().mapToInt(Integer::intValue).toArray();

    }
}