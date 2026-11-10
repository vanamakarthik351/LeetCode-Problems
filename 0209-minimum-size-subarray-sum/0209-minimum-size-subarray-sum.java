class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                int len=r-left+1;
                min=Math.min(len,min);
                sum-=nums[left];
                left++;
            }
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}