class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> listset=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> set=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long four=(long)target-(long)nums[i]-(long)nums[j]-(long)nums[k];
                    if(set.contains(four)){
                        List<Integer> list=Arrays.asList((int)four,nums[i],nums[j],nums[k]);
                        Collections.sort(list);
                        listset.add(list);
                    }
                    set.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(listset);
    }
}