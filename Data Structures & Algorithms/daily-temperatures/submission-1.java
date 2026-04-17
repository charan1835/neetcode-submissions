class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer>list=new Stack<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            while(!list.isEmpty()
            &&temperatures[i]>temperatures[list.peek()]){
                int prev=list.pop();
                ans[prev]=i-prev;
            }
            list.push(i);
        }
        return ans;

    }
}
