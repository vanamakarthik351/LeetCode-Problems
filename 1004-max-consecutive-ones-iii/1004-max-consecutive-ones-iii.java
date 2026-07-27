class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int zero=0;
        int l=0;
        int r=0;
        while(r<nums.length){
            if(nums[r]==0){
                zero++;
                r++;
                while(zero>k){
                    if(nums[l]==1){
                        l++;
                    }
                    else{
                        zero--;
                        l++;
                    }
                }
            }
            else{
                r++;
            }
            ans=Math.max(ans,r-l);
        }
        return ans;
    }
}