class Solution {
    public int maxProduct(int n) {
        int max=Integer.MIN_VALUE;
        int first=0;
        int second=0;
        while(n>0){
            int val=n%10;
            if(val>=first){
                second=first;
                first=val;
            }
            else if(val>second){
                second=val;
            }
            n=n/10;
        }
        return first*second;
    }
}