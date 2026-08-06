class Solution {
    public static int productDigits(int n){
        int product=1;
        while(n!=0){
            int last=n%10;
            product*=last;
            n=n/10;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        while(productDigits(n)%t!=0){
            n++;
        }
        return n;
    }
}