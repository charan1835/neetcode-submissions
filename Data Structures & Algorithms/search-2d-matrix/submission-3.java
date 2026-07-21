class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int n=matrix.length;
      int m=matrix[0].length;
      int left=0;
      int ryt=m*n-1;
      while(left<=ryt){
        int mid=left+(ryt-left)/2;
        int r=mid/m;
        int c=mid%m;
        int val=matrix[r][c];
        if(val==target){
            return true;
        }else if(val<target){
            left=mid+1;
        }else{
            ryt=mid-1;
        }
      }
      return false;  
    }
}
