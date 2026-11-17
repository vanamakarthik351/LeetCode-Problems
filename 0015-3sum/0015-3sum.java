class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> listset=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> list= Arrays.asList(third,nums[i],nums[j]);
                    Collections.sort(list);
                    listset.add(list);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList(listset);
    }
}