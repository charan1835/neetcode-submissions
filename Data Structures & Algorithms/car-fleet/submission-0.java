class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int m=speed.length;
        double cars[][]=new double[n][2];
        int count=0;
        double maxtym=0;
         for(int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        for(int i=0;i<n;i++){
            double tym=cars[i][1];
            if(tym>maxtym){
                maxtym=tym;
                count++;
            }
        }
        return count;
    }
}