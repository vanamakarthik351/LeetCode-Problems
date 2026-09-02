class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int ele : prefix){
            int val=ele-k;
            if(map.containsKey(val)){
                count+=map.get(val);
            }
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        return count;
    }
}