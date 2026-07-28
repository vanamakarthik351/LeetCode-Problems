class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        char res[]=new char[s.length()];
        int left=0;
        int right=s.length()-1;
        int idx=-1;
        for(int i=0;i<freq.length;i++){
            char ch=(char)('a'+i);
            while(freq[i]>=2){
                res[left++]=ch;
                res[right--]=ch;
                freq[i]-=2;
            }
            if(freq[i]==1){
                idx=i;
            }
            if(left<=right){
                res[left]=(char)('a'+idx);
            }
        }
        return new String(res);
    }
}