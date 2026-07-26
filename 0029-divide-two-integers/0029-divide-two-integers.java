class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long ans=dividend/divisor;
        return ans >= -(Math.pow(2,31)) && ans <=(Math.pow(2,31)-1) ? (int) ans:-1;
    }
}