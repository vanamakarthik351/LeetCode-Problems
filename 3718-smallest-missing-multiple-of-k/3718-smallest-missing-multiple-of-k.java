class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int mul=1;
        for(int ele : nums){
            set.add(ele);
        }
        int mult=k;
        while(set.contains(mult)){
            mult+=k;
        }
        return mult;
    }
}