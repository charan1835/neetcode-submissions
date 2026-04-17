class Solution {
    public int findLucky(int[] arr) {
      HashMap<Integer,Integer>list=new HashMap<>();
      for(int x:arr){
        list.put(x,list.getOrDefault(x,0)+1);
      } 
      int max=-1;
      for(Map.Entry<Integer, Integer> entry : list.entrySet()){
        int key = entry.getKey();
        int value = entry.getValue();
        if(key== value){
            max=Math.max(max,key);
        }
      }
      return max;
    }
}