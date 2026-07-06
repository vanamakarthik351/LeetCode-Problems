class Solution {
    public boolean wordPattern(String pattern, String s) {
        String word[]=s.split(" ");
        if(pattern.length()!=word.length){
            return false;
        }
        Map<Character,String> charToStr=new HashMap<>();
        Map<String,Character> strToChar=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            String str=word[i];
            char ch=pattern.charAt(i);
            if(charToStr.containsKey(ch)){
                if(!charToStr.get(ch).equals(str))
                    return false;
            }
            else{
                charToStr.put(ch,str);
            }
            if(strToChar.containsKey(str)){
                if(strToChar.get(str)!=ch)
                    return false;
            }
            else{
                strToChar.put(str,ch);
            }
        }
        return true;
    }
}