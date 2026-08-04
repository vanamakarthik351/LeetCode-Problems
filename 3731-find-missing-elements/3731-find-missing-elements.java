class Solution {
    private static boolean contains(int[] arr,int target){
        for(int num:arr){
            if(num==target){
                return true;
            }
        }
        return false;
    }
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            if(!contains(nums,i)){
                list.add(i);
            }
        }
        return list;
    }
}