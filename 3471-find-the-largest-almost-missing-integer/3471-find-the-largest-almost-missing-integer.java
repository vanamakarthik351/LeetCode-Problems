class Solution {
    public int largestInteger(int[] nums, int k) {
        if(k==nums.length){
            int max=Integer.MIN_VALUE;
            for(int ele : nums){
                max=Math.max(max,ele);
            }
            return max;
        }
        if(k==1){
            int max=-1;
            Map<Integer,Integer> map=new HashMap<>();
            for(int ele : nums){
                map.put(ele,map.getOrDefault(ele,0)+1);
            }
            for(Map.Entry<Integer,Integer> e : map.entrySet()){
                if(e.getValue()==1){
                    max=Math.max(max,e.getKey());
                }
            }
            return max;
        }
        Map<Integer,Integer> map=new HashMap<>();
        int max=-1;
        int n=nums.length;
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        if(map.get(nums[0])==1){
            max=Math.max(max,nums[0]);
        }
        if(map.get(nums[n-1])==1){
            max=Math.max(max,nums[n-1]);
        }
        return max;
    }
}