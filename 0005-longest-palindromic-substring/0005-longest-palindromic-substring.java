class Solution {
    public static boolean isPalindromic(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String longest="";
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                int len=j-i+1;
                if(isPalindromic(s,i,j) && len>maxlen ){
                    longest=s.substring(i,j+1);
                    maxlen=len;
                }
            }
        }
        return longest;
    }
}