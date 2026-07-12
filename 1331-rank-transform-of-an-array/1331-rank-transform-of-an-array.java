class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] result=new int[arr.length];
        int temp[]=arr.clone();
        Arrays.sort(temp);
        Map<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int ele:temp){
            if(!map.containsKey(ele)){
                map.put(ele,rank);
                rank++;
            }
        }
        int i=0;
        for(int ele : arr){
            result[i]=map.get(arr[i]);
            i++;
        }
        return result;
    }
}