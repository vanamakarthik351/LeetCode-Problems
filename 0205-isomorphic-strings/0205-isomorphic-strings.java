class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> charMap=new HashMap<>();
        Map<Character,Character> reverse=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(charMap.containsKey(ch1)){
                if(charMap.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                charMap.put(ch1,ch2);
            }
            if(reverse.containsKey(ch2)){
                if(reverse.get(ch2)!=ch1){
                    return false;
                }
            }
            else{
                reverse.put(ch2,ch1);
            }
        }
        return true;
    }
}