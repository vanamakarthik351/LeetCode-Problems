class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int first=0;
        int last=m*n-1;
        while(first<=last){
            int mid=first+(last-first)/2;
            int row=mid/n;
            int col=mid%n;
            int newmid=matrix[row][col];
            if(target==newmid){
                return true;
            }
            else if(target<newmid){
                last=mid-1;
            }else{
                first=mid+1;
            }
        }
        return false;
    }
}