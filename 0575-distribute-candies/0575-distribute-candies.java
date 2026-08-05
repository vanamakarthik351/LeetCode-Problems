class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set=new HashSet<>();
        for(int num:candyType){
            set.add(num);
        }
        int size=candyType.length/2;
        if(size>set.size()){
            return set.size();
        }
        return size;
    }
}