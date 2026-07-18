class Solution {
    public static int gcd(int a , int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return Math.abs(a);
    }
    public int findGCD(int[] nums) {
        int mx=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        int res=gcd(mx,min);
        return res;
    }
}