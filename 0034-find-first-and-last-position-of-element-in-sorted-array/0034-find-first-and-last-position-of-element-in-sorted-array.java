class Solution {
    public int findRightMost(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int result=-1;
        while(left<=right){
            int mid=right+(left-right)/2;
            if(nums[mid]==target){
                result=mid;
                left=mid+1;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return result;
    }
    public int findLeftMost(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int result=-1;
        while(left<=right){
            int mid=right+(left-right)/2;
            if(nums[mid]==target){
                result=mid;
                right=mid-1;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return result;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        ans[0]=findLeftMost(nums,target);
        ans[1]=findRightMost(nums,target);
        return ans;
    }
}