class Solution {
    public boolean hasSameDigits(String s) {
        int digits[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            digits[i]=ch-'0';
        }
        while(digits.length>2){
            int newDigit[]=new int[digits.length-1];
            for(int i=0;i<digits.length-1;i++){
                newDigit[i]=(digits[i]+digits[i+1])%10;
            }
            digits=newDigit;
        }
        return digits[0]==digits[1];
    }
}