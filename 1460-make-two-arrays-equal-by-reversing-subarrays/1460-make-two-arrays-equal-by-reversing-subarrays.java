class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length){
            if(target[i]!=arr[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}