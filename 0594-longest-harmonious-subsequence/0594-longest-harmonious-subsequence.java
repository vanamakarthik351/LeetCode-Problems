class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int res=0;
        for(int ele : map.keySet()){
            if(map.containsKey(ele+1)){
                int ans=(map.get(ele)+map.get(ele+1));
                res=Math.max(res,ans);
            }
        }
        return res;
    }
}