class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        int left=0;
        int ryt=n-1;
        int trips=0;
        Arrays.sort(people);
        while(left<=ryt){
            int sum=people[left]+people[ryt];
            if(sum<=limit){
                left++;
            }
            ryt--;
            trips++;
        }
        return trips;
    }
}