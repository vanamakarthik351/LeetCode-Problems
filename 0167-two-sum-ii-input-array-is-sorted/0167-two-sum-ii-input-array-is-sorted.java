class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int second=target-numbers[i];
            if(map.containsKey(second)){
                return new int[]{map.get(second)+1,i+1};
            }
            map.put(numbers[i],i);
        }
        return new int[]{};
    }
}