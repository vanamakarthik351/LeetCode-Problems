class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int num : nums){
            max=Math.max(num,max);
        }
        int res=0;
        for(int num:nums){
            if(num!=max){
                res+=max-num;
            }
        }
        return res;
    }
}