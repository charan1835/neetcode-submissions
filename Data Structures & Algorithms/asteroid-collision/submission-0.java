class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> list=new Stack<>();
        for(int a:asteroids){
            boolean dust=false;
            while(!list.isEmpty() &&a<0 && list.peek()>0){
                if(list.peek()<-a){
                    list.pop();
                }else if(list.peek()==-a){
                    list.pop();
                    dust=true;
                    break;
                }else{
                    dust=true;
                    break;
                }
                
            }
            if(!dust){
                    list.push(a);
                }
        }
        int []save=new int[list.size()];
        for(int b=list.size()-1;b>=0;b--){
            save[b]=list.pop();
        }
        return save;
    }
}