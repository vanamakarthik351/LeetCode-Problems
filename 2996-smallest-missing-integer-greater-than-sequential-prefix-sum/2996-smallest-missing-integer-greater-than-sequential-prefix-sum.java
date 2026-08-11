class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int i=1;
        while(i<nums.length && nums[i]==nums[i-1]+1){
            sum+=nums[i];
            i++;
        }

        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}