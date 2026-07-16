class Solution {
    public static int gcd(int a, int b) {
        a=Math.abs(a);
        b=Math.abs(b);
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int mx=Integer.MIN_VALUE;
        int[] prefixGcd=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
            prefixGcd[i]=gcd(mx,nums[i]);
        }
        Arrays.sort(prefixGcd);
        int i=0;
        int j=nums.length-1;
        long sum=0;
        while(i<j){
            sum+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }
}